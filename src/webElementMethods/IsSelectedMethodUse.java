package webElementMethods;

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
		Thread.sleep(200);
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]")).click();
		Thread.sleep(1000);
//		boolean result = driver.findElement(By.xpath("//input[@value='1']")).isSelected();
//	    
//		System.out.println("Gender selection result is "+ result);
//	    driver.findElement(By.xpath("//input[@value='1']")).click();
//		boolean result1 = driver.findElement(By.xpath("//input[@value='1']")).isSelected();
//		System.out.println("Gender selection result is "+ result1);
		
		
		//code optimization
		WebElement femaleGender = driver.findElement(By.xpath("//input[@value='1']"));
	     boolean result = femaleGender.isSelected();
         System.out.println("Gender selection is"+result);
         femaleGender.click();
	     boolean result1 = femaleGender.isSelected();
	      System.out.println("Gender selection is"+result1);
	}

}
