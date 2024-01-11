package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;          
 
public class MixedKeywordsUse {
 //Test(dependsOnMethods = {"c","d"}(priority=-1)
  public void a() 
  {
	  Reporter.log("TC a is running", true);
  }
  @Test
  public void b()
  {
	  Reporter.log("TC b is running", true);
  }
  @Test 
  public void c()
  {
	  Reporter.log("TC c is running", true);
  }
  @Test
  public void d()
  {
	  Reporter.log("TC d is running", true);
  }
}
