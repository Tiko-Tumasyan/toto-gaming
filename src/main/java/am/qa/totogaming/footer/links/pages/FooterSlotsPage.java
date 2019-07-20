package am.qa.totogaming.footer.links.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.qa.totogaming.page.base.PageObject;
import am.qa.totogaming.page.guest.TotoGuestPage;

public class FooterSlotsPage extends PageObject {

	public FooterSlotsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@class='tl_logo']")
	WebElement footerSlotsHome;

	public TotoGuestPage footerSlotsBackToHomePage() {
		footerSlotsHome.click();
		return new TotoGuestPage(driver);
	}
	
}
