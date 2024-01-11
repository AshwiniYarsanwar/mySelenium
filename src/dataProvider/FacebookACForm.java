package dataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import crossBrowserTesting.FBDataProvider;

public class FacebookACForm {
  @Test(dataProvider = "FBRegression",dataProviderClass = FBDataProvider.class)
  public void fbTest(String firstName,String lastName,String MobNum) throws InterruptedException
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  driver.get("https://www.facebook.com/");
	  Thread.sleep(3000);
	  
	  driver.findElement(By.linkText("Create new account")).click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.findElement(By.name("firstName")).sendKeys(firstName);
	  driver.findElement(By.name("lastName")).sendKeys(lastName);
	  driver.findElement(By.name("reg_email_")).sendKeys(MobNum);
	  Thread.sleep(3000);
	  driver.close();
  }
   
 
}
