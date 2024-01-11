package miscellineousF;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getListOfAllOptions {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		Thread.sleep(2000);

		driver.findElement(By.id("APjFqb")).sendKeys("Honda");
		
		Thread.sleep(2000);
		
		List<WebElement> searchResult = driver.findElements(By.xpath("(//div[@class='OBMEnb'])[1]/ul/li"));
		
		 System.out.println("=======using For loop=======");
		 
		 for(int i=0;i<=searchResult.size()-1;i++)
		 {
			 System.out.println(searchResult.get(i).getText());
		 }
		 System.out.println("===========using For Each Loop=========");
	
		for( WebElement sr:searchResult)
		{
			System.out.println(sr.getText());
		}
		System.out.println("==========using iterator===========");
		
		Iterator<WebElement> it = searchResult.iterator();
		
		while(it.hasNext()) 
		{
		System.out.println(it.next().getText());	
		}
		
		System.out.println("=========using List Iterator========");
		
		ListIterator<WebElement> lit = searchResult.listIterator();
		
		while(lit.hasNext()) 
		{
		System.out.println(lit.next().getText());	
		}
	
		
	}
}

