package am.qa.totogaming.dependency.logins;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import am.qa.totogaming.page.guest.TotoGuestPage;
import am.qa.totogaming.page.login.TotoLoginWindow;
import am.qa.totogaming.test.base.TotogamingBaseTest;
import am.qa.totogaming.util.DriverUtil;

public class FailAndPassLogins extends TotogamingBaseTest {
	
    @Test(dependsOnMethods = { "loginWithIncorrectLoginCredentials" })
    @Parameters({ "totoUsername", "totoPassword"})
    public void loginWithCorrectLoginCredentials(String totoUsername, String totoPassword) {

		TotoLoginWindow totoLoginWin = new TotoLoginWindow(driver);
		totoLoginWin.fillTotoLoginCredentials(totoUsername, totoPassword);
		totoLoginWin.submitTotoLoginForm();
		
		DriverUtil.waitForElementPresent(driver, 5, "//span[@class='tg-ico']");
    }
 
    @Test
    @Parameters({ "totoFakeUsername", "totoFakePassword"})
    public void loginWithIncorrectLoginCredentials(String totoFakeUsername, String totoFakePassword) {
    	driver.get("https://totogaming.am");
    	TotoGuestPage guest = new TotoGuestPage(driver);
		TotoLoginWindow totoLoginWin = guest.openLoginDialog();

		totoLoginWin.fillTotoLoginCredentials(totoFakeUsername, totoFakePassword);
		totoLoginWin.submitTotoLoginForm();
		
		DriverUtil.waitForElementPresent(driver, 3, "//span[@class='field-validation-error']");
		
    }
    
}
