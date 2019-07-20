package am.qa.totogaming.footer.links.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.qa.totogaming.page.base.PageObject;
import am.qa.totogaming.page.guest.TotoGuestPage;

public class FooterToto21Page extends PageObject {

	public FooterToto21Page(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@class='tl_logo']")
	WebElement footerToto21Home;

	public TotoGuestPage footerToto21BackToHomePage() {
		footerToto21Home.click();
		return new TotoGuestPage(driver);
	}

}
