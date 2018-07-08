package page.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Page;
import page.locators.HomePageLocators;

public class HomePage extends Page {
	HomePageLocators homepagelocators;

	public HomePage() {
		this.homepagelocators = new HomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.homepagelocators);
	}

	public void gotoFlights() {
		homepagelocators.flightTab.click();
	}

	public void gotoHotels() {

	}

	public void gotoFlightAndHotels() {

	}

	public void bookAFlight(String from, String to, String departing, String returning) throws InterruptedException {
		homepagelocators.fromCity.sendKeys(from);
		homepagelocators.toCity.sendKeys(to);
		homepagelocators.departing.clear();
		homepagelocators.departing.sendKeys(departing);
		Thread.sleep(3000);
		homepagelocators.returning.clear();
		homepagelocators.returning.sendKeys(returning);
		
		Thread.sleep(3000);
		homepagelocators.returning.sendKeys(Keys.ENTER);
		
		try {
			homepagelocators.search.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
	
	public boolean FlightResultVerify() {
		wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(homepagelocators.ResultSearch));
		System.out.println(homepagelocators.ResultSearch.getSize().getWidth());
		if(homepagelocators.ResultSearch.getSize().getWidth()>0) {
			return true;
		}else {
			return false;
		}
	}
}
