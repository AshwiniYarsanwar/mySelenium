package scrolling;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrollIntoView {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(1000);
		

		WebElement sponsoredCompanies = driver.findElement(By.xpath("//h2[text()='Sponsored companies']"));
		Thread.sleep(1000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",sponsoredCompanies);
		WebElement myElement=driver.findElement(By.xpath("//h2[text()='Top companies hiring now']"));
		
		File src=myElement.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\ashwi\\OneDrive\\Selenium ScreenShots\\Scroll.png");
		FileHandler.copy(src, dest);
	}

}
