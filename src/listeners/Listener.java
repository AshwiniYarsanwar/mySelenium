package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;



public class Listener implements ITestListener
{
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		String TCName = result.getName();
	     org.testng.Reporter.log("TC"+TCName+"is Completed Successfully", true);
	}
	@Override
	public void onTestSkipped(ITestResult result) 
	{
		Reporter.log("TC"+result.getName()+"is Skipped,please check dependent method", true);
	}
	@Override
	public void onTestFailure(ITestResult result) 
	{
		Reporter.log("TC"+result.getName()+"is failed,please check again", true);
	}
	@Override
	public void onTestStart(ITestResult result) 
	{
		Reporter.log("TC"+result.getName()+"execution is started", true);
	}

}
