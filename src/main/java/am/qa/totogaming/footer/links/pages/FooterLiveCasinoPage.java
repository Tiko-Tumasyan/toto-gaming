package am.qa.totogaming.footer.links.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.qa.totogaming.page.base.PageObject;
import am.qa.totogaming.page.guest.TotoGuestPage;

public class FooterLiveCasinoPage extends PageObject {

	public FooterLiveCasinoPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@class='tl_logo']")
	WebElement footerLiveCasinoHome;

	public TotoGuestPage footerLiveCasinoBackToHomePage() {
		footerLiveCasinoHome.click();
		return new TotoGuestPage(driver);
	}

}
