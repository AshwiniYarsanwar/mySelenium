package popUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopUp {

	public static void main(String[] args) throws InterruptedException
	{
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  Thread.sleep(1000);
	  
	  driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
	  
	  driver.findElement(By.name("q")).sendKeys("Mobile Phones");
	}

}
