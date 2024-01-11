package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiselectableMethod {

	public static void main(String[] args) throws InterruptedException 
	{
    WebDriver driver=new ChromeDriver();
    driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
    Thread.sleep(1000);
    WebElement multiDrop = driver.findElement(By.xpath("//select[@multiple='true']"));
    Select s1=new Select(multiDrop);
    s1.selectByValue("pizza");
    Thread.sleep(1000);
    
    s1.selectByIndex(2);
    Thread.sleep(1000);
    
    s1.selectByVisibleText("Donut");
    Thread.sleep(1000);
    
    s1.deselectByIndex(2);
   // s1.deselectAll();
	}

}
