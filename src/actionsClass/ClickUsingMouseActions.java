package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickUsingMouseActions {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		//driver.findElement(By.name("login")).click();
		
		//1.find out the locator of webelement where we need to perform action and store it in reference variable
		WebElement loginButton = driver.findElement(By.name("login"));
	    
	    //2.Create an Object of an Actions class which will accept driver object as a parameter
		Actions act=new Actions(driver);
		
		//3.using one of the Actions class methods perform an action
		//act.moveToElement(loginButton).perform();
		//act.click().perform();
		
		//act.moveToElement(loginButton).click().build().perform();
		
		act.click(loginButton).perform();
		
	
	}

}
