package QKART_TESTNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;

public class ListenerClass implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test Case Starts"+result.getName());
        QKART_Tests.takeScreenshot(QKART_Tests.driver, "Test Case Starts", "Starting");
    }
   
    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Case Successful" +result.getName());
        QKART_Tests.takeScreenshot(QKART_Tests.driver, "Test Case Successful", "Finished Successfully");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Case Failed" +result.getName());
        QKART_Tests.takeScreenshot(QKART_Tests.driver, "Test Case Starts", "Finished but Failed");
    }
}
