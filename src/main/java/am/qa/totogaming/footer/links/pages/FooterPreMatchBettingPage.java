package am.qa.totogaming.footer.links.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.qa.totogaming.page.base.PageObject;
import am.qa.totogaming.page.guest.TotoGuestPage;

public class FooterPreMatchBettingPage extends PageObject{

	public FooterPreMatchBettingPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@title='Home']")
	WebElement footerPreMatchBettingHome;

	public TotoGuestPage footerPreMatchBettingBackToHomePage() {
		footerPreMatchBettingHome.click();
		return new TotoGuestPage(driver);
	}

}
