/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 19 10:25:02 GMT 2022
 */

package sg.edu.nus.comp.cs4218.impl.app;

import org.evosuite.runtime.EvoRunnerJUnit5;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.api.extension.RegisterExtension;
import sg.edu.nus.comp.cs4218.Environment;

import java.io.*;
import java.util.concurrent.TimeUnit;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static sg.edu.nus.comp.cs4218.testutils.TestStringUtils.STRING_NEWLINE;

@SuppressWarnings("PMD")
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class GrepApplication_ESTest extends GrepApplication_ESTest_scaffolding {
    @RegisterExtension
    static EvoRunnerJUnit5 runner = new EvoRunnerJUnit5(GrepApplication_ESTest.class);

    @AfterEach
    public void reset() {
        Environment.resetCurrentDirectory();
    }

    @DisabledOnOs(OS.WINDOWS)
    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test00() throws Throwable {
        GrepApplication grepApplication0 = new GrepApplication();
        Boolean boolean0 = Boolean.FALSE;
        String[] stringArray0 = new String[2];
        stringArray0[0] = "(standard input): ";
        stringArray0[1] = "";
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        Boolean boolean1 = Boolean.TRUE;
        String string0 = grepApplication0.grepFromFileAndStdin("Invalid pattern syntax", boolean0, boolean1, boolean0, pipedInputStream0, stringArray0);
        assertEquals("\n", string0);
    }

    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test01() throws Throwable {
        GrepApplication grepApplication0 = new GrepApplication();
        Boolean boolean0 = Boolean.FALSE;
        InputStream inputStream0 = InputStream.nullInputStream();
        String[] stringArray0 = new String[4];
        stringArray0[0] = ".";
        stringArray0[1] = "Invalid pattern syntax";
        stringArray0[2] = "Null Pointer Exception";
        stringArray0[3] = ".";
        File file0 = MockFile.createTempFile("Invalid pattern syntax", "L^7");
        MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0);
        grepApplication0.run(stringArray0, inputStream0, mockFileOutputStream0);
        PushbackInputStream pushbackInputStream0 = new PushbackInputStream(inputStream0);
        Boolean boolean1 = Boolean.TRUE;
        String string0 = grepApplication0.grepFromStdin(".", boolean0, boolean1, boolean1, pushbackInputStream0);
        assertEquals("(standard input): 0" + STRING_NEWLINE, string0);
    }

    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test02() throws Throwable {
        GrepApplication grepApplication0 = new GrepApplication();
        Boolean boolean0 = Boolean.valueOf("");
        byte[] byteArray0 = new byte[5];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        try {
            grepApplication0.grepFromStdin("|*+6q>=Fo~Vq%V", boolean0, boolean0, boolean0, byteArrayInputStream0);
            fail("Expecting exception: Exception");

        } catch (Exception e) {
            //
            // grep: Invalid regular expression supplied
            //
            verifyException("sg.edu.nus.comp.cs4218.impl.app.GrepApplication", e);
        }
    }

    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test03() throws Throwable {
        GrepApplication grepApplication0 = new GrepApplication();
        Boolean boolean0 = Boolean.TRUE;
        InputStream inputStream0 = InputStream.nullInputStream();
        try {
            grepApplication0.grepFromFileAndStdin("sg.edu.nus.comp.cs4218.exception.ShellException", boolean0, boolean0, boolean0, inputStream0, (String[]) null);
            fail("Expecting exception: Exception");

        } catch (Exception e) {
            //
            // grep: Null Pointer Exception
            //
            verifyException("sg.edu.nus.comp.cs4218.impl.app.GrepApplication", e);
        }
    }

    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test04() throws Throwable {
        GrepApplication grepApplication0 = new GrepApplication();
        Boolean boolean0 = Boolean.FALSE;
        byte[] byteArray0 = new byte[9];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1489), (byte) 26);
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
        try {
            grepApplication0.grepFromStdin("Null Pointer Exception", boolean0, boolean0, boolean0, sequenceInputStream0);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // arraycopy: source index -1489 out of bounds for byte[9]
            //
            verifyException("java.io.ByteArrayInputStream", e);
        }
    }

    @DisabledOnOs(OS.WINDOWS)
    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test05() throws Throwable {
        GrepApplication grepApplication0 = new GrepApplication();
        Boolean boolean0 = Boolean.FALSE;
        Boolean boolean1 = Boolean.TRUE;
        String[] stringArray0 = new String[5];
        stringArray0[0] = "Pattern should not be empty.";
        stringArray0[1] = "Pattern should not be empty.";
        stringArray0[2] = "*I_iqI-";
        stringArray0[3] = "Null Pointer Exception";
        stringArray0[4] = "*I_iqI-";
        String string0 = grepApplication0.grepFromFiles("*I_iqI-", boolean0, boolean0, boolean1, stringArray0);
        assertEquals("\n", string0);
    }

    @DisabledOnOs(OS.WINDOWS)
    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test06() throws Throwable {
        GrepApplication grepApplication0 = new GrepApplication();
        Boolean boolean0 = Boolean.FALSE;
        String[] stringArray0 = new String[4];
        stringArray0[0] = "(standard input): ";
        stringArray0[1] = "p";
        stringArray0[2] = "Pattern should not be empty.";
        stringArray0[3] = "Invalid pattern syntax";
        String string0 = grepApplication0.grepFromFiles("ik#-TR7}@(", boolean0, boolean0, boolean0, stringArray0);
        assertEquals("\n", string0);
    }

    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test07() throws Throwable {
        GrepApplication grepApplication0 = new GrepApplication();
        Boolean boolean0 = Boolean.FALSE;
        Boolean boolean1 = Boolean.valueOf(true);
        String[] stringArray0 = new String[1];
        stringArray0[0] = "Invalid pattern syntax";
        String string0 = grepApplication0.grepFromFiles("|(nSpv&>r/CJ)m", boolean0, boolean1, boolean1, stringArray0);
        assertEquals(STRING_NEWLINE, string0);
    }

    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test08() throws Throwable {
        GrepApplication grepApplication0 = new GrepApplication();
        Boolean boolean0 = Boolean.FALSE;
        String[] stringArray0 = new String[6];
        try {
            grepApplication0.grepFromFiles("uT<NN>KcJ-", (Boolean) null, boolean0, boolean0, stringArray0);
            fail("Expecting exception: Exception");

        } catch (Exception e) {
            //
            // grep: Null Pointer Exception
            //
            verifyException("sg.edu.nus.comp.cs4218.impl.app.GrepApplication", e);
        }
    }

    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test09() throws Throwable {
        GrepApplication grepApplication0 = new GrepApplication();
        Boolean boolean0 = Boolean.FALSE;
        byte[] byteArray0 = new byte[1];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-15), (byte) (-15));
        PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
        String[] stringArray0 = new String[4];
        stringArray0[0] = "(standard input): ";
        stringArray0[1] = "p";
        stringArray0[2] = "Pattern should not be empty.";
        stringArray0[3] = "Invalid pattern syntax";
        Boolean boolean1 = Boolean.valueOf(true);
        grepApplication0.run(stringArray0, byteArrayInputStream0, pipedOutputStream0);
        try {
            grepApplication0.grepFromStdin("uT<NN>KcJ-", boolean0, boolean1, boolean1, byteArrayInputStream0);
            fail("Expecting exception: Exception");

        } catch (Exception e) {
            //
            // grep: Could not write to output stream
            //
            verifyException("sg.edu.nus.comp.cs4218.impl.app.GrepApplication", e);
        }
    }

    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test10() throws Throwable {
        GrepApplication grepApplication0 = new GrepApplication();
        Boolean boolean0 = Boolean.FALSE;
        byte[] byteArray0 = new byte[3];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        String[] stringArray0 = new String[0];
        String string0 = grepApplication0.grepFromFileAndStdin(".sBac3yK(t{", boolean0, boolean0, boolean0, byteArrayInputStream0, stringArray0);
        assertEquals("", string0);
    }

    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test11() throws Throwable {
        GrepApplication grepApplication0 = new GrepApplication();
        String[] stringArray0 = new String[1];
        stringArray0[0] = "sWo%`l+1";
        FileDescriptor fileDescriptor0 = new FileDescriptor();
        MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
        DataInputStream dataInputStream0 = new DataInputStream(mockFileInputStream0);
        DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
        MockPrintStream mockPrintStream0 = new MockPrintStream(dataOutputStream0, false);
        try {
            grepApplication0.run(stringArray0, dataInputStream0, mockPrintStream0);
            fail("Expecting exception: Exception");

        } catch (Exception e) {
            //
            // grep: IOException
            //
            verifyException("sg.edu.nus.comp.cs4218.impl.app.GrepApplication", e);
        }
    }

    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test12() throws Throwable {
        GrepApplication grepApplication0 = new GrepApplication();
        String[] stringArray0 = new String[2];
        stringArray0[0] = "";
        stringArray0[1] = "Invalid pattern syntax";
        MockFile mockFile0 = new MockFile((File) null, "Invalid pattern syntax");
        File file0 = MockFile.createTempFile("Invalid pattern syntax", "", (File) mockFile0);
        MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
        FilterOutputStream filterOutputStream0 = new FilterOutputStream((OutputStream) null);
        try {
            grepApplication0.run(stringArray0, mockFileInputStream0, filterOutputStream0);
            fail("Expecting exception: Exception");

        } catch (Exception e) {
            //
            // grep: Pattern should not be empty.
            //
            verifyException("sg.edu.nus.comp.cs4218.impl.app.GrepApplication", e);
        }
    }

    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test13() throws Throwable {
        GrepApplication grepApplication0 = new GrepApplication();
        String[] stringArray0 = new String[0];
        FileDescriptor fileDescriptor0 = new FileDescriptor();
        MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
        MockFile mockFile0 = new MockFile("Could not write to output stream");
        MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
        DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
        try {
            grepApplication0.run(stringArray0, mockFileInputStream0, dataOutputStream0);
            fail("Expecting exception: Exception");

        } catch (Exception e) {
            //
            // grep: Invalid syntax
            //
            verifyException("sg.edu.nus.comp.cs4218.impl.app.GrepApplication", e);
        }
    }

    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test14() throws Throwable {
        GrepApplication grepApplication0 = new GrepApplication();
        String[] stringArray0 = new String[0];
        File file0 = MockFile.createTempFile("Is a directory", "(standard input): ");
        MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0);
        try {
            grepApplication0.run(stringArray0, (InputStream) null, mockFileOutputStream0);
            fail("Expecting exception: Exception");

        } catch (Exception e) {
            //
            // grep: No InputStream and no filenames
            //
            verifyException("sg.edu.nus.comp.cs4218.impl.app.GrepApplication", e);
        }
    }

    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test15() throws Throwable {
        GrepApplication grepApplication0 = new GrepApplication();
        String[] stringArray0 = new String[2];
        stringArray0[0] = "Null Pointer Exception";
        stringArray0[1] = "Null Pointer Exception";
        File file0 = MockFile.createTempFile("Invalid pattern syntax", "sg.edu.nus.comp.cs4218.impl.util.IOUtils");
        MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0);
        grepApplication0.run(stringArray0, (InputStream) null, mockFileOutputStream0);
        assertEquals(0L, file0.length());
    }

    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test16() throws Throwable {
        GrepApplication grepApplication0 = new GrepApplication();
        Boolean boolean0 = Boolean.FALSE;
        byte[] byteArray0 = new byte[1];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-15), (byte) (-15));
        Boolean boolean1 = Boolean.TRUE;
        String string0 = grepApplication0.grepFromStdin("Invalid pattern syntax", boolean1, boolean1, boolean0, byteArrayInputStream0);
        assertEquals("0" + STRING_NEWLINE, string0);
    }

    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test17() throws Throwable {
        GrepApplication grepApplication0 = new GrepApplication();
        Boolean boolean0 = Boolean.TRUE;
        byte[] byteArray0 = new byte[5];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        String string0 = grepApplication0.grepFromStdin("#nMa?%dI:#9eAYUI", boolean0, boolean0, boolean0, byteArrayInputStream0);
        assertEquals("(standard input): 0" + STRING_NEWLINE, string0);
    }

    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test18() throws Throwable {
        GrepApplication grepApplication0 = new GrepApplication();
        Boolean boolean0 = Boolean.FALSE;
        byte[] byteArray0 = new byte[1];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-15), (byte) (-15));
        Boolean boolean1 = Boolean.TRUE;
        String string0 = grepApplication0.grepFromStdin("Invalid pattern syntax", boolean1, boolean0, boolean0, byteArrayInputStream0);
        assertEquals("", string0);
    }

    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test19() throws Throwable {
        Boolean boolean0 = Boolean.FALSE;
        byte[] byteArray0 = new byte[5];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        GrepApplication grepApplication0 = new GrepApplication();
        try {
            grepApplication0.grepFromStdin("", boolean0, boolean0, boolean0, byteArrayInputStream0);
            fail("Expecting exception: Exception");

        } catch (Exception e) {
            //
            // grep: Pattern should not be empty.
            //
            verifyException("sg.edu.nus.comp.cs4218.impl.app.GrepApplication", e);
        }
    }

    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test20() throws Throwable {
        Boolean boolean0 = Boolean.FALSE;
        byte[] byteArray0 = new byte[0];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        GrepApplication grepApplication0 = new GrepApplication();
        try {
            grepApplication0.grepFromStdin("Invalid pattern syntax", boolean0, boolean0, (Boolean) null, byteArrayInputStream0);
            fail("Expecting exception: Exception");

        } catch (Exception e) {
            //
            // grep: Null Pointer Exception
            //
            verifyException("sg.edu.nus.comp.cs4218.impl.app.GrepApplication", e);
        }
    }

    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test21() throws Throwable {
        GrepApplication grepApplication0 = new GrepApplication();
        InputStream inputStream0 = InputStream.nullInputStream();
        Boolean boolean0 = Boolean.valueOf("Is a directory");
        try {
            grepApplication0.grepFromStdin("9Yh", boolean0, (Boolean) null, boolean0, inputStream0);
            fail("Expecting exception: Exception");

        } catch (Exception e) {
            //
            // grep: Null Pointer Exception
            //
            verifyException("sg.edu.nus.comp.cs4218.impl.app.GrepApplication", e);
        }
    }

    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test22() throws Throwable {
        GrepApplication grepApplication0 = new GrepApplication();
        Boolean boolean0 = Boolean.TRUE;
        byte[] byteArray0 = new byte[5];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        try {
            grepApplication0.grepFromStdin("(pv-_d>u=", (Boolean) null, boolean0, boolean0, byteArrayInputStream0);
            fail("Expecting exception: Exception");

        } catch (Exception e) {
            //
            // grep: Null Pointer Exception
            //
            verifyException("sg.edu.nus.comp.cs4218.impl.app.GrepApplication", e);
        }
    }

    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test23() throws Throwable {
        Boolean boolean0 = Boolean.FALSE;
        InputStream inputStream0 = InputStream.nullInputStream();
        GrepApplication grepApplication0 = new GrepApplication();
        try {
            grepApplication0.grepFromStdin((String) null, boolean0, boolean0, boolean0, inputStream0);
            fail("Expecting exception: Exception");

        } catch (Exception e) {
            //
            // grep: Null Pointer Exception
            //
            verifyException("sg.edu.nus.comp.cs4218.impl.app.GrepApplication", e);
        }
    }

    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test24() throws Throwable {
        GrepApplication grepApplication0 = new GrepApplication();
        try {
            grepApplication0.grepFromStdin("Invalid pattern syntax", (Boolean) null, (Boolean) null, (Boolean) null, (InputStream) null);
            fail("Expecting exception: Exception");

        } catch (Exception e) {
            //
            // grep: Null Pointer Exception
            //
            verifyException("sg.edu.nus.comp.cs4218.impl.app.GrepApplication", e);
        }
    }

    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test25() throws Throwable {
        GrepApplication grepApplication0 = new GrepApplication();
        Boolean boolean0 = Boolean.FALSE;
        String[] stringArray0 = new String[4];
        try {
            grepApplication0.grepFromFiles("Null Pointer Exception", boolean0, boolean0, boolean0, stringArray0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sg.edu.nus.comp.cs4218.impl.app.GrepApplication", e);
        }
    }

    @DisabledOnOs(OS.WINDOWS)
    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test26() throws Throwable {
        GrepApplication grepApplication0 = new GrepApplication();
        Boolean boolean0 = Boolean.FALSE;
        byte[] byteArray0 = new byte[1];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-15), (byte) (-15));
        Boolean boolean1 = Boolean.TRUE;
        String[] stringArray0 = new String[4];
        stringArray0[0] = "(standard input): ";
        stringArray0[1] = "p";
        stringArray0[2] = "Pattern should not be empty.";
        stringArray0[3] = "Invalid pattern syntax";
        String string0 = grepApplication0.grepFromFileAndStdin("aIxTM(pINg(V7((W$gk", boolean0, boolean1, boolean1, byteArrayInputStream0, stringArray0);
        assertEquals("\n", string0);
    }

    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test27() throws Throwable {
        GrepApplication grepApplication0 = new GrepApplication();
        Boolean boolean0 = Boolean.FALSE;
        String[] stringArray0 = new String[2];
        try {
            grepApplication0.grepFromFiles("", boolean0, boolean0, boolean0, stringArray0);
            fail("Expecting exception: Exception");

        } catch (Exception e) {
            //
            // grep: Pattern should not be empty.
            //
            verifyException("sg.edu.nus.comp.cs4218.impl.app.GrepApplication", e);
        }
    }

    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test28() throws Throwable {
        GrepApplication grepApplication0 = new GrepApplication();
        Boolean boolean0 = Boolean.FALSE;
        String[] stringArray0 = new String[6];
        try {
            grepApplication0.grepFromFiles("W2IEW", boolean0, boolean0, (Boolean) null, stringArray0);
            fail("Expecting exception: Exception");

        } catch (Exception e) {
            //
            // grep: Null Pointer Exception
            //
            verifyException("sg.edu.nus.comp.cs4218.impl.app.GrepApplication", e);
        }
    }

    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test29() throws Throwable {
        GrepApplication grepApplication0 = new GrepApplication();
        Boolean boolean0 = Boolean.FALSE;
        String[] stringArray0 = new String[1];
        try {
            grepApplication0.grepFromFiles("Pattern should not be empty.", boolean0, (Boolean) null, boolean0, stringArray0);
            fail("Expecting exception: Exception");

        } catch (Exception e) {
            //
            // grep: Null Pointer Exception
            //
            verifyException("sg.edu.nus.comp.cs4218.impl.app.GrepApplication", e);
        }
    }

    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test30() throws Throwable {
        GrepApplication grepApplication0 = new GrepApplication();
        Boolean boolean0 = Boolean.TRUE;
        String[] stringArray0 = new String[2];
        try {
            grepApplication0.grepFromFiles((String) null, boolean0, boolean0, boolean0, stringArray0);
            fail("Expecting exception: Exception");

        } catch (Exception e) {
            //
            // grep: Null Pointer Exception
            //
            verifyException("sg.edu.nus.comp.cs4218.impl.app.GrepApplication", e);
        }
    }

    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test31() throws Throwable {
        GrepApplication grepApplication0 = new GrepApplication();
        Boolean boolean0 = Boolean.FALSE;
        try {
            grepApplication0.grepFromFiles("Null Pointer Exception", boolean0, boolean0, boolean0, (String[]) null);
            fail("Expecting exception: Exception");

        } catch (Exception e) {
            //
            // grep: Null Pointer Exception
            //
            verifyException("sg.edu.nus.comp.cs4218.impl.app.GrepApplication", e);
        }
    }
}