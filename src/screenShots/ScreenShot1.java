package screenShots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot1 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
        Thread.sleep(1000);
        
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
        
        System.out.println(src);
		
		File dest=new File("C:\\Users\\ashwi\\OneDrive\\Selenium ScreenShots\\myScreenshot.png");
		
		FileHandler.copy(src, dest);
	
	}

}
