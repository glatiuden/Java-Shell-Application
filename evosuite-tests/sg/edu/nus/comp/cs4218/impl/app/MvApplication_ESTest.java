/*
 * This file was automatically generated by EvoSuite
 * Thu Mar 17 02:13:04 GMT 2022
 */

package sg.edu.nus.comp.cs4218.impl.app;

import org.evosuite.runtime.EvoRunnerJUnit5;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.RegisterExtension;
import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.exception.MvException;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.jupiter.api.Assertions.*;
import static sg.edu.nus.comp.cs4218.impl.util.ErrorConstants.ERR_FILE_NOT_FOUND;

@SuppressWarnings("PMD")
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class MvApplication_ESTest extends MvApplication_ESTest_scaffolding {
    @RegisterExtension
    static EvoRunnerJUnit5 runner = new EvoRunnerJUnit5(MvApplication_ESTest.class);

    @AfterEach
    public void reset() {
        Environment.resetCurrentDirectory();
    }

    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test0() throws Throwable {
        MvApplication mvApplication0 = new MvApplication();
        MockPrintStream mockPrintStream0 = new MockPrintStream("A%J6iXzY");
        String[] stringArray0 = new String[3];
        stringArray0[0] = "A%J6iXzY";
        stringArray0[1] = "A%J6iXzY";
        stringArray0[2] = "A%J6iXzY";
        mvApplication0.run(stringArray0, (InputStream) null, mockPrintStream0);
        assertEquals(3, stringArray0.length);
    }

    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test1() throws Throwable {
        MvApplication mvApplication0 = new MvApplication();
        MockPrintStream mockPrintStream0 = new MockPrintStream("w@=Nu%0V!=");
        String[] stringArray0 = new String[0];
        try {
            mvApplication0.run(stringArray0, (InputStream) null, mockPrintStream0);
            fail("Expecting exception: Exception");

        } catch (Exception e) {
            //
            // mv: Insufficient arguments
            //
            verifyException("sg.edu.nus.comp.cs4218.impl.app.MvApplication", e);
        }
    }

    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test2() throws Throwable {
        MvApplication mvApplication0 = new MvApplication();
        String[] stringArray0 = new String[0];
        try {
            mvApplication0.run(stringArray0, (InputStream) null, (OutputStream) null);
            fail("Expecting exception: Exception");

        } catch (Exception e) {
            //
            // mv: Null Pointer Exception
            //
            verifyException("sg.edu.nus.comp.cs4218.impl.app.MvApplication", e);
        }
    }

    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test3() throws Throwable {
        MvApplication mvApplication0 = new MvApplication();
        Boolean boolean0 = Boolean.TRUE;
        String string0 = mvApplication0.mvFilesToFolder(boolean0, (String) null, (String[]) null);
        assertEquals("No such file or directory", string0);
    }

    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test4() throws Throwable {
        MvApplication mvApplication0 = new MvApplication();
        Boolean boolean0 = Boolean.TRUE;
        String string0 = mvApplication0.mvSrcFileToDestFile(boolean0, "", "");
        assertEquals(ERR_FILE_NOT_FOUND, string0);
    }

    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test5() throws Throwable {
        Future<?> future = executor.submit(new Runnable() {
            @Override
            public void run() {
                MvApplication mvApplication0 = new MvApplication();
                String string0 = null;
                try {
                    string0 = mvApplication0.mvSrcFileToDestFile((Boolean) null, "", "No suchrfile=or directory");
                } catch (MvException e) {
                    e.printStackTrace();
                }
                assertNotNull(string0);
            }
        });
        future.get(4000, TimeUnit.MILLISECONDS);
    }

    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test6() throws Throwable {
        MvApplication mvApplication0 = new MvApplication();
        String string0 = mvApplication0.mvSrcFileToDestFile((Boolean) null, "", (String) null);
        assertNotNull(string0);
    }

    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test7() throws Throwable {
        MvApplication mvApplication0 = new MvApplication();
        MockPrintStream mockPrintStream0 = new MockPrintStream("A%J6iXzY");
        String[] stringArray0 = new String[2];
        stringArray0[0] = "A%J6iXzY";
        stringArray0[1] = "A%J6iXzY";
        mvApplication0.run(stringArray0, (InputStream) null, mockPrintStream0);
        assertEquals(2, stringArray0.length);
    }

    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test8() throws Throwable {
        MvApplication mvApplication0 = new MvApplication();
        String string0 = mvApplication0.mvSrcFileToDestFile((Boolean) null, (String) null, (String) null);
        assertEquals("No such file or directory", string0);
    }
}
