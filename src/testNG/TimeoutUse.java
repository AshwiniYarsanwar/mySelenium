package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeoutUse {
  @Test(timeOut=5000)
  public void payment() throws InterruptedException 
  {
	  Thread.sleep(3000);
	  Reporter.log("payment done successful", true);
  }
}
