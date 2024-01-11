package miscellineousF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingInCommon {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
        CommonlyUsedMethods.ImplicitWait(driver, 4);
        WebElement scroll = driver.findElement(By.xpath("//h2[text()='Essentials for Expecting Mothers']"));
	    CommonlyUsedMethods.scrollIntoView(driver, scroll);
	    
	
	}

}
