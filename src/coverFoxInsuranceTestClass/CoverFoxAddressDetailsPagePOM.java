package coverFoxInsuranceTestClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxAddressDetailsPagePOM 
{
   @FindBy(xpath = "//input[@placeholder='6 Digit Pincode']")private WebElement pinCodeField;
   @FindBy(id = "want-expert")private WebElement mobileNumField;
   @FindBy(className = "next-btn")private WebElement continueButton;
   
   public CoverFoxAddressDetailsPagePOM(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   public void pinCodeField() 
   {
	   pinCodeField.sendKeys("431722");
   }
   public void mobileNumField()
   {
	   mobileNumField.sendKeys("9049824656");
   }
   public void continueButtonClick()
   {
	   continueButton.click();
   }
}
