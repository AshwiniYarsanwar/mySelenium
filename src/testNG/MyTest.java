package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyTest {
  @Test
  public void My_First_Test() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
  }
  @Test
  public void My_Second_Test() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.instagram.com/");
  }
  
}
