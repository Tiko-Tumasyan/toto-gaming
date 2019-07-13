package am.qa.totogaming.main.menu.buttons.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.qa.totogaming.page.base.PageObject;
import am.qa.totogaming.page.guest.TotoGuestPage;

public class TotoBackgammonPage extends PageObject {

	public TotoBackgammonPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@class='tl_logo']")
	WebElement backgammonHome;

	public TotoGuestPage backgammonBackToHomePage() {
		backgammonHome.click();
		return new TotoGuestPage(driver);
	}

}
