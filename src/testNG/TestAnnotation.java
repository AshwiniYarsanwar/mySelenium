package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestAnnotation {
  @Test
  public void a() 
  {
	  Reporter.log("TC a is running", true);
  }
  @BeforeSuite
  public void b()
  {
	  Reporter.log("Before suit is running", true);
  }
  @BeforeClass
  public void c()
  {
	  Reporter.log("Before class is running", true);
  }@BeforeMethod
  public void d()
  {
	  Reporter.log("Before method is running", true);
  }
  @AfterSuite()
  public void e()
  {
	  Reporter.log("After suit is running", true);
  }
  @AfterClass()
  public void f()
  {
	  Reporter.log("After class is running", true);
  }
  @AfterMethod()
  public void g()
  {
	  Reporter.log("After method is running", true);
  }
}
