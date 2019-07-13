package am.qa.totogaming.main.menu.buttons.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.qa.totogaming.page.base.PageObject;
import am.qa.totogaming.page.guest.TotoGuestPage;

public class TotoSportsPage extends PageObject {

	public TotoSportsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@title='Home']")
	WebElement sportsHome;

	public TotoGuestPage sportsBackToHomePage() {
		sportsHome.click();
		return new TotoGuestPage(driver);
	}
	
}
