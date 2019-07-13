package am.qa.totogaming.main.menu.buttons.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.qa.totogaming.page.base.PageObject;
import am.qa.totogaming.page.guest.TotoGuestPage;
import am.qa.totogaming.page.login.TotoLoginWindow;

public class TotoPokerPage extends PageObject {

	public TotoPokerPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@class='tl_logo']")
	WebElement pokerHome;
	
	@FindBy(xpath = "//div[@class='pokerInfo_block']//a[@data-dialog-title='Login']")
	WebElement pokerPageLogin;

	public TotoGuestPage pokerBackToHomePage() {
		pokerHome.click();
		return new TotoGuestPage(driver);
	}
	
	public TotoLoginWindow openPokerPageLoginDialog() {
		pokerPageLogin.click();
		return new TotoLoginWindow(driver);
	}
}
