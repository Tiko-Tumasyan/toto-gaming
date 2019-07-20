package am.qa.totogaming.footer.links.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.qa.totogaming.page.base.PageObject;
import am.qa.totogaming.page.guest.TotoGuestPage;

public class FooterFastGamesPage extends PageObject {

	public FooterFastGamesPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@title='Home']")
	WebElement footerFastGamesHome;

	public TotoGuestPage footerFastGamesBackToHomePage() {
		footerFastGamesHome.click();
		return new TotoGuestPage(driver);
	}

}
