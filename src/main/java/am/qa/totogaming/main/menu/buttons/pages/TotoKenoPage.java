package am.qa.totogaming.main.menu.buttons.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.qa.totogaming.page.base.PageObject;
import am.qa.totogaming.page.guest.TotoGuestPage;

public class TotoKenoPage extends PageObject {

	public TotoKenoPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@class='tl_logo']")
	WebElement kenoHome;

	public TotoGuestPage kenoBackToHomePage() {
		kenoHome.click();
		return new TotoGuestPage(driver);
	}
	

}
