package mySelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VarifyPageTitle {

	public static void main(String[] args) throws InterruptedException 
	{
    String expectedResult="Velocity | Best Software Training Center";
    
    WebDriver driver=new ChromeDriver();
    expectedResult="Velocity | Best Software Training Center";
    
    driver.get("https://vctcpune.com/");
    
    Thread.sleep(2000);
    
	String actualResult=driver.getTitle();
	
	if(expectedResult.equals(actualResult))
	{
		System.out.println("Title is matching,TC is passed");
	}
	else
	{
		System.out.println("Title is not matching,TC is failed");
	}
	}}