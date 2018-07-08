package page.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {

	@FindBy(css = "#tab-flight-tab-hp")
	public WebElement flightTab;

	@FindBy(id = "flight-origin-hp-flight")
	public WebElement fromCity;

	@FindBy(id = "flight-destination-hp-flight")
	public WebElement toCity;

	@FindBy(id = "flight-departing-hp-flight")
	public WebElement departing;

	@FindBy(id = "flight-returning-hp-flight")
	public WebElement returning;

	@FindBy(xpath = "//*[@data-gcw-change-submit-text='Search' and @type='submit']")
	public WebElement search;
	@FindBy(xpath = "//*[@id='flight-wizard-search-button']")
	public WebElement ResultSearch;

}
