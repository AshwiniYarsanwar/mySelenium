package crossBrowserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CBTest {
	@org.testng.annotations.Parameters
  @Test
  public void f(String browserName) 
  {
	 WebDriver driver=null;
	 if(browserName.equals("chrome"))
	 {
		 driver=new ChromeDriver();
	 }
	 else if (browserName.equals("fireFox"))
	 {
		 driver=new FirefoxDriver();
	 }
	 driver.get("https://www.facebook.com/");
	 driver.findElement(By.linkText("Create new account")).click();
	 driver.findElement(By.name("firsname")).sendKeys("Ashwini");
  }
}
