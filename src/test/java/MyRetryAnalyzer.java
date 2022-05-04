import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetryAnalyzer implements IRetryAnalyzer {

    int counter = 0;
    int retryLimit = 2;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if (counter < retryLimit) {
            counter++;
            return true;
        } else {
            return false;
        }
    }
}
