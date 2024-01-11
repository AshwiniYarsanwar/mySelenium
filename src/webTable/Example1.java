package webTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) 
	{
		//Identify WebTable
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.findElement(By.name("BookTable"));
		
        //How many rows in table
	 List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		
		int numberOfRows = rows.size();
		
		System.out.println("Number Of rows are "+numberOfRows);
		
		//how many columns are present
		
		List<WebElement> headers = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th"));
		
		int numberOfColumns = headers.size();
		
		System.out.println("Number of columns in table are "+numberOfColumns);
	}

}
