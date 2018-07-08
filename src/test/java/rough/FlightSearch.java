package rough;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import base.Page;
import page.actions.HomePage;
import page.locators.HomePageLocators;

public class FlightSearch {

	public static void main(String[] args) throws InterruptedException {
		Page.initConfiguration();

		HomePage homepage = new HomePage();
		homepage.gotoFlights();
		homepage.bookAFlight("Mumbai, India (BOM-Chhatrapati Shivaji Intl.)", "Delhi, India (DEL-Indira Gandhi Intl.)",
				"12/07/2018", "31/08/2018");
		
		Page.quitBrowser();
		
		
	}

}
