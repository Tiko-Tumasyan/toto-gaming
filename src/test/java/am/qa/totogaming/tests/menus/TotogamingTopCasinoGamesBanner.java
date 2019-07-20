package am.qa.totogaming.tests.menus;

import java.util.ArrayList;

import org.testng.annotations.Test;

import am.qa.totogaming.page.guest.TotoGuestPage;
import am.qa.totogaming.test.base.TotogamingBaseTest;
import am.qa.totogaming.util.DriverUtil;

public class TotogamingTopCasinoGamesBanner extends TotogamingBaseTest {

	@Test
	public void luckyLadysCharmTest() {
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openLuckyLadysCharmPage();
		ArrayList<String> promoTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(promoTab.get(1));
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_game_center_block']");
//xaxi anuny	DriverUtil.waitForElementPresent(driver, 3, "");
		driver.close();
		driver.switchTo().window(promoTab.get(0));
	}
	
	@Test(dependsOnMethods = "luckyLadysCharmTest")
	public void superHot40Test() {
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.open40SuperHotPage();
		ArrayList<String> promoTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(promoTab.get(1));
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_game_center_block']");
//xaxi anuny	DriverUtil.waitForElementPresent(driver, 3, "");
		driver.close();
		driver.switchTo().window(promoTab.get(0));
	}
	
	@Test(dependsOnMethods = "superHot40Test")
	public void sugarPopTest() {
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openSugarPopPage();
		ArrayList<String> promoTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(promoTab.get(1));
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_game_center_block']");
//xaxi anuny	DriverUtil.waitForElementPresent(driver, 3, "");
		driver.close();
		driver.switchTo().window(promoTab.get(0));
	}
	
	@Test(dependsOnMethods = "sugarPopTest")
	public void bookOfSunTest() {
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openBookOfSunPage();
		ArrayList<String> promoTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(promoTab.get(1));
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_game_center_block']");
//xaxi anuny	DriverUtil.waitForElementPresent(driver, 3, "");
		driver.close();
		driver.switchTo().window(promoTab.get(0));
	}
}
