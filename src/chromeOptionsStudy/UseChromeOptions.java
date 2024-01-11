package chromeOptionsStudy;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UseChromeOptions {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions opt=new ChromeOptions();
		//opt.addArguments("--headless");
		opt.addArguments("incognito");
	
	    ArrayList<String>al=new ArrayList<String>();
	    
	    al.add("incognito");
	    al.add("-disabled-notifications");
	    al.add("start-maximized");
	    opt.addArguments(al);
	    
	    WebDriver driver=new ChromeDriver(opt);
	    driver.get("https://www.justdial.com/");
	    Thread.sleep(1000);
	    System.out.println(driver.getTitle());
	}

}
