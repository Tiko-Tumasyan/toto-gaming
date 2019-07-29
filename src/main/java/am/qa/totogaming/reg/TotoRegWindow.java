package am.qa.totogaming.reg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.qa.totogaming.page.base.PageObject;
import am.qa.totogaming.page.guest.TotoGuestPage;

public class TotoRegWindow extends PageObject {

	public TotoRegWindow(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a[@automation='open_register']")
	WebElement regDialog;
	
	@FindBy(xpath="//div[@class='tl_head_close dont-shrink']")
	WebElement regDialogCloser;
	
	public TotoGuestPage openRegDialog() {
		regDialog.click();
		return new TotoGuestPage(driver);
	}
	
	public TotoGuestPage closeRegWin() {
		regDialogCloser.click();
		return new TotoGuestPage(driver);
	}

}
