package am.qa.facebook.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.qa.totogaming.page.base.PageObject;

public class FacebookLoginPage extends PageObject {

	public FacebookLoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//input[@id='email']")
	WebElement fbEmailField;
	
	@FindBy(xpath="//input[@id='pass']")
	WebElement fbPassField;
	
	@FindBy(xpath="//button[@id='loginbutton']")
	WebElement fbSubmit;
	
	public void fillFbLoginCredentials(String fbUsername, String fbPassword) {
		fbEmailField.clear();
		fbEmailField.sendKeys(fbUsername);
		fbPassField.clear();
		fbPassField.sendKeys(fbPassword);
	}
	
	public void submitFbLoginForm() {
		fbSubmit.click();
	}
	
}
