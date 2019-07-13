package am.qa.totogaming.page.notifications.win;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.qa.totogaming.page.base.PageObject;

public class TotoNotificationsWindow extends PageObject {

	public TotoNotificationsWindow(WebDriver driver) {
		super(driver);
	}
	final String notificationsWindow = "//div[@class='maPageMenu']//span[@title='Notifications']";
	@FindBy(xpath = "//div[@class='maPageMenu']//span[@title='Notifications']")
	WebElement notificationsWindowPresent;
	
	@FindBy(xpath = "//div[@id='emdeposbox']//span[text()='Deposits']")
	WebElement emailNotificationsDeposits;
	
	@FindBy(xpath = "//div[@id='emwithbox']//span[text()='Withdrawals']")
	WebElement emailNotificationsWithdrawals;
	
	@FindBy(xpath = "//div[@id='smsdeposbox']//span[text()='Deposits']")
	WebElement smsNotificationsDeposits;
	
	@FindBy(xpath = "//div[@id='smswithbox']//span[text()='Withdrawals']")
	WebElement smsNotificationsWithdrawals;
	
	@FindBy(xpath = "//input[contains(@id,'btnSubmit')]")
	WebElement updateBtn;
	
	public void emailNotificationsDepositsClick() {
		emailNotificationsDeposits.click();
	}
	
	public void emailNotificationsWithdrawals() {
		emailNotificationsWithdrawals.click();
	}
	
	public void smsNotificationsDeposits() {
		smsNotificationsDeposits.click();
	}
	
	public void smsNotificationsWithdrawals() {
		smsNotificationsWithdrawals.click();
	}
	
	public TotoNotificationsWindowUpdated updateBtnClick() {
		updateBtn.click();
		return new TotoNotificationsWindowUpdated(driver);
	}
	
	
}
