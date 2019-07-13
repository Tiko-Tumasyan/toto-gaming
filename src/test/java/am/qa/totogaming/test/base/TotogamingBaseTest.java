package am.qa.totogaming.test.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import am.qa.totogaming.page.guest.TotoGuestPage;
import am.qa.totogaming.util.DriverUtil;

public class TotogamingBaseTest {
	protected WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://totogaming.am");
		
		TotoGuestPage dropDownOpen = new TotoGuestPage(driver);
		
		dropDownOpen.openLangDropDown();
		dropDownOpen.selectEngLang();
		DriverUtil.waitForElementPresent(driver, 3, "//span[text()='en']");
	}
	
	@AfterClass
	public void tearDown() {
//		driver.quit();
	}

}
