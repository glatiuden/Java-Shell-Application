/*
 * This file was automatically generated by EvoSuite
 * Thu Mar 17 02:16:29 GMT 2022
 */

package sg.edu.nus.comp.cs4218.impl.app;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Timeout;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import static org.evosuite.runtime.EvoAssertions.*;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.evosuite.runtime.EvoRunnerJUnit5;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.jupiter.api.extension.RegisterExtension;
import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.impl.app.LsApplication;
import sg.edu.nus.comp.cs4218.impl.parser.LsArgsParser;

@SuppressWarnings("PMD")
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class LsApplication_ESTest extends LsApplication_ESTest_scaffolding {
    @RegisterExtension
    static EvoRunnerJUnit5 runner = new EvoRunnerJUnit5(LsApplication_ESTest.class);

    @AfterEach
    public void reset() {
        Environment.resetCurrentDirectory();
    }

    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test0() throws Throwable {
        LsApplication lsApplication0 = new LsApplication();
        Boolean boolean0 = Boolean.TRUE;
        String[] stringArray0 = new String[2];
        stringArray0[0] = "";
        stringArray0[1] = "";
        LsArgsParser lsArgsParser0 = new LsArgsParser();
        Boolean boolean1 = lsArgsParser0.isRecursive();
        lsApplication0.listFolderContent(boolean1, boolean0, stringArray0);
    }

    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test1() throws Throwable {
        LsApplication lsApplication0 = new LsApplication();
        String[] stringArray0 = new String[6];
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        InputStream inputStream0 = InputStream.nullInputStream();
        DataInputStream dataInputStream0 = new DataInputStream(inputStream0);
        // Undeclared exception!
        try {
            lsApplication0.run(stringArray0, dataInputStream0, byteArrayOutputStream0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sg.edu.nus.comp.cs4218.impl.parser.ArgsParser", e);
        }
    }

    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test2() throws Throwable {
        LsApplication lsApplication0 = new LsApplication();
        InputStream inputStream0 = InputStream.nullInputStream();
        try {
            lsApplication0.run((String[]) null, inputStream0, (OutputStream) null);
            fail("Expecting exception: Exception");

        } catch (Exception e) {
            //
            // ls: Null arguments
            //
            verifyException("sg.edu.nus.comp.cs4218.impl.app.LsApplication", e);
        }
    }

    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test3() throws Throwable {
        LsApplication lsApplication0 = new LsApplication();
        String[] stringArray0 = new String[6];
        try {
            lsApplication0.run(stringArray0, (InputStream) null, (OutputStream) null);
            fail("Expecting exception: Exception");

        } catch (Exception e) {
            //
            // ls: OutputStream not provided
            //
            verifyException("sg.edu.nus.comp.cs4218.impl.app.LsApplication", e);
        }
    }

    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test4() throws Throwable {
        LsApplication lsApplication0 = new LsApplication();
        Boolean boolean0 = Boolean.TRUE;
        String[] stringArray0 = new String[3];
        stringArray0[0] = "";
        stringArray0[1] = "Wx11HtB&.a";
        stringArray0[2] = "S;m3";
        String string0 = lsApplication0.listFolderContent(boolean0, boolean0, stringArray0);
        assertNotNull(string0);
    }

    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test5() throws Throwable {
        LsApplication lsApplication0 = new LsApplication();
        LsArgsParser lsArgsParser0 = new LsArgsParser();
        Boolean boolean0 = lsArgsParser0.isRecursive();
        String[] stringArray0 = new String[2];
        stringArray0[0] = "sg.edu.nus.comp.cs4218.impl.app.LsApplication";
        stringArray0[1] = "sg.edu.nus.comp.cs4218.impl.app.LsApplication";
        String string0 = lsApplication0.listFolderContent(boolean0, boolean0, stringArray0);
        assertEquals("", string0);
    }

    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test6() throws Throwable {
        LsApplication lsApplication0 = new LsApplication();
        Boolean boolean0 = Boolean.TRUE;
        String[] stringArray0 = new String[0];
        String string0 = lsApplication0.listFolderContent(boolean0, boolean0, stringArray0);
        assertNotNull(string0);
    }

    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test8() throws Throwable {
        LsApplication lsApplication0 = new LsApplication();
        Boolean boolean0 = Boolean.valueOf("Unexpected error occurred!");
        String[] stringArray0 = new String[0];
        String string0 = lsApplication0.listFolderContent(boolean0, boolean0, stringArray0);
        assertNotNull(string0);
    }
}
