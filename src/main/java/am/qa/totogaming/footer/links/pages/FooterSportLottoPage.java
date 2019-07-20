package am.qa.totogaming.footer.links.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.qa.totogaming.page.base.PageObject;
import am.qa.totogaming.page.guest.TotoGuestPage;

public class FooterSportLottoPage extends PageObject {

	public FooterSportLottoPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@title='Home']")
	WebElement footerSportLottoHome;

	public TotoGuestPage footerSportLottoBackToHomePage() {
		footerSportLottoHome.click();
		return new TotoGuestPage(driver);
	}

}
