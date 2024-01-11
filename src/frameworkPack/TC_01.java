package frameworkPack;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_01 {

	public static void main(String[] args) 
	{
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.saucedemo.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  WebElement user_name = driver.findElement(By.id("user-name"));
	  WebElement password = driver.findElement(By.id("password"));
	  WebElement loginButton = driver.findElement(By.id("login-button"));
	  
	  
	  user_name.sendKeys("standard_user");
	  password.sendKeys("secret_sauce");
	  loginButton.click();
	  
	  
	  WebElement item1 = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
	  
	  item1.click();
	  
	  WebElement cartButton = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
	  
	  cartButton.click();
	  
	  List<WebElement> cartItems = driver.findElements(By.className("inventory_item_name"));
	  
	  System.out.println("Number Of Cart Items Are "+cartItems.size());
	  
	  for(WebElement ci:cartItems)
	  {
		  System.out.println("Items are "+ci.getText());
	  }
	  
	  //validate the item is as same as we want
	  Iterator<WebElement> it=cartItems.iterator();
	  WebElement expectedResult = it.next();
	  
	  if(expectedResult.getText().equals("Sauce Labs Backpack"))
	  {  System.out.println("Selected Items is correct as -->Sauce Labs Backpack");
	  driver.findElement(By.id("checkout")).click();}
	
	   else {
	
		System.out.println("Selected Items Is not Correct");
	}
	
	  //put your first name,last name,zip code
	  
	  WebElement firstName = driver.findElement(By.name("firstName"));
	  WebElement lastName = driver.findElement(By.id("last-name"));
	  WebElement postalCode = driver.findElement(By.name("postalCode"));
	  WebElement continueButton = driver.findElement(By.id("continue"));
	  
	  firstName.sendKeys("Ashwini");
	  lastName.sendKeys("Yarsanwar");
	  postalCode.sendKeys("431722");
	  continueButton.click();
	  
	  WebElement finishButton = driver.findElement(By.id("finish"));
       finishButton.click();
       
       WebElement thankUMsg = driver.findElement(By.xpath("//h2[text()='Thank you for your order!']"));

	   if(thankUMsg.getText().equals("Thank you for your order!"))
			   {
		   System.out.println("Thank You Msg is Displayed ---->logging Out");
		   
	   }else
	   {
		   System.out.println("Thank you Msg is not displayed -->Please Check");
	   }
	
	}}
