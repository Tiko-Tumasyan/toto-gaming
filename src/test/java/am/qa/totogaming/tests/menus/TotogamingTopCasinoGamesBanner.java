package am.qa.totogaming.tests.menus;

import java.util.ArrayList;

import org.testng.annotations.Test;

import am.qa.totogaming.page.guest.TotoGuestPage;
import am.qa.totogaming.test.base.TotogamingBaseTest;
import am.qa.totogaming.util.DriverUtil;

public class TotogamingTopCasinoGamesBanner extends TotogamingBaseTest {

//	TC ID 40
	@Test
	public void luckyLadysCharmTest() {
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openLuckyLadysCharmPage();
		ArrayList<String> promoTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(promoTab.get(1));
		DriverUtil.waitForElementPresent(driver, 5, "//div[@class='tl_game_center_block']");
		DriverUtil.waitForElementPresent(driver, 3, "//div[contains(text(),'Lucky Lady')]");
		driver.close();
		driver.switchTo().window(promoTab.get(0));
	}
	
//	TC ID 41
	@Test
	public void superHot40Test() {
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.open40SuperHotPage();
		ArrayList<String> promoTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(promoTab.get(1));
		DriverUtil.waitForElementPresent(driver, 5, "//div[@class='tl_game_center_block']");
		DriverUtil.waitForElementPresent(driver, 3, "//div[text()='40 Super Hot']");
		driver.close();
		driver.switchTo().window(promoTab.get(0));
	}
	
//	TC ID 42
	@Test
	public void sugarPopTest() {
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openSugarPopPage();
		ArrayList<String> promoTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(promoTab.get(1));
		DriverUtil.waitForElementPresent(driver, 5, "//div[@class='tl_game_center_block']");
		DriverUtil.waitForElementPresent(driver, 3, "//div[text()='Sugar Pop']");
		driver.close();
		driver.switchTo().window(promoTab.get(0));
	}
	
//	TC ID 43
	@Test
	public void bookOfSunTest() {
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openBookOfSunPage();
		ArrayList<String> promoTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(promoTab.get(1));
		DriverUtil.waitForElementPresent(driver, 5, "//div[@class='tl_game_center_block']");
		DriverUtil.waitForElementPresent(driver, 3, "//div[text()='Book of Sun']");
		driver.close();
		driver.switchTo().window(promoTab.get(0));
	}
}
