package am.qa.totogaming.main.menu.buttons.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.qa.totogaming.page.base.PageObject;
import am.qa.totogaming.page.guest.TotoGuestPage;

public class TotoToto21Page extends PageObject {

	public TotoToto21Page(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@class='tl_logo']")
	WebElement toto21Home;

	public TotoGuestPage toto21BackToHomePage() {
		toto21Home.click();
		return new TotoGuestPage(driver);
	}

}
