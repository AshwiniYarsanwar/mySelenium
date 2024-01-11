package mockTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonEnbleing {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(1000);
		//WebElement result = driver.findElement(By.xpath("//button[text()='Button2']"));
	    //result.isEnabled();
	    driver.findElement(By.xpath("//button[text()='Button1']")).click();
	}

}
