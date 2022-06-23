package reports;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Reporter;

public class TestListenerReport implements ITestListener {

    private static final Logger logger = LogManager.getLogger(TestListenerReport.class);

    public void onTestSuccess(ITestResult result) {
        String message = String.format("On test success -> %s.%s()", result.getTestClass().getName(), result.getName());
        logger.info(message);
        Reporter.log(message);
    }

    public void onTestFailure(ITestResult result) {
        String message = String.format("On test failure -> %s.%s()", result.getTestClass().getName(), result.getName());
        logger.error(message);
        Reporter.log(message);
    }

    public void onTestSkipped(ITestResult result) {
        String message = String.format("On test skipped -> %s.%s()", result.getTestClass().getName(), result.getName());
        logger.warn(message);
        Reporter.log(message);
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    public void onStart(ITestContext context) {
    }

    public void onFinish(ITestContext context) {
    }

    public void onTestStart(ITestResult result) {
    }
}
