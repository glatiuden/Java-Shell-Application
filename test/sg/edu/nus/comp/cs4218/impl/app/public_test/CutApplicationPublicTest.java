package sg.edu.nus.comp.cs4218.impl.app.public_test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sg.edu.nus.comp.cs4218.impl.app.CutApplication;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static sg.edu.nus.comp.cs4218.testutils.TestStringUtils.STRING_NEWLINE;

@SuppressWarnings("PMD") // Not required to check for given test from the prof
public class CutApplicationPublicTest {
    CutApplication cutApplication;

    private String joinStringsByLineSeparator(String... strs) {
        return String.join(STRING_NEWLINE, strs);
    }

    private InputStream generateInputStreamFromStrings(String... strs) {
        return new ByteArrayInputStream(joinStringsByLineSeparator(strs).getBytes(StandardCharsets.UTF_8));
    }

    @BeforeEach
    public void setUp() {
        cutApplication = new CutApplication();
        cutApplication.setStdout(System.out);
    }

    @Test
    void cutFromStdin_NullContent_ThrowsException() {
        int[] ranges = new int[]{1, 2};
        assertThrows(Exception.class, () -> cutApplication.cutFromStdin(false, true, List.of(ranges), null));
    }

    @Test
    void cutFromStdin_SingleLineByCharRange_ReturnCutByLine() throws Exception {
        int[] ranges = new int[]{1, 3};
        InputStream stdin = generateInputStreamFromStrings("hello world");
        String result = cutApplication.cutFromStdin(true, false, List.of(ranges), stdin);
        assertEquals("hel", result);
    }

    @Test
    void cutFromStdin_SingleLineByByteRange_ReturnCutByByte() throws Exception {
        int[] ranges = new int[]{1, 3};
        InputStream stdin = generateInputStreamFromStrings("hello world");
        String result = cutApplication.cutFromStdin(false, true, List.of(ranges), stdin);
        assertEquals("hel", result);
    }

    @Test
    void cutFromStdin_MultipleLinesByCharRange_ReturnCutContentAtEachLineByByte() throws Exception {
        int[] ranges = new int[]{1, 3};
        InputStream stdin = generateInputStreamFromStrings("hello", "world");
        String result = cutApplication.cutFromStdin(true, false, List.of(ranges), stdin);
        assertEquals("hel" + STRING_NEWLINE + "wor", result);
    }

    @Test
    void cutFromStdin_MultipleLinesByByteRange_ReturnCutContentAtEachLineByByte() throws Exception {
        int[] ranges = new int[]{1, 3};
        InputStream stdin = generateInputStreamFromStrings("hello", "world");
        String result = cutApplication.cutFromStdin(false, true, List.of(ranges), stdin);
        assertEquals("hel" + STRING_NEWLINE + "wor", result);
    }

    //Last test case not used since on demand output is implemented using System.out.println(), no exception is thrown.

}
