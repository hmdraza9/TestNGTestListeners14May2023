import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListenerClass implements ITestListener {

    int testCaseCount = 0;
    int testCasePassCount = 0;
    int testCaseFailCount = 0;

    @Override
    public void onFinish(ITestContext Result) {
        System.out.println("onFinish");
        System.out.println("testCaseCount: "+testCaseCount);
        System.out.println("testCasePassCount: "+testCasePassCount);
        System.out.println("testCaseFailCount: "+testCaseFailCount);
        if(testCaseCount>0){
            float temp = (float) testCasePassCount /testCaseCount;
            System.out.printf("Pass - %.2f", temp);
            System.out.println("");
            temp = temp*100;

            if(temp>59){

                System.out.println("Threshold reached!");

            }
            else{

                System.out.println("Test suite failed");

            }

        }

    }

    @Override
    public void onStart(ITestContext Result) {
        System.out.println("onStart");
        System.out.println("testCaseCount: "+testCaseCount);
        System.out.println("testCasePassCount: "+testCasePassCount);
        System.out.println("testCaseFailCount: "+testCaseFailCount);

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {
        System.out.println("onTestFailedButWithinSuccessPercentage");
        testCaseFailCount++;
    }

    // When Test case get failed, this method is called.
    @Override
    public void onTestFailure(ITestResult Result) {
        System.out.println("The name of the testcase failed is :" + Result.getName());
        System.out.println("onTestFailure");
        testCaseFailCount++;
    }

    // When Test case get Skipped, this method is called.
    @Override
    public void onTestSkipped(ITestResult Result) {
        System.out.println("The name of the testcase Skipped is :" + Result.getName());
        System.out.println("onTestSkipped");
        testCaseFailCount++;
    }

    // When Test case get Started, this method is called.
    @Override
    public void onTestStart(ITestResult Result) {
        System.out.println(Result.getName() + " test case started");
        System.out.println("onTestStart");
        testCaseCount++;
    }

    // When Test case get passed, this method is called.
    @Override
    public void onTestSuccess(ITestResult Result) {
        System.out.println("The name of the testcase passed is :" + Result.getName());
        System.out.println("onTestSuccess");
        testCasePassCount++;
    }

}
