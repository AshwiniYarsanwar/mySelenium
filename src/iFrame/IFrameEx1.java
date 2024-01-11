package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameEx1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(1000);
		
		//switching focus from main page to i frame
		driver.switchTo().frame("singleframe");
		
       String Test = driver.findElement(By.xpath("//h5[text()='iFrame Demo']")).getText();
	   
       System.out.println("Text is "+Test);
       
       //to work on main page we need to focus from i frame to main page
       
       driver.switchTo().defaultContent();
       
       Thread.sleep(1000);
       
      WebElement button = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
	
      System.out.println("Display status of button is "+button.isDisplayed());
	}

}
