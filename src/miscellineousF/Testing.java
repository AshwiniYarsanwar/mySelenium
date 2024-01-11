package miscellineousF;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	    CommonlyUsedMethods.ImplicitWait(driver, 2);
		CommonlyUsedMethods.takeScreenshot(driver, "Amazon");

	
	}

}
