package mockTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownFunctionality {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement date = driver.findElement(By.id("[id=\"day\"]"));
		
		Select sDay=new Select(date);
		
		sDay.selectByVisibleText("18");
		
		WebElement Month = driver.findElement(By.id("[id=\"month\"]"));
		
		Select sMonth=new Select(Month);
		
		sMonth.selectByVisibleText("Nov");
		
		driver.findElement(By.id(null));
		
		
	
	}

}
