package page.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import base.Page;
import page.locators.SignInPageLocators;

public class SignInPage extends Page {

	public SignInPageLocators signInLoc;
	public SignInPage() {
		this.signInLoc=new SignInPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.signInLoc);
	}
	
	public void doLogin(String username,String password) {
		signInLoc.username.sendKeys(username);
		signInLoc.password.sendKeys(password);
		signInLoc.submit.click();
	}
	
}
