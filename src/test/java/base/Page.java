package base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import page.actions.TopNavigation;
import utilities.ExcelReader;

public class Page {

	public static WebDriver driver;
	public static ExcelReader excel = new ExcelReader(
			System.getProperty("user.dir") + "\\src\\test\\resources\\Excel\\TestData.xlsx");
	public static ExtentReports extent;
	public static ExtentTest logger;
	public static WebDriverWait wait;
	public static TopNavigation topNav;

	public static void initConfiguration() {

		if (extent == null) {
			extent = new ExtentReports(System.getProperty("user.dir") + "//src//test//Reports//ExtentReports.html",
					true);
			extent.loadConfig(new File(System.getProperty("user.dir") + "//src//test//Reports//ReportsConfig.xml"));
		
		}

		if(driver==null) {
		if (Constants.browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\Executables\\geckodriver.exe");

			driver = new FirefoxDriver();
		} else if (Constants.browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\Executables\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.get(Constants.testSiteUrl);
		driver.manage().window().maximize();
		topNav = new TopNavigation();
	}
	}
	public static void quitBrowser() {
		try {
			Thread.sleep(7000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
		driver=null;
	}
}
