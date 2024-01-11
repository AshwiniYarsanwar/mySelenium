package miscellineousF;


import java.io.IOException;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Screenshots {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("Honda");
		Thread.sleep(2000);
		
		List<WebElement> searchResult = driver.findElements(By.xpath("//div[@class='OBMEnb'][1]/ul/li"));
		Thread.sleep(2000);
		for(WebElement el:searchResult)
		{
			System.out.println(el.getText());
			
		}
		Thread.sleep(2000);		

		String expectedResult = "honda elevate";
		
		for(WebElement sr1:searchResult)
		{
			String actualResult = sr1.getText();
			
			if(actualResult.equals(expectedResult))
			{
				sr1.click();
				break;
			}
			
			
		}	
		driver.findElement(By.xpath("//a[text()='Images']")).click();	
			
			
	}}