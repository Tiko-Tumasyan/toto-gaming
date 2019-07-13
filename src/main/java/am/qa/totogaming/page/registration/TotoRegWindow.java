package am.qa.totogaming.page.registration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import am.qa.totogaming.page.base.PageObject;
import am.qa.totogaming.page.guest.TotoGuestPage;
import am.qa.totogaming.util.DriverUtil;

public class TotoRegWindow extends PageObject {


	public TotoRegWindow(WebDriver driver) {
		super(driver);
	}
	

	final String regWinXPath1 = "//form[@automation='register_form']";
	@FindBy(xpath = regWinXPath1)
	WebElement regWin1;
	
	@FindBy(xpath = "//div[contains(@class, 'tl_head_close')]")
	WebElement regWinClose;

	@FindBy(xpath = "//input[@automation='firstname_input']")
	WebElement totoRegNameField;

	@FindBy(xpath = "//input[@automation='lastname_input']")
	WebElement totoRegSurnameField;

	@FindBy(xpath = "//div[@id='custom_DateOfBirthDay']")
	WebElement totoDateOfBirthDay;
	
	final String totoDateOfBirthDaySelectXPath =  "//ul[@data-id='DateOfBirthDay']//li[@rel='%d']";
	@FindBy(xpath = totoDateOfBirthDaySelectXPath)
	WebElement totoDateOfBirthDaySelect;

	@FindBy(xpath = "//div[@id='custom_DateOfBirthMonth']")
	WebElement totoDateOfBirthMonth;

	final String totoDateOfBirthMonthSelectXPath = "//ul[@data-id='DateOfBirthMonth']//li[@rel='%d']";
	@FindBy(xpath = totoDateOfBirthMonthSelectXPath)
	WebElement totoDateOfBirthMonthSelect;

	@FindBy(xpath = "//div[@id='custom_DateOfBirthYear']")
	WebElement totoDateOfBirthYear;
	
	final String totoDateOfBirthYearSelectXPath = "//li[@rel='%d']";
	@FindBy(xpath = totoDateOfBirthYearSelectXPath)
	WebElement totoDateOfBirthYearSelect;

	@FindBy(xpath = "//select[@automation='currencycode_select']")
	WebElement totoCountry;
	
	final String countryXPath = "//ul[@data-id='CountryCode']//li[@rel='%s']";
	@FindBy(xpath = countryXPath)
	WebElement totoCountryElement;

	@FindBy(xpath = "//button[@id='continue_btn']")
	WebElement totoRegNextBtn1;
	
	@FindBy(xpath = "//input[@automation='username_input']")
	WebElement totoRegLoginField;
	
	final String regWinXPath2 = "//div[@id='register_container']";
	@FindBy(xpath = regWinXPath2)
	WebElement regWin2;
	
	@FindBy(xpath = "//input[@automation='email_input']")
	WebElement totoRegEmailField;
	
	@FindBy(xpath = "//select[@automation='countrynumber_select']")
	WebElement totoRegCountryNumber;
	
	
	@FindBy(xpath = "//input[@automation='mobile_input']")
	WebElement totoRegMobileDateField;
	
	@FindBy(xpath = "//input[@automation='passportnumber_input']")
	WebElement totoRegPassportNumField;
	
	@FindBy(xpath = "//input[@automation='password_input']")
	WebElement totoRegPasswordField;
	
	@FindBy(xpath = "//input[@automation='confirmpassword_input']")
	WebElement totoRegConfirmPasswordField;
	
	@FindBy(xpath = "//input[@automation='terms_checkbox']")
	WebElement totoRegCheckBox;
	
	@FindBy(xpath = "//button[@id='continue_btn']")
	WebElement totoRegNextBtn2;
	
	final String regCongratulaions = "//div[@class='tl_popup_content']";
	@FindBy(xpath = regCongratulaions)
	WebElement regCongratsWin;
	
	@FindBy(xpath = "//a[@id='complete_btn']")
	WebElement totoRegCompleteBtn;
	
	public void fillTotoReg1Credentials(String totoRegName, String totoRegSurname, String totoRegDateOfBirthDay, String totoRegDateOfBirthMonth, String totoRegDateOfBirthYear,String totoRegCountry) {
		DriverUtil.waitForElementPresent(driver, 3, regWinXPath1);
		String.format(totoDateOfBirthDaySelectXPath, totoRegDateOfBirthDay);
		String.format(totoDateOfBirthMonthSelectXPath, totoRegDateOfBirthMonth);
		String.format(totoDateOfBirthYearSelectXPath, totoRegDateOfBirthYear);
		PageFactory.initElements(driver,  this);
		totoRegNameField.clear();
		totoRegNameField.sendKeys(totoRegName);
		totoRegSurnameField.clear();
		totoRegSurnameField.sendKeys(totoRegSurname);
		totoDateOfBirthDay.click();
		totoDateOfBirthDaySelect.click();
		totoDateOfBirthMonth.click();
		totoDateOfBirthMonthSelect.click();
		totoDateOfBirthYear.click();
		totoDateOfBirthYearSelect.click();
		
	String	countryName =  DriverUtil.countriesMap.get(totoRegCountry).toString();
	String.format(countryXPath, countryName);
	PageFactory.initElements(driver, this);
	totoCountry.click();
	totoCountryElement.click();
	}
	
	public TotoGuestPage closeRegWin() {
		regWinClose.click();
		return new TotoGuestPage(driver);
	}
}
