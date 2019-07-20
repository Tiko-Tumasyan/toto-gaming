package am.qa.totogaming.footer.links.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.qa.totogaming.page.base.PageObject;
import am.qa.totogaming.page.guest.TotoGuestPage;

public class FooterBelotePage extends PageObject {

	public FooterBelotePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//div[@class='tl_logo']")
	WebElement footerBeloteHome;

	public TotoGuestPage footerBeloteBackToHomePage() {
		footerBeloteHome.click();
		return new TotoGuestPage(driver);
	}
	
}
