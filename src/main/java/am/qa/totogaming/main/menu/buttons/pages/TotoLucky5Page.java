package am.qa.totogaming.main.menu.buttons.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.qa.totogaming.page.base.PageObject;
import am.qa.totogaming.page.guest.TotoGuestPage;

public class TotoLucky5Page extends PageObject {

	public TotoLucky5Page(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@class='tl_logo']")
	WebElement lucky5Home;

	public TotoGuestPage lucky5BackToHomePage() {
		lucky5Home.click();
		return new TotoGuestPage(driver);
	}

}
