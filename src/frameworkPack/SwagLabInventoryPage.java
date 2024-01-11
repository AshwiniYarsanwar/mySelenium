package frameworkPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabInventoryPage 
	{
		//1.Variables
		@FindBy(id = "shopping_cart_container")private WebElement cartButton;
	    @FindBy(name = "add-to-cart-sauce-labs-bike-light")private WebElement cartItembikeLiteButton;
	    @FindBy(name = "add-to-cart-sauce-labs-onesie")private WebElement addToCartOnsieButton;


       //2.Constructor
     public  SwagLabInventoryPage(WebDriver driver)
     {
    	PageFactory.initElements(driver,this); 
     }
     //3.Methods
     public void addBikeLiteToCart()
     {
    	 cartItembikeLiteButton.click();
     }
	public void addOnesieToCart()
	{
		addToCartOnsieButton.click();
	}
	public void clickOnCartButton()
	{
		cartButton.click();
	}
	
	
	
	
	
	
	
	
	
	
	}