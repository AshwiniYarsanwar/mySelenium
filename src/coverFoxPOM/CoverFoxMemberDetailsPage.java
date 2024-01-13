package coverFoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CoverFoxMemberDetailsPage 
{
	@FindBy(id ="Age-You")private WebElement ageDropdown;

	@FindBy(className="next-btn")private WebElement nextButton;
	
	public CoverFoxMemberDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void handledAgeDropDown(String age) throws InterruptedException
	{
		
		Thread.sleep(1000);
		Select s=new Select(ageDropdown);
		s.deselectByValue(age);
	}
	public void clickOnNextButton() 
	 {
		nextButton.click();
	 }
}
