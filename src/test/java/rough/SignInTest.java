package rough;

import base.Page;
import page.actions.TopNavigation;

public class SignInTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Page.initConfiguration();
		Page.topNav.gotoSignIn().doLogin("abc", "abc");
		Page.quitBrowser();
	}

}
 