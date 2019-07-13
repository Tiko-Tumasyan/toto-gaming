package am.qa.totogaming.main.menu.buttons.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.qa.totogaming.page.base.PageObject;
import am.qa.totogaming.page.guest.TotoGuestPage;

public class TotoBaccaratPage extends PageObject {

	public TotoBaccaratPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@class='tl_logo']")
	WebElement baccaratHome;

	public TotoGuestPage baccaratBackToHomePage() {
		baccaratHome.click();
		return new TotoGuestPage(driver);
	}

}
