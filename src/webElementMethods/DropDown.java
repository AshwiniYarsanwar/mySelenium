package webElementMethods;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("new account")).click();
        Thread.sleep(2000);
//        driver.findElement(By.id("email")).sendKeys("ashwinipadkanthwar@gmail.com");
//        Thread.sleep(2000);
//        driver.findElement(By.id("pass")).sendKeys("9049824656");
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//button[@name='login']")).click();
        driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Ashwini");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Padkanthwar");
		//select year
        WebElement year=driver.findElement(By.id("year"));
	    Select sYear=new Select(year);
	    sYear.selectByVisibleText("1997");
	    System.out.println("===========Using Iterator for year=to get text=========");
	    List<WebElement> Years = sYear.getOptions();
	    Iterator<WebElement> ity = Years.iterator();
	    while(ity.hasNext())
	    {
	    	System.out.println(ity.next().getText());
	    }
	    
	    WebElement month = driver.findElement(By.id("month"));
	    Select sMonth=new Select(month);
	    sMonth.selectByVisibleText("Sep");
	    System.out.println("=======using Iterator==========");
	    
	    List<WebElement> Months = sMonth.getOptions();
	    Iterator<WebElement> itm = Months.iterator();
	    while(itm.hasNext())
	    {
	    	System.out.println(itm.next().getText());
	    }
	    
	    System.out.println("==============for each loop===========");
	    
	    WebElement day = driver.findElement(By.id("day"));
	    Select sDay=new Select(day);
	    sDay.selectByVisibleText("17");
	    
	    List<WebElement> dates = sDay.getOptions();
	    for(WebElement d1:dates)
	    {
	    	System.out.println(d1.getText());
	    }
	    
	    System.out.println("============Iterator==========");
	    
	   Iterator<WebElement> itd = dates.iterator();
	   
	   while(itd.hasNext())
	   {
		   System.out.println(itd.next().getText());
	   }
	    //to verify dropDown /list-box is multiple select-able or not
	    boolean result = sYear.isMultiple();
       System.out.println("Year Multiple Seletable status is "+result);
	}

}
