/*
 * This file was automatically generated by EvoSuite
 * Thu Mar 17 02:10:34 GMT 2022
 */

package sg.edu.nus.comp.cs4218.impl.app;

import org.evosuite.runtime.EvoRunnerJUnit5;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.RegisterExtension;

import java.io.ByteArrayInputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.concurrent.TimeUnit;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static sg.edu.nus.comp.cs4218.testutils.TestStringUtils.STRING_NEWLINE;

@SuppressWarnings("PMD")
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class EchoApplication_ESTest extends EchoApplication_ESTest_scaffolding {
    @RegisterExtension
    static EvoRunnerJUnit5 runner = new EvoRunnerJUnit5(EchoApplication_ESTest.class);

    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test0() throws Throwable {
        EchoApplication echoApplication0 = new EchoApplication();
        String[] stringArray0 = new String[6];
        PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
        PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
        try {
            echoApplication0.run(stringArray0, pipedInputStream0, (OutputStream) null);
            fail("Expecting exception: Exception");

        } catch (Exception e) {
            //
            // echo: OutputStream not provided
            //
            verifyException("sg.edu.nus.comp.cs4218.impl.app.EchoApplication", e);
        }
    }

    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test1() throws Throwable {
        EchoApplication echoApplication0 = new EchoApplication();
        String[] stringArray0 = new String[1];
        byte[] byteArray0 = new byte[2];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-37), (byte) (-106));
        MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("IOException", false);
        echoApplication0.run(stringArray0, byteArrayInputStream0, mockFileOutputStream0);
        assertEquals(1, stringArray0.length);
    }

    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test2() throws Throwable {
        EchoApplication echoApplication0 = new EchoApplication();
        String[] stringArray0 = new String[0];
        String string0 = echoApplication0.constructResult(stringArray0);
        assertEquals(STRING_NEWLINE, string0);
    }

    @Test
    @Timeout(value = 4000, unit = TimeUnit.MILLISECONDS)
    public void test3() throws Throwable {
        EchoApplication echoApplication0 = new EchoApplication();
        try {
            echoApplication0.constructResult((String[]) null);
            fail("Expecting exception: Exception");

        } catch (Exception e) {
            //
            // echo: Null arguments
            //
            verifyException("sg.edu.nus.comp.cs4218.impl.app.EchoApplication", e);
        }
    }
}
