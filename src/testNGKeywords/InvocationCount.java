package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount {
  @Test
  public void a() 
  {
	  Reporter.log("TC a is running", true);
  }
  @Test(invocationCount = 4)
  public void b() 
  {
	  Reporter.log("Tc b is running", true);
  }
  @Test
  public void c ()
  {
	  Reporter.log("TC c is running", true);
  }
}
