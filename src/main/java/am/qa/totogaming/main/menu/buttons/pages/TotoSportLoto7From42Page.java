package am.qa.totogaming.main.menu.buttons.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.qa.totogaming.page.base.PageObject;
import am.qa.totogaming.page.guest.TotoGuestPage;

public class TotoSportLoto7From42Page extends PageObject{

	public TotoSportLoto7From42Page(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@title='Home']")
	WebElement sportLoto7Home;

	public TotoGuestPage sportLoto7BackToHomePage() {
		sportLoto7Home.click();
		return new TotoGuestPage(driver);
	}

}
