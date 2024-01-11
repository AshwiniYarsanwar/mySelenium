package mySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethodUse {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
		Thread.sleep(1000);
		//boolean result = driver.findElement(By.xpath("//input[@value='1']")).isSelected();
	   // System.out.println("Gender Selection Status is "+result);
	   // driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
        boolean result1 = driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).isSelected();
        System.out.println("Gender Selection Status is "+result1);
	}

}
