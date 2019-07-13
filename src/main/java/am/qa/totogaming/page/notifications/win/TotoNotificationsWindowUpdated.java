package am.qa.totogaming.page.notifications.win;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.qa.totogaming.page.member.TotoMemberPage;

public class TotoNotificationsWindowUpdated extends TotoNotificationsWindow {

	public TotoNotificationsWindowUpdated(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//div[text()='Data is updated...']")
	WebElement updatedMessage;
	
	@FindBy(xpath = "//div[@id='maPageCloseButton']")
	WebElement closeBtn;
	
	public TotoMemberPage clickCloseBtn() {
		closeBtn.click();
		return new TotoMemberPage(driver);
	}
}
