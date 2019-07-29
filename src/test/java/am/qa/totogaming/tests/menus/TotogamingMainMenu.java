package am.qa.totogaming.tests.menus;

import java.util.ArrayList;

import org.testng.annotations.Test;

import am.qa.totogaming.page.guest.TotoGuestPage;
import am.qa.totogaming.page.login.TotoLoginWindow;
import am.qa.totogaming.reg.TotoRegWindow;
import am.qa.totogaming.test.base.TotogamingBaseTest;
import am.qa.totogaming.util.DriverUtil;

public class TotogamingMainMenu extends TotogamingBaseTest {

//	TC ID 28
	@Test
	public void testPromotionsButton() {

		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openPromotionsPage();

		ArrayList<String> promoTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(promoTab.get(1));

		DriverUtil.waitForElementPresent(driver, 3, "//div[@id='promo_container']");
		driver.close();
		driver.switchTo().window(promoTab.get(0));

	}

//	TC ID 29
	@Test
	public void testTotoExpertLink() {

		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.clickOnTotoExpertLink();

		ArrayList<String> totoExpertTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(totoExpertTab.get(1));

		DriverUtil.waitForElementPresent(driver, 3, "//div[@id='totoexpert-top-nav-wrap']");
		driver.close();
		driver.switchTo().window(totoExpertTab.get(0));

	}

//	TC ID 31
	@Test
	public void testRegisterButton() {
		TotoGuestPage guest = new TotoGuestPage(driver);

		TotoRegWindow regWin = guest.openRegDialog();

		DriverUtil.waitForElementPresent(driver, 3, "//form[@automation='register_form']");

		regWin.closeRegWin();

	}

//	TC ID 30
	@Test
	public void testLogInButton() {

		TotoGuestPage guest = new TotoGuestPage(driver);

		TotoLoginWindow loginWin = guest.openLoginDialog();

		DriverUtil.waitForElementPresent(driver, 3, "//div[@id='login_container']");

		loginWin.closeLoginWin();

	}

//	TC ID 32
	@Test
	public void languageChangeToArm() {

		TotoGuestPage dropDownOpen = new TotoGuestPage(driver);

		dropDownOpen.openLangDropDown();
		dropDownOpen.selectArmLang();
		DriverUtil.waitForElementPresent(driver, 3, "//span[text()='hy']");

	}

}
