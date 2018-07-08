package testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Page;
import page.actions.HomePage;

public class FlightSearch {

	@BeforeTest
	public void setup() {
		System.out.println("inside before test of 2nd");
		Page.initConfiguration();
	}

	@Test
	public void FlightSearchTest() throws InterruptedException {
System.out.println("inside @Test of 2nd");
		Page.initConfiguration();

		HomePage homepage = new HomePage();
		homepage.gotoFlights();
		homepage.bookAFlight("Mumbai, India (BOM-Chhatrapati Shivaji Intl.)", "Delhi, India (DEL-Indira Gandhi Intl.)",
				"12/07/2018", "31/08/2018");

	}
@AfterTest
	public void tearDown() {
	System.out.println("inside after test of 2nd");
		Page.quitBrowser();
	}
}
