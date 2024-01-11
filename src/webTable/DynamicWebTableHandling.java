package webTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableHandling {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		int numOfRows = driver.findElements(By.xpath("//table[@class='dataTable']//tr")).size();
		int numOfColumns = driver.findElements(By.xpath("//table[@class='dataTable']//tr[1]/th")).size();
		
		//for readding header only
		for(int h=1;h<=numOfColumns;h++) 
		{
			String tableHeader = driver.findElement(By.xpath("//table[@class='dataTable']//tr[1]/th["+h+"]")).getText();
		    System.out.print(tableHeader+" ");
		
		}
         System.out.println();
         
         System.out.println("==============================");
	
	      //for reading table body
         for(int i=1;i<=numOfRows-1;i++)
         {
        	 for(int j=1;j<=numOfColumns;j++)
        	 {
        		String dataOfTable = driver.findElement(By.xpath("//table[@class='dataTable']//tbody/tr["+i+"]/td["+j+"]")).getText();
        		
        		System.out.print(dataOfTable+" ");
        	 }
        	 System.out.println();
        	 System.out.println("======================");
         }
	
	
	
	
	
	
	}

}
