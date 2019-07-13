package am.qa.totogaming.main.menu.buttons.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.qa.totogaming.page.base.PageObject;
import am.qa.totogaming.page.guest.TotoGuestPage;

public class TotoBetOnPokerPage extends PageObject {

	public TotoBetOnPokerPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//div[@class='tl_logo']")
	WebElement betOnPokerHome;

	public TotoGuestPage betOnPokerBackToHomePage() {
		betOnPokerHome.click();
		return new TotoGuestPage(driver);
	}
	
}
