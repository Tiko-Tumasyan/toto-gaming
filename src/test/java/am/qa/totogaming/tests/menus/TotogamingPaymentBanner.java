package am.qa.totogaming.tests.menus;

import java.util.ArrayList;

import org.testng.annotations.Test;

import am.qa.totogaming.page.guest.TotoGuestPage;
import am.qa.totogaming.test.base.TotogamingBaseTest;
import am.qa.totogaming.util.DriverUtil;

public class TotogamingPaymentBanner extends TotogamingBaseTest {

//	TC ID 85
	@Test
	public void testArCaPaymentLink() {

		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openArCaPaymentPage();

		ArrayList<String> promoTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(promoTab.get(1));

		DriverUtil.waitForElementPresent(driver, 3, "//a[contains(@title, 'ArCa')]");
		driver.close();
		driver.switchTo().window(promoTab.get(0));

	}
	
//	TC ID 86
	@Test
	public void testIDramPaymentLink() {

		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openIDramPaymentPage();

		ArrayList<String> promoTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(promoTab.get(1));

		DriverUtil.waitForElementPresent(driver, 3, "//a[@class='button-custom login' and contains(@href, 'idram')]");
		driver.close();
		driver.switchTo().window(promoTab.get(0));

	}
	
//	TC ID 87
//	@Test
	public void testBankPaymentLink() {

		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openBankPaymentPage();

		ArrayList<String> promoTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(promoTab.get(1));

//		DriverUtil.waitForElementPresent(driver, 3, "");
		driver.close();
		driver.switchTo().window(promoTab.get(0));

	}
	
//	TC ID 88
	@Test
	public void testMobiDramPaymentLink() {

		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openMobiDramPaymentPage();

		ArrayList<String> promoTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(promoTab.get(1));

		DriverUtil.waitForElementPresent(driver, 3, "//a[contains(@href, 'login.mobidram')]");
		driver.close();
		driver.switchTo().window(promoTab.get(0));

	}
	
//	TC ID 89
	@Test
	public void testTelCellPaymentLink() {

		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openTelCellPaymentPage();

		ArrayList<String> promoTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(promoTab.get(1));

		DriverUtil.waitForElementPresent(driver, 3, "//body[@class='telcell']");
		driver.close();
		driver.switchTo().window(promoTab.get(0));

	}
	
//	TC ID 90
	@Test
	public void testEasyPayPaymentLink() {

		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openEasyPayPaymentPage();

		ArrayList<String> promoTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(promoTab.get(1));

		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='top-baner-contain']//img[contains(@src, 'easypay')]");
		driver.close();
		driver.switchTo().window(promoTab.get(0));

	}
	
//	TC ID 91
//	@Test
	public void testVisaMasterPaymentLink() {

		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openVisaMasterPaymentPage();

		ArrayList<String> promoTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(promoTab.get(1));

//		DriverUtil.waitForElementPresent(driver, 3, "");
		driver.close();
		driver.switchTo().window(promoTab.get(0));

	}
	
//	TC ID 92
//	@Test
	public void testCashAmdPaymentLink() {

		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openCashAmdPaymentPage();

		ArrayList<String> promoTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(promoTab.get(1));

//		DriverUtil.waitForElementPresent(driver, 3, "");
		driver.close();
		driver.switchTo().window(promoTab.get(0));

	}
	
}
