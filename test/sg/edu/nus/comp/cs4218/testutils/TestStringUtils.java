package sg.edu.nus.comp.cs4218.testutils;

import java.io.File;

@SuppressWarnings("PMD") // Not required to check for given test from the prof
public class TestStringUtils {
    public static final String STRING_NEWLINE = System.lineSeparator();
    public static final String STRING_CURR_DIR = ".";
    public static final String STRING_PARENT_DIR = "..";
    public static final char CHAR_FILE_SEP = File.separatorChar;
    public static final char CHAR_TAB = '\t';

    private TestStringUtils() {
    }

}
