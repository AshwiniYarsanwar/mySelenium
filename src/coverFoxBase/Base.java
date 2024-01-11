package coverFoxBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Base 
{
	static protected WebDriver driver;
	//open browser
	
	public void launchCoverFox() throws InterruptedException
	{
		driver=new ChromeDriver();
		Reporter.log("Launching Browser", true);
	    driver.get("https://www.coverfox.com/");
	     Thread.sleep(1000);
	}
	
	//close browser
	public void closeCoverFox() throws InterruptedException
	{
		Reporter.log("Closing Browser", true);
		Thread.sleep(2000);
		driver.close();
	}

}
