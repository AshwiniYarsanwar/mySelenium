package webElementMethods;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectedGetTextMethods {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		
		WebElement result = driver.findElement(By.id("cars"));
		
		Select s1=new Select(result);
		
		s1.selectByIndex(1);
		s1.selectByValue("audi");
		s1.selectByVisibleText("Volvo");
		
		List<WebElement> s2 = s1.getOptions();
		System.out.println(s2);
		
		System.out.println("=======================");
		
		//to see all selected option
		System.out.println("===========for each loop===========");
		List<WebElement> s3 = s1.getAllSelectedOptions();
		for(WebElement el:s3)
		{
			System.out.println(el.getText());
		}
		
		System.out.println("==========Using For loop======");
    
		for(int i=0;i<=s3.size()-1;i++)
		{
			System.out.println(s3.get(i).getText());
		}
	
		System.out.println("=======Iterator===========");
		
		Iterator<WebElement> it = s2.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next().getText());
		}
		
		System.out.println("=======List Iterator==========");
		
		ListIterator<WebElement> lit=s2.listIterator();
		while(lit.hasNext())
		{
			System.out.println(lit.next().getText());
		}
		
	}

}
