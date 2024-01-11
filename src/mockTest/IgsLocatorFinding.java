package mockTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IgsLocatorFinding {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://igsglobal.com/");
		Thread.sleep(2000);
		WebElement result = driver.findElement(By.xpath("//strong[text()='Read More'][1]"));
		Thread.sleep(2000);
	    result.click();
	
	}

}
