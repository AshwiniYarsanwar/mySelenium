package relativeAndAbsoluteX_path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingAbsolutX_path {

	public static void main(String[]args) 
			{
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.facebook.com/");
       //by using absolute X-path
       driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/form/div/div/input")).sendKeys("Ashwini");
       
      // by relative x-path
      // driver.findElement(By.xpath("//div[2]/input")).sendKeys("Yarsanwar");
	
			
			}
}
