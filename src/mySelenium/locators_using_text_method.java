package mySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators_using_text_method {

	public static void main(String[] args) throws InterruptedException 
	{ 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//driver.get("https://www.instagram.com/");
       //	driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();
	   
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//h2[contains (text(),'Facebook helps')]")).click();
	}

}
