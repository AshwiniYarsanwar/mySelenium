package mySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethodsUse {

	public static void main(String[] args) throws InterruptedException 
	{
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.facebook.com/login");
       Thread.sleep(1000);
       //locators using class
        driver.findElement(By.className("_97w4")).click();
	}

}
