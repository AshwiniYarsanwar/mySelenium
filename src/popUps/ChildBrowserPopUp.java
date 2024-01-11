package popUps;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
        Thread.sleep(1000);
       
        WebElement mainPageElement = driver.findElement(By.xpath("//b[text()='[Dummy Controls]']"));
	
       System.out.println("Main Page Element "+ mainPageElement.getText()); 
       
       //clicking on new window button
       
       driver.findElement(By.name("NewWindow")).click();
       
       //to Switch to Child Window we have to know the ID of Window
       
      String mainPageID = driver.getWindowHandle();
       
	  System.out.println("Main Page Id is "+mainPageID);
	
	 //to get all page IDs use getWindowHandles method
	  
	  Set<String> allWindowIDs = driver.getWindowHandles();
	  
	  Iterator<String> it = allWindowIDs.iterator();
	  
	  String mainPageId =it.next();//getting ID of main page
	  String child1ID = it.next();//getting Id of child page 1
	  
	  System.out.println("Main Page ID is "+ mainPageId);
	  System.out.println("child1 Page ID is "+ child1ID);
	  
	  //Switching Focus From main Page to child Browser
	  driver.switchTo().window(child1ID);
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  
	  driver.findElement(By.id("the7-search")).sendKeys("Ash");
	  //driver.close();
	  System.out.println(driver.findElement(By.xpath("//h1[text()='About me']")).getText());
	  
	  //again to work on main page need to switch focus from child browser to main page
	  driver.switchTo().window(mainPageId);
	  Thread.sleep(2000);
	  
	  String mainPageText2 = driver.findElement(By.xpath("//p[contains(text(),'new browser window')]")).getText();
	  
	  System.out.println("Main Page Text 2 is "+mainPageText2);
	
	  //to click on new tab
	  driver.findElement(By.name("NewTab")).click();
	  
	  driver.findElement(By.xpath("//span[text()='Watch free courses']")).click();
	}
}