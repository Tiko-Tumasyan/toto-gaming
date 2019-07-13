package am.qa.totogaming.main.menu.buttons.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.qa.totogaming.page.base.PageObject;
import am.qa.totogaming.page.guest.TotoGuestPage;

public class TotoSportLoto5From36Page extends PageObject {

	public TotoSportLoto5From36Page(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@title='Home']")
	WebElement sportLoto5Home;

	public TotoGuestPage sportLoto5BackToHomePage() {
		sportLoto5Home.click();
		return new TotoGuestPage(driver);
	}

}
