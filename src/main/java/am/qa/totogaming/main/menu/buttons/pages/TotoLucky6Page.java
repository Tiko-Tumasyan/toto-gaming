package am.qa.totogaming.main.menu.buttons.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.qa.totogaming.page.base.PageObject;
import am.qa.totogaming.page.guest.TotoGuestPage;

public class TotoLucky6Page extends PageObject {

	public TotoLucky6Page(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@class='tl_logo']")
	WebElement lucky6Home;

	public TotoGuestPage lucky6BackToHomePage() {
		lucky6Home.click();
		return new TotoGuestPage(driver);
	}

}
