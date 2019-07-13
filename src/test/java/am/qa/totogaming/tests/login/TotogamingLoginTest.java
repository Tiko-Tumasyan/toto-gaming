package am.qa.totogaming.tests.login;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import am.qa.totogaming.page.guest.TotoGuestPage;
import am.qa.totogaming.page.login.TotoLoginWindow;
import am.qa.totogaming.test.base.TotogamingBaseTest;
import am.qa.totogaming.util.DriverUtil;

public class TotogamingLoginTest extends TotogamingBaseTest {

	
	@Test
	@Parameters({"totoFakeUsername", "totoFakePassword"})
	public void loginWithIncorrectCredentials(String totoFakeUsername, String totoFakePassword) {
		TotoGuestPage guestPage = new TotoGuestPage(driver);
		TotoLoginWindow totoLoginWindow = guestPage.openLoginDialog();
		totoLoginWindow.fillTotoLoginCredentials(totoFakeUsername, totoFakePassword);
		totoLoginWindow.submitTotoLoginForm();
		DriverUtil.waitForElementPresent(driver, 5, "//span[@class='field-validation-error']");
	}
	
	@Test(dependsOnMethods = { "loginWithIncorrectCredentials" })
	@Parameters({"totoUsername", "totoFakeUsername"})
	public void loginWithCorrectLoginIncorrectPassword(String totoUsername, String totoFakePassword) {
		TotoLoginWindow totoLoginWin = new TotoLoginWindow(driver);
		totoLoginWin.fillTotoLoginCredentials(totoUsername, totoFakePassword);
		totoLoginWin.submitTotoLoginForm();
		DriverUtil.waitForElementPresent(driver, 5, "//span[@class='field-validation-error']");
	}
	
	@Test(dependsOnMethods = { "loginWithCorrectLoginIncorrectPassword" })
	@Parameters({"totoPassword", "totoFakeUsername"})
	public void loginWithIncorrectLoginCorrectPassword(String totoFakeUsername, String totoPassword) {
		TotoLoginWindow totoLoginWin = new TotoLoginWindow(driver);
		totoLoginWin.fillTotoLoginCredentials(totoFakeUsername, totoPassword);
		totoLoginWin.submitTotoLoginForm();
		DriverUtil.waitForElementPresent(driver, 5, "//span[@class='field-validation-error']");
	}
	
}
