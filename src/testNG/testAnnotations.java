package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testAnnotations {
  @Test
  public void myTest() 
  {
	  Reporter.log("Test Method of myTest Class", true);
  }
  @Test
  public void myTest1() 
  {
	  Reporter.log("Test Method1 of myTest Class", true);
  }
  @BeforeClass
  public void beforeClass()
  {
	  Reporter.log("Before Test Annotation of myTest class", true);
  }
  @AfterClass
  public void afterClass()
  {
	  Reporter.log("afterClass Annotation of myTest Class", false);
  }
}
