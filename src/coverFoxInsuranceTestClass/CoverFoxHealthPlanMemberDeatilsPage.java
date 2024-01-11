package coverFoxInsuranceTestClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CoverFoxHealthPlanMemberDeatilsPage 
{
    @FindBy(id = "Age-You")private WebElement ageDropdown;
    @FindBy(className = "next-btn")private WebElement nextButton;
    
    public CoverFoxHealthPlanMemberDeatilsPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    public void ageDropdownSelect()
    {
    	Select s=new Select(ageDropdown);
    	s.selectByValue("27y");
    }
    public void ClickOnNextButton()
    {
    	nextButton.click();
    }
}
