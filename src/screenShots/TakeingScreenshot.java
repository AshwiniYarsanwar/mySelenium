package screenShots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeingScreenshot {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
	   File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	   File dest=new File("C:\\Users\\ashwi\\OneDrive\\Selenium ScreenShots\\123.png");
	   
	   FileHandler.copy(src, dest);
	}

}
