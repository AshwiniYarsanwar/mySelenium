package tsetNGAssertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NormalTestValidation {
  @Test
  public void f() throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.findElement(By.linkText("Create new account")).click();
	  Thread.sleep(1000);
	  
	  boolean radioButtonSelectionStatus = driver.findElement( By.xpath("(//input[@type='radio'])[1]")).isSelected();

	  
	  
      //if female gender radio button is selected thenTC is passed else TC is failed
	  
	  System.out.println("Female Radio Button status is "+radioButtonSelectionStatus );
	  
//	 if(radioButtonSelectionStatus)
//	 {
//		 System.out.println("Radio button is selected,TC is passed");
//	 }
//	 else
//	 {
//		 System.out.println("Radio button is not Selected,TC is failed");
//	 }
  
  
  Assert.assertFalse(radioButtonSelectionStatus,"TC is failed,radio button is not selected");
  
  }}

