package mySelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetTitleUse {

	public static void main(String[] args) throws InterruptedException
	{
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.youtube.com/");
    Thread.sleep(5000);
    
   String title= driver.getTitle();
   System.out.println("Title is "+title);
   
   
	}

}
