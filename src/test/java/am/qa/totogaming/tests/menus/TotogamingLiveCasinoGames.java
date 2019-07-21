package am.qa.totogaming.tests.menus;

import java.util.ArrayList;

import org.testng.annotations.Test;

import am.qa.totogaming.page.guest.TotoGuestPage;
import am.qa.totogaming.test.base.TotogamingBaseTest;
import am.qa.totogaming.util.DriverUtil;

public class TotogamingLiveCasinoGames extends TotogamingBaseTest {

	@Test
	public void blackJackTest() {
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openBlackJackPage();
		ArrayList<String> promoTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(promoTab.get(1));
		DriverUtil.waitForElementPresent(driver, 5, "//div[@data-role='tables-inner-scrollable']");
//		DriverUtil.waitForElementPresent(driver, 3, "//div[@data-game='blackjack' and contains(@class, 'active')]");
		driver.close();
		driver.switchTo().window(promoTab.get(0));
	}
	
	@Test
	public void rouletteTest() {
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openRoulettePage();
		ArrayList<String> promoTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(promoTab.get(1));
		DriverUtil.waitForElementPresent(driver, 5, "//div[@data-role='tables-inner-scrollable']");
//		DriverUtil.waitForElementPresent(driver, 3, "//div[@data-game='roulette' and contains(@class, 'active')]");
		driver.close();
		driver.switchTo().window(promoTab.get(0));
	}
	
	@Test
	public void baccaratTest() {
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openBaccaratPage();
		ArrayList<String> promoTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(promoTab.get(1));
		DriverUtil.waitForElementPresent(driver, 5, "//div[@data-role='tables-inner-scrollable']");
//		DriverUtil.waitForElementPresent(driver, 3, "//div[@data-game='baccarat' and contains(@class, 'active')]");
		driver.close();
		driver.switchTo().window(promoTab.get(0));
	}
	
	@Test
	public void dreamCatcherTest() {
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openDreamCatcherPage();
		ArrayList<String> promoTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(promoTab.get(1));
		DriverUtil.waitForElementPresent(driver, 5, "//div[@data-role='tables-inner-scrollable']");
//		DriverUtil.waitForElementPresent(driver, 3, "//div[@data-game='blackjack' and contains(@class, 'active')]");
		driver.close();
		driver.switchTo().window(promoTab.get(0));
	}
	
}
