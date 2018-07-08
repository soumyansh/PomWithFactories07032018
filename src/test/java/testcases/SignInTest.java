package testcases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.Page;
import page.actions.TopNavigation;

public class SignInTest {
	@BeforeTest
	public void setup() {
		System.out.println("Before test of 1st");
		Page.initConfiguration();
	}

	@Test
	public void signInTest() throws InterruptedException {
System.out.println("inside @Test of 1st");
		Page.topNav.gotoSignIn().doLogin("abc", "abc");

		Page.logger.log(LogStatus.INFO, "Test Completed");
		try {
			utilities.TestUtil.CaptureScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
@AfterTest
	public void tearDown() {
	System.out.println("Inside After Test of 1st");
		Page.quitBrowser();
	}
}
