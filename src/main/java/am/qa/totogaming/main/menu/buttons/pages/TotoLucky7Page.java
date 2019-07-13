package am.qa.totogaming.main.menu.buttons.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.qa.totogaming.page.base.PageObject;
import am.qa.totogaming.page.guest.TotoGuestPage;

public class TotoLucky7Page extends PageObject {

	public TotoLucky7Page(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@class='tl_logo']")
	WebElement lucky7Home;

	public TotoGuestPage lucky7BackToHomePage() {
		lucky7Home.click();
		return new TotoGuestPage(driver);
	}

}
