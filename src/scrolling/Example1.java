package scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,2700)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-1000)");
		

	}

}
