package am.qa.totogaming.tests.menus;

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
import am.qa.totogaming.page.member.TotoMemberPage;
import am.qa.totogaming.test.base.TotogamingBaseTest;
import am.qa.totogaming.util.DriverUtil;
import am.qa.totogaming.util.ReadFromFileUtil;

public class TotogamingMainGamesBanner extends TotogamingBaseTest {

//	TC ID 34
	@Test
	public void testSportBanner() {

		TotoGuestPage guest = new TotoGuestPage(driver);

		TotoSportsPage sportsPage = guest.openBannersSportsPage();

		DriverUtil.waitForElementPresent(driver, 3, "//a[@id='mainSportBtn' and contains(@class, 'active')]");
		DriverUtil.waitForElementPresent(driver, 3, "//div[@id='live_betting']");

		sportsPage.sportsBackToHomePage();

		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");

	}

//	TC ID 33
	@Test
	public void testSportTournamentBanner() {

		TotoGuestPage guest = new TotoGuestPage(driver);

		TotoSportTournamentPage sportTournamentPage = guest.openSportTournamentPage();
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='hero']");
		
		sportTournamentPage.sportsTournamentBackToHomePage();

		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");

	}

//	TC ID 35
	@Test
	public void testKenoBanner() {

		TotoGuestPage guest = new TotoGuestPage(driver);
		TotoKenoPage kenoPage = guest.openBannersKenoPage();
		DriverUtil.waitForElementPresent(driver, 3, "//button[text()='Keno' and contains(@class, 'active')]");
		DriverUtil.waitForElementPresent(driver, 5, "//iframe[@id='betongamesFrame']");
		
		kenoPage.kenoBackToHomePage();

		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");

	}

//	TC ID 36
	@Test
	public void testCasinoBanner() {

		TotoGuestPage guest = new TotoGuestPage(driver);
		TotoCasinoPage casinoPage = guest.openBannersCasinoPage();

		DriverUtil.waitForElementPresent(driver, 3, "//a[@class='active navItem' and text()='Casino']");
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_games flex']");
		casinoPage.casinoBackToHomePage();

		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");

	}

//	TC ID 37
	@Test
	public void testLiveCasinoBanner() {

		TotoGuestPage guest = new TotoGuestPage(driver);
		TotoEvolutionLiveCasinoPage evolutionLiveCasinoPage = guest.openBannersLiveCasinoPage();
		DriverUtil.waitForElementPresent(driver, 3, "//button[text()='Live Casino' and contains(@class, 'active')]");
		DriverUtil.waitForElementPresent(driver, 5, "//div[@class='evolutionFrame_block']");
		evolutionLiveCasinoPage.evolutionLiveCasinoBackToHomePage();

		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");

	}

//	TC ID 38
	@Test
	public void testBeloteBanner() {

		TotoGuestPage guest = new TotoGuestPage(driver);
		TotoBelotePage belotePage = guest.openBannersBelotePage();
		DriverUtil.waitForElementPresent(driver, 3, "//button[text()='Games' and contains(@class, 'active')]");
		DriverUtil.waitForElementPresent(driver, 5, "//iframe[@id='beloteFrame']");
		belotePage.beloteBackToHomePage();

		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");

	}

//	TC ID 39
	@Test
	public void testPokerBanner() throws Exception {
		String totoPassword = ReadFromFileUtil.getProperties("password");
		String totoUsername = ReadFromFileUtil.getProperties("user");

		TotoGuestPage guestPage = new TotoGuestPage(driver);
		TotoLoginWindow totoLoginWindow = guestPage.openLoginDialog();
		totoLoginWindow.fillTotoLoginCredentials(totoUsername, totoPassword);
		totoLoginWindow.submitTotoLoginForm();
		DriverUtil.waitForElementPresent(driver, 6, "//div[@class='tl_logged_in flex']");
		
		TotoMemberPage memberPage = new TotoMemberPage(driver);
		
		TotoPokerPage pokerPage = memberPage.openMemberPokerPage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//a[text()='Poker' and contains(@class, 'active')]");
		DriverUtil.waitForElementPresent(driver, 3, "//iframe[@id='_EventBetFrame']");
		
		pokerPage.pokerBackToHomePage();
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
	}

}
