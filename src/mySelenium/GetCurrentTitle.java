package mySelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentTitle {

	public static void main(String[] args) throws InterruptedException 
	{
    WebDriver driver=new ChromeDriver();
    driver.get("https://vctcpune.com/");
    Thread.sleep(2000);
    
    String url=driver.getCurrentUrl();
    System.out.println("Url is "+url);
	}
	

}
