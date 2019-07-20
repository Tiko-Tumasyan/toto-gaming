package am.qa.totogaming.footer.links.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.qa.totogaming.page.base.PageObject;
import am.qa.totogaming.page.guest.TotoGuestPage;

public class FooterPromotionsPage extends PageObject {

	public FooterPromotionsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@class='tl_logo']")
	WebElement footerPromoHome;

	public TotoGuestPage footerPromoBackToHomePage() {
		footerPromoHome.click();
		return new TotoGuestPage(driver);
	}

}
