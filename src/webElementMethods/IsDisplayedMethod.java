package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		
		boolean result = driver.findElement(By.id("hide-textbox")).isDisplayed();
		System.out.println("Display method Status is"+result);
		Thread.sleep(2000);
		driver.findElement(By.id("show-textbox")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("displayed-text")).sendKeys("Hi Everyone");
	}

}
