package am.qa.totogaming.page.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.qa.totogaming.page.base.PageObject;
import am.qa.totogaming.page.guest.TotoGuestPage;
import am.qa.totogaming.page.member.TotoMemberPage;
import am.qa.totogaming.util.DriverUtil;

public class TotoLoginWindow extends PageObject {

	public TotoLoginWindow(WebDriver driver) {
		super(driver);
	}
		
	final String loginWinXPath = "//div[@id='login_container']";
	@FindBy(xpath = loginWinXPath )
	WebElement loginWin;
	
	@FindBy(xpath = "//div[contains(@class, 'tl_head_close')]")
	WebElement loginWinClose;
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement totoUsernameField;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement totoPasswordField;
	
	@FindBy(xpath="//button[@automation='login_button']")
	WebElement totoSubmit;
	
	public void fillTotoLoginCredentials(String totoUsername, String totoPassword) {
		DriverUtil.waitForElementPresent(driver, 3, loginWinXPath);
		totoUsernameField.clear();
		totoUsernameField.sendKeys(totoUsername);
		totoPasswordField.clear();
		totoPasswordField.sendKeys(totoPassword);
	}

	public TotoMemberPage submitTotoLoginForm() {
		totoSubmit.click();
		return new TotoMemberPage(driver);
	}
	
	public TotoGuestPage closeLoginWin() {
		loginWinClose.click();
		return new TotoGuestPage(driver);
	}
}
