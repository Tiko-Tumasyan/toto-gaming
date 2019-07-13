package am.qa.totogaming.main.menu.buttons.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.qa.totogaming.page.base.PageObject;
import am.qa.totogaming.page.guest.TotoGuestPage;

public class TotoSportTournamentPage extends PageObject {

	public TotoSportTournamentPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a[@class='home']")
	WebElement sportsTournamentHomeBtn;
	
	public TotoGuestPage sportsTournamentBackToHomePage() {
		sportsTournamentHomeBtn.click();
		return new TotoGuestPage(driver);
	}

}
