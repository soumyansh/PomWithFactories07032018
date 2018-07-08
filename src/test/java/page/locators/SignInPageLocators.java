package page.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPageLocators {

	
	@FindBy(xpath="//*[@id='signin-loginid']")
	public WebElement username;
	

	@FindBy(xpath="//*[@id='signin-password']")
	public WebElement password;
	
	

	@FindBy(xpath="//*[@id='submitButton']")
	public WebElement submit;
}
