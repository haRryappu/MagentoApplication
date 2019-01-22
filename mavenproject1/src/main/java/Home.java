

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home 
{
	WebDriver driver;
	chrome driver;
	
	@FindBy(linkText = "My Account")
	WebElement myacc;
	
	public Home(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	public void clickOnMyAcc()
	{
		myacc.click();
	}
	
	
	
}
