package am.qa.totogaming.test.base;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import am.qa.totogaming.page.guest.TotoGuestPage;
import am.qa.totogaming.page.login.TotoLoginWindow;
import am.qa.totogaming.util.DriverUtil;

public class TotogamingLoginBaseTest extends TotogamingBaseTest {
	
	@Parameters({"totoUsername", "totoPassword"})
	@BeforeClass
	public void loginToto(String totoUsername, String totoPassword) {
		driver.get("https://totogaming.am");
		//open login dialog
		TotoGuestPage guestPage = new TotoGuestPage(driver);
		TotoLoginWindow totoLoginWindow = guestPage.openLoginDialog();
		totoLoginWindow.fillTotoLoginCredentials(totoUsername, totoPassword);
		totoLoginWindow.submitTotoLoginForm();
		DriverUtil.waitForElementPresent(driver, 5, "//span[@class='tg-ico']");
		
	}
	
	
}
