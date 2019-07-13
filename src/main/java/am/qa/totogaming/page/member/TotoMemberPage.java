package am.qa.totogaming.page.member;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.qa.social.media.toto.page.FbTotoPage;
import am.qa.totogaming.main.menu.buttons.pages.TotoPokerPage;
import am.qa.totogaming.page.guest.TotoGuestPage;

public class TotoMemberPage extends TotoGuestPage {
	

	public TotoMemberPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath="//div[@id='login_panel']//div[contains(@class, 'dropDownControl')]")
	WebElement usernameDropDown;
	
	@FindBy(xpath="//a[contains(@class, 'dropdown-menu')]")
	WebElement langDropDown;
	
	@FindBy(xpath="//div[contains(@class, 'sportHeaderLang')]")
	WebElement sportsLangDropDown;
	
	@FindBy(xpath="//a[@class='flex en']")
	WebElement engLangSelect;
	
	@FindBy(xpath="//span[text()='English']")
	WebElement engSportsLangSelect;
	
	@FindBy(xpath="//div[@title='Notifications']")
	WebElement notificationsBtn;
	
	@FindBy(xpath="//a[contains(@class, 'tg--poker')]")
	WebElement sportsPokerLink;
		
	
	public void openLangDropDown() {
		langDropDown.click();
	}
	
	public void openSportsLangDropDown() {
		sportsLangDropDown.click();
	}
	
	public void selectEngLang() {
		engLangSelect.click();
	}
	
	public void selectSportsEngLang() {
		engSportsLangSelect.click();
	}
	
	public void openUserNameDropDown() {
		usernameDropDown.click();
	}
	
	public void NotificatiosBtnClick() {
		notificationsBtn.click();
	}
	
	public TotoPokerPage openSportsPokerPage() {
		sportsPokerLink.click();
		return new TotoPokerPage(driver);
	}
}
