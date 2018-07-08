package page.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import base.Page;
import page.locators.TopNavigationLocators;

public class TopNavigation {

	public TopNavigationLocators topNavigationLocators;

	public TopNavigation() {
		this.topNavigationLocators = new TopNavigationLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(Page.driver, 10);
		PageFactory.initElements(factory, this.topNavigationLocators);
	}

	public void gotoHome() {
	}

	public void createAccount() {
	}

	public SignInPage gotoSignIn() {
	topNavigationLocators.account.click();
	topNavigationLocators.SignIn.click();
	return new SignInPage();
	}

	public void gotoSupport() {
	}

	public void gotoCarHire() {

	}
}
