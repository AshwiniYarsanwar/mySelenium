package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Study {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		//CSS selector
		//Tag And ID-->
		//driver.findElement(By.cssSelector("input#email")).sendKeys("Ashwini");
		
		//Tag And Class-->
		//driver.findElement(By.cssSelector("input.inputtext ")).sendKeys("123");
	
	    //Tag And Attribute
		driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys("123");
	
	    
	}

}
