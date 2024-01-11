package mySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeyUse {

	public static void main(String[] args) throws InterruptedException 
	{
         WebDriver driver=new ChromeDriver();
         driver .get("https://www.facebook.com/login/");
         Thread.sleep(1000);
         //driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ashwinipadkanthwar@gmail.com");
         //driver.findElement(By.id("email")).sendKeys("ashwinipadkanthwar@gmail.com");
         driver.findElement(By.name("email")).sendKeys("ashwinipadkanthwar@gmail.com");
         Thread.sleep(1000);
         driver.findElement(By.name("email")).clear();
	}

}
