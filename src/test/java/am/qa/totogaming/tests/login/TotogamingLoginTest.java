package am.qa.totogaming.tests.login;

import org.testng.annotations.Test;

import am.qa.totogaming.page.guest.TotoGuestPage;
import am.qa.totogaming.page.login.TotoLoginWindow;
import am.qa.totogaming.test.base.TotogamingBaseTest;
import am.qa.totogaming.util.DriverUtil;
import am.qa.totogaming.util.ReadFromFileUtil;

public class TotogamingLoginTest extends TotogamingBaseTest {

	
	@Test
	public void loginWithIncorrectCredentials() throws Exception {
		
		String totoPassword = ReadFromFileUtil.getProperties("fakePassword");
		 String totoUsername =	ReadFromFileUtil.getProperties("fakeUser");
		
		 TotoGuestPage guestPage = new TotoGuestPage(driver);
		TotoLoginWindow totoLoginWindow = guestPage.openLoginDialog();
		totoLoginWindow.fillTotoLoginCredentials(totoUsername, totoPassword);
		totoLoginWindow.submitTotoLoginForm();
		DriverUtil.waitForElementPresent(driver, 5, "//span[@class='field-validation-error']");
		
	}
	
	@Test
	public void loginWithCorrectLoginIncorrectPassword() throws Exception {
		 String totoPassword = ReadFromFileUtil.getProperties("fakePassword");
		 String totoUsername =	ReadFromFileUtil.getProperties("user");
		
		 TotoGuestPage guestPage = new TotoGuestPage(driver);
		TotoLoginWindow totoLoginWindow = guestPage.openLoginDialog();
		totoLoginWindow.fillTotoLoginCredentials(totoUsername, totoPassword);
		totoLoginWindow.submitTotoLoginForm();
		DriverUtil.waitForElementPresent(driver, 5, "//span[@class='field-validation-error']");
	}
	
	@Test
	public void loginWithIncorrectLoginCorrectPassword() throws Exception {
		
		String totoPassword = ReadFromFileUtil.getProperties("password");
		 String totoUsername =	ReadFromFileUtil.getProperties("fakeUser");
		
		 TotoGuestPage guestPage = new TotoGuestPage(driver);
		TotoLoginWindow totoLoginWindow = guestPage.openLoginDialog();
		totoLoginWindow.fillTotoLoginCredentials(totoUsername, totoPassword);
		totoLoginWindow.submitTotoLoginForm();
		DriverUtil.waitForElementPresent(driver, 5, "//span[@class='field-validation-error']");
		
	}
	
}
