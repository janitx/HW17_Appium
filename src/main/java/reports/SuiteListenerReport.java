package reports;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.Reporter;

public class SuiteListenerReport implements ISuiteListener {

    private static final Logger logger = LogManager.getLogger(SuiteListenerReport.class);

    public void onStart(ISuite suite) {
        String message = String.format("SuiteListener.onStart() -> %s", suite.getName());
        Reporter.log(message);
        logger.info(message);
    }

    public void onFinish(ISuite suite) {
        String message = String.format("SuiteListener.onFinish() -> %s", suite.getName());
        Reporter.log(message);
        logger.info(message);
    }
}
