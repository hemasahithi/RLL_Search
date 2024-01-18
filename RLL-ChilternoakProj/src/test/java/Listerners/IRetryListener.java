package Listerners;


	import org.testng.IRetryAnalyzer;
	import org.testng.ITestResult;

	public class IRetryListener implements IRetryAnalyzer {

	    private static final int MAX_RETRY_COUNT = 1; 
	    private int retryCount = 0;

	    @Override
	    public boolean retry(ITestResult result) {
	        if (retryCount < MAX_RETRY_COUNT) {
	            System.out.println("Retrying test: " + result.getName() + " for the " + (retryCount + 1) + " time.");
	            retryCount++;
	            return true;
	        }
	        return false;
	    }
	}



