package am.qa.totogaming.tests.menus;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import am.qa.totogaming.main.menu.buttons.pages.TotoBelotePage;
import am.qa.totogaming.main.menu.buttons.pages.TotoCasinoPage;
import am.qa.totogaming.main.menu.buttons.pages.TotoEvolutionLiveCasinoPage;
import am.qa.totogaming.main.menu.buttons.pages.TotoKenoPage;
import am.qa.totogaming.main.menu.buttons.pages.TotoPokerPage;
import am.qa.totogaming.main.menu.buttons.pages.TotoSportTournamentPage;
import am.qa.totogaming.main.menu.buttons.pages.TotoSportsPage;
import am.qa.totogaming.page.guest.TotoGuestPage;
import am.qa.totogaming.page.login.TotoLoginWindow;
import am.qa.totogaming.test.base.TotogamingBaseTest;
import am.qa.totogaming.util.DriverUtil;

public class TotogamingMainGamesBanner extends TotogamingBaseTest {

	@Test
	public void testSportBanner() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		
		TotoSportsPage sportsPage = guest.openBannersSportsPage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//a[@id='mainSportBtn' and contains(@class, 'active')]");//div[contains(@class, 'home_page_left_panel')] miavorumy
		
		
		sportsPage.sportsBackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
		
	}
	
	@Test(dependsOnMethods = { "testSportBanner" })
	public void testSportTournamentBanner() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		
		TotoSportTournamentPage sportTournamentPage = guest.openSportTournamentPage();
		
		//irany chi DriverUtil.waitForElementPresent(driver, 3, "//a[@id='mainSportBtn' and contains(@class, 'active')]");//div[contains(@class, 'home_page_left_panel')]
		
		
		sportTournamentPage.sportsTournamentBackToHomePage();
		
		guest.openLangDropDown();
		guest.selectEngLang();
		DriverUtil.waitForElementPresent(driver, 3, "//span[text()='en']");
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
		
	}
	
	@Test(dependsOnMethods = { "testSportTournamentBanner" })
	public void testKenoBanner() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		TotoKenoPage kenoPage  = guest.openBannersKenoPage();
//		DriverUtil.waitForElementPresent(driver, 5, "//div[@class='top-players-container-header-item for-keno']");
		kenoPage.kenoBackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
		
	}
	
	@Test(dependsOnMethods = { "testKenoBanner" })
	public void testCasinoBanner() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		TotoCasinoPage casinoPage = guest.openBannersCasinoPage();
		
//		DriverUtil.waitForElementPresent(driver, 3, "//a[@class='active navItem' and text()='Casino']");
		
		casinoPage.casinoBackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
		
	}
	
	@Test(dependsOnMethods = { "testCasinoBanner" })
	public void testLiveCasinoBanner() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		TotoEvolutionLiveCasinoPage evolutionLiveCasinoPage = guest.openBannersLiveCasinoPage();
//		DriverUtil.waitForElementPresent(driver, 20, "//div[contains(@class, 'TablesWrapper')]");
		evolutionLiveCasinoPage.evolutionLiveCasinoBackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
		
	}
	
	@Test(dependsOnMethods = { "testLiveCasinoBanner" })
	public void testBeloteBanner() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		TotoBelotePage belotePage = guest.openBannersBelotePage();
//		DriverUtil.waitForElementPresent(driver, 5, "//a[@id='belote-lottery']");
		belotePage.beloteBackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
		
	}
	
	@Parameters({"totoUsername", "totoPassword"})
	@Test(dependsOnMethods = { "testBeloteBanner" })
	public void testPokerBanner(String totoUsername, String totoPassword) {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		TotoPokerPage pokerPage = guest.openBannersPokerPage();
		TotoLoginWindow totoLoginWindow = pokerPage.openPokerPageLoginDialog();
		totoLoginWindow.fillTotoLoginCredentials(totoUsername, totoPassword);
		totoLoginWindow.submitTotoLoginForm();
		
//		DriverUtil.waitForElementPresent(driver, 5, "//div[contains(@class, 'topFilterRows')]//div[contains(@class, 'TabButtonsRow__items')]");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		pokerPage.pokerBackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
		
	}
	
}
