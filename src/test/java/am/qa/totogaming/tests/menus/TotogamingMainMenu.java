package am.qa.totogaming.tests.menus;

import java.util.ArrayList;

import org.testng.annotations.Test;

import am.qa.totogaming.page.guest.TotoGuestPage;
import am.qa.totogaming.page.login.TotoLoginWindow;
import am.qa.totogaming.page.registration.TotoRegWindow;
import am.qa.totogaming.test.base.TotogamingBaseTest;
import am.qa.totogaming.util.DriverUtil;

public class TotogamingMainMenu extends TotogamingBaseTest{
	@Test
	public void testPromotionsButton() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openPromotionsPage();
		
		ArrayList<String> promoTab = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(promoTab.get(1));
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@id='promo_container']");
		driver.switchTo().window(promoTab.get(0));
		
	}
	@Test
	public void testTotoExpertLink() {
		
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.clickOnTotoExpertLink();
		
		ArrayList<String> totoExpertTab = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(totoExpertTab.get(2));
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@id='totoexpert-top-nav-wrap']");
		driver.switchTo().window(totoExpertTab.get(0));
		
	}
	
//	@Test(dependsOnMethods = { "testTotoExpertLink" })
//	public void testWatch() {
//		
//	}
	
	@Test
	public void testRegisterButton() {
		TotoGuestPage guest = new TotoGuestPage(driver);
		
		TotoRegWindow regWinClose = guest.openRegDialog();
		
		DriverUtil.waitForElementPresent(driver, 3, "//form[@automation='register_form']");
		
		regWinClose.closeRegWin();
		
	}
	
	@Test
	public void testLogInButton() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		
		TotoLoginWindow loginWin = guest.openLoginDialog();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@id='login_container']");
		
		loginWin.closeLoginWin();
		
	}
		
}
