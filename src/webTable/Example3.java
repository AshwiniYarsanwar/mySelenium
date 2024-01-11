package webTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3 {

	public static void main(String[] args) 
	{
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://testautomationpractice.blogspot.com/");
        
       int numOfRows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();

       int numOfColumns = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th")).size();
     
       System.out.println("=================================================");
       
       for(int i=1;i<=numOfRows;i++)//outer loop for row-->7
       {
    	   for(int j=1;j<=numOfColumns;j++)//inner loop for columns-->4
    	   {
    		   if(i==1) 
    		   {
    			WebElement dataOfHead = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/th["+j+"]"));
    			System.out.print(dataOfHead.getText()+"  ");
    		   }
    		   else 
    		   {
    			  WebElement tableData = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td["+j+"]"));
    			  System.out.print(tableData.getText()+"  ");
    		   }
    	   }
    	   System.out.println();
    	   System.out.println("=======================================");
       }
	}

}
