/**
 * Scaffolding file used to store all the setups needed to run
 * tests automatically generated by EvoSuite
 * Thu Mar 17 02:13:04 GMT 2022
 */

package sg.edu.nus.comp.cs4218.impl.app;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

@SuppressWarnings("PMD")
@EvoSuiteClassExclude
public class MvApplication_ESTest_scaffolding {

    private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone();
    protected static ExecutorService executor;
    @org.junit.jupiter.api.extension.RegisterExtension
    public org.evosuite.runtime.vnet.NonFunctionalRequirementExtension nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementExtension();
    private org.evosuite.runtime.thread.ThreadStopper threadStopper = new org.evosuite.runtime.thread.ThreadStopper(org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


    @BeforeAll
    public static void initEvoSuiteFramework() {
        org.evosuite.runtime.RuntimeSettings.className = "sg.edu.nus.comp.cs4218.impl.app.MvApplication";
        org.evosuite.runtime.GuiSupport.initialize();
        org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100;
        org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000;
        org.evosuite.runtime.RuntimeSettings.mockSystemIn = true;
        org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED;
        org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT();
        executor = Executors.newCachedThreadPool();
        org.evosuite.runtime.classhandling.JDKClassResetter.init();
        setSystemProperties();
        initializeClasses();
        org.evosuite.runtime.Runtime.getInstance().resetRuntime();
    }

    @AfterAll
    public static void clearEvoSuiteFramework() {
        Sandbox.resetDefaultSecurityManager();
        executor.shutdownNow();
        java.lang.System.setProperties((java.util.Properties) defaultProperties.clone());
    }

    public static void setSystemProperties() {

        java.lang.System.setProperties((java.util.Properties) defaultProperties.clone());
    }

    private static void initializeClasses() {
        org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(MvApplication_ESTest_scaffolding.class.getClassLoader(),
                "sg.edu.nus.comp.cs4218.app.MvInterface",
                "sg.edu.nus.comp.cs4218.exception.AbstractApplicationException",
                "sg.edu.nus.comp.cs4218.impl.app.args.MvArguments",
                "sg.edu.nus.comp.cs4218.impl.app.MvApplication",
                "sg.edu.nus.comp.cs4218.exception.MvException",
                "sg.edu.nus.comp.cs4218.impl.util.StringUtils",
                "sg.edu.nus.comp.cs4218.impl.util.FileUtil",
                "sg.edu.nus.comp.cs4218.Environment",
                "sg.edu.nus.comp.cs4218.Application",
                "sg.edu.nus.comp.cs4218.impl.util.FileUtil$InvalidDirectoryException"
        );
    }

    private static void resetClasses() {
        org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(MvApplication_ESTest_scaffolding.class.getClassLoader());

        org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
                "sg.edu.nus.comp.cs4218.impl.app.MvApplication",
                "sg.edu.nus.comp.cs4218.Environment",
                "sg.edu.nus.comp.cs4218.impl.util.StringUtils",
                "sg.edu.nus.comp.cs4218.impl.util.FileUtil",
                "sg.edu.nus.comp.cs4218.impl.app.args.MvArguments",
                "sg.edu.nus.comp.cs4218.exception.AbstractApplicationException",
                "sg.edu.nus.comp.cs4218.exception.MvException",
                "sg.edu.nus.comp.cs4218.impl.util.IOUtils"
        );
    }

    @BeforeEach
    public void initTestCase() {
        threadStopper.storeCurrentThreads();
        threadStopper.startRecordingTime();
        org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler();
        org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode();
        setSystemProperties();
        org.evosuite.runtime.GuiSupport.setHeadless();
        org.evosuite.runtime.Runtime.getInstance().resetRuntime();
        org.evosuite.runtime.agent.InstrumentingAgent.activate();
    }

    @AfterEach
    public void doneWithTestCase() {
        threadStopper.killAndJoinClientThreads();
        org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks();
        org.evosuite.runtime.classhandling.JDKClassResetter.reset();
        resetClasses();
        org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode();
        org.evosuite.runtime.agent.InstrumentingAgent.deactivate();
        org.evosuite.runtime.GuiSupport.restoreHeadlessMode();
    }
}
