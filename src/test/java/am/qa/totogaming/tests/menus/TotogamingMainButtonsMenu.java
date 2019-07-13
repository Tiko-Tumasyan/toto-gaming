package am.qa.totogaming.tests.menus;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import am.qa.totogaming.main.menu.buttons.pages.TotoBaccaratPage;
import am.qa.totogaming.main.menu.buttons.pages.TotoBackgammonPage;
import am.qa.totogaming.main.menu.buttons.pages.TotoBelotePage;
import am.qa.totogaming.main.menu.buttons.pages.TotoBetOnPokerPage;
import am.qa.totogaming.main.menu.buttons.pages.TotoCasinoPage;
import am.qa.totogaming.main.menu.buttons.pages.TotoCrashPage;
import am.qa.totogaming.main.menu.buttons.pages.TotoDiceDuelPage;
import am.qa.totogaming.main.menu.buttons.pages.TotoDicePage;
import am.qa.totogaming.main.menu.buttons.pages.TotoDominoPage;
import am.qa.totogaming.main.menu.buttons.pages.TotoEvolutionLiveCasinoPage;
import am.qa.totogaming.main.menu.buttons.pages.TotoFastGamesPage;
import am.qa.totogaming.main.menu.buttons.pages.TotoGoldKenoPage;
import am.qa.totogaming.main.menu.buttons.pages.TotoHiLoPage;
import am.qa.totogaming.main.menu.buttons.pages.TotoKenoPage;
import am.qa.totogaming.main.menu.buttons.pages.TotoLivePage;
import am.qa.totogaming.main.menu.buttons.pages.TotoLucky5Page;
import am.qa.totogaming.main.menu.buttons.pages.TotoLucky6Page;
import am.qa.totogaming.main.menu.buttons.pages.TotoLucky7Page;
import am.qa.totogaming.main.menu.buttons.pages.TotoLuckyStreakLiveCasinoPage;
import am.qa.totogaming.main.menu.buttons.pages.TotoSportLoto5From36Page;
import am.qa.totogaming.main.menu.buttons.pages.TotoSportLoto7From42Page;
import am.qa.totogaming.main.menu.buttons.pages.TotoSportsPage;
import am.qa.totogaming.main.menu.buttons.pages.TotoSuperJackpotPage;
import am.qa.totogaming.main.menu.buttons.pages.TotoToto21Page;
import am.qa.totogaming.main.menu.buttons.pages.TotoWarOfBetsPage;
import am.qa.totogaming.main.menu.buttons.pages.TotoWheelPage;
import am.qa.totogaming.page.guest.TotoGuestPage;
import am.qa.totogaming.test.base.TotogamingBaseTest;
import am.qa.totogaming.util.DriverUtil;

public class TotogamingMainButtonsMenu extends TotogamingBaseTest{
	
//	@Test
	public void testSportsButton() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		
		TotoSportsPage sportsPage = guest.openSportsPage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//a[@id='mainSportBtn' and contains(@class, 'active')]");//div[contains(@class, 'home_page_left_panel')]
		
		
		sportsPage.sportsBackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
	}
	
//	@Test(dependsOnMethods = { "testSportsButton" })
	public void testLiveButton() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		
		TotoLivePage livePage = guest.openLivePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//a[@id='mainLiveBtn' and contains(@class, 'active')]");
		
		livePage.liveBackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
	}
	
//	@Test(dependsOnMethods = { "testLiveButton" })
	public void testCasinoButton() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		TotoCasinoPage casinoPage = guest.openCasinoPage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//a[@class='active navItem' and text()='Casino']");
		
		casinoPage.casinoBackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
	}
	
//	@Test(dependsOnMethods = { "testCasinoButton" })
	public void testEvolutionLiveCasinoButton() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openLiveCasinoDropDown();
		
		TotoEvolutionLiveCasinoPage evolutionLiveCasinoPage = guest.openEvolutionLiveCasinoPage();
//		DriverUtil.waitForElementPresent(driver, 20, "//div[contains(@class, 'TablesWrapper')]");
		evolutionLiveCasinoPage.evolutionLiveCasinoBackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
	}
	
//	@Test(dependsOnMethods = { "testEvolutionLiveCasinoButton" })
	public void testLuckyStreakLiveCasinoButton() {
//		?????????????????????????????????????????????????
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openLiveCasinoDropDown();
		
		TotoLuckyStreakLiveCasinoPage luckyStreakLiveCasinoPage = guest.openLuckyStreakLiveCasinoPage();
		luckyStreakLiveCasinoPage.luckyStreakLiveCasinoBackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
	}
	
//	@Test(dependsOnMethods = { "testLuckyStreakLiveCasinoButton" })
	public void testLucky7Button() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openTvGamesDropDown();
		
//		DriverUtil.waitForElementPresent(driver, 3, "//div[contains(@class, 'active')]/div[text()='Lucky 7']");
		
		TotoLucky7Page lucky7Page = guest.openTotoLucky7Page();
		lucky7Page.lucky7BackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
	}
	
//	@Test(dependsOnMethods = { "testLucky7Button" })
	public void testLucky6Button() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openTvGamesDropDown();
		
//		DriverUtil.waitForElementPresent(driver, 3, "//div[contains(@class, 'active')]/div[text()='Lucky 6']");
		
		TotoLucky6Page lucky6Page = guest.openTotoLucky6Page();
		lucky6Page.lucky6BackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
		
	}
	
//	@Test(dependsOnMethods = { "testLucky6Button" })
	public void testLucky5Button() {
		

		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openTvGamesDropDown();
		
//		DriverUtil.waitForElementPresent(driver, 3, "//div[contains(@class, 'active')]/div[text()='Lucky 5']");
		
		TotoLucky5Page lucky5Page = guest.openTotoLucky5Page();
		lucky5Page.lucky5BackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
		
	}
	
//	@Test(dependsOnMethods = { "testLucky5Button" })
	public void testDiceButton() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openTvGamesDropDown();
		
//		DriverUtil.waitForElementPresent(driver, 3, "//div[contains(@class, 'active')]/div[text()='Dice']");
		
		TotoDicePage dicePage = guest.openTotoDicePage();
		dicePage.diceBackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
		
	}
	
//	@Test(dependsOnMethods = { "testDiceButton" })
	public void testDiceDuelButton() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openTvGamesDropDown();
		
//		DriverUtil.waitForElementPresent(driver, 3, "//div[contains(@class, 'active')]/div[text()='Dice Duel']");
		
		TotoDiceDuelPage diceDuelPage = guest.openTotoDiceDuelPage();
		diceDuelPage.diceDuelBackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
		
		
	}
	
//	@Test(dependsOnMethods = { "testDiceDuelButton" })
	public void testWheelButton() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openTvGamesDropDown();
		
//		DriverUtil.waitForElementPresent(driver, 3, "//div[contains(@class, 'active')]/div[text()='Wheel']");
		
		TotoWheelPage wheelPage = guest.openTotoWheelPage();
		wheelPage.wheelBackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
		
	}
	
//	@Test(dependsOnMethods = { "testWheelButton" })
	public void testBetOnPokerButton() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openTvGamesDropDown();
		
//		DriverUtil.waitForElementPresent(driver, 3, "//div[contains(@class, 'active')]/div[text()='Bet On Poker']");
		
		TotoBetOnPokerPage betOnPokerPage = guest.openTotoBetOnPokerPage();
		betOnPokerPage.betOnPokerBackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
		
	}
	
//	@Test(dependsOnMethods = { "testBetOnPokerButton" })
	public void testBaccaratButton() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openTvGamesDropDown();
		
//		DriverUtil.waitForElementPresent(driver, 3, "//div[contains(@class, 'active')]/div[text()='Baccarat']");
		
		TotoBaccaratPage baccaratPage = guest.openTotoBaccaratPage();
		baccaratPage.baccaratBackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
		
	}
	
//	@Test(dependsOnMethods = { "testBaccaratButton" })
	public void testWarOfBetsButton() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openTvGamesDropDown();
		
//		DriverUtil.waitForElementPresent(driver, 3, "//div[contains(@class, 'active')]/div[text()='War of Bets']");
		
		TotoWarOfBetsPage warOfBetsPage = guest.openTotoWarOfBetsPage();
		warOfBetsPage.warOfBetsBackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
		
	}
	
//	@Test(dependsOnMethods = { "testWarOfBetsButton" })
	public void testSportLoto5From36Button() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openTvGamesDropDown();
		
//		DriverUtil.waitForElementPresent(driver, 3, "//li[contains(@class, 'active')]//span[contains(text(), 'Sportloto 5 from 36')]");
		
		TotoSportLoto5From36Page sportLoto5From36Page = guest.openTotoSportLoto5From36Page();
		sportLoto5From36Page.sportLoto5BackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
		
	}
	
//	@Test(dependsOnMethods = { "testSportLoto5From36Button" })
	public void testSportLoto7From42Button() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openTvGamesDropDown();
		
//		DriverUtil.waitForElementPresent(driver, 3, "//li[contains(@class, 'active')]//span[contains(text(), 'Sportloto 7 from 42')]");
		
		TotoSportLoto7From42Page sportLoto7From42Page = guest.openTotoSportLoto7From42Page();
		sportLoto7From42Page.sportLoto7BackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
		
	}
	
//	@Test(dependsOnMethods = { "testSportLoto7From42Button" })
	public void testSuperJackpotButton() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openTvGamesDropDown();
		
//		DriverUtil.waitForElementPresent(driver, 3, "//li[contains(@class, 'active')]//span[contains(text(), 'Superjackpot')]");
		
		TotoSuperJackpotPage superJackpotPage = guest.openTotoSuperJackpotPage();
		superJackpotPage.superJackpotBackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
		
	}
	
//	@Test(dependsOnMethods = { "testSuperJackpotButton" })
	public void testFastGamesButton() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		
		DriverUtil.waitForElementPresent(driver, 3, "//a[@class='navItem active' and text()='Fast games']");
		
		TotoFastGamesPage fastGamesPage = guest.openFastGamesPage();
		fastGamesPage.fastGamesBackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
	}
		
	@Parameters({"totoUsername", "totoPassword"})
//	@Test(dependsOnMethods = { "testFastGamesButton" })
	public void testPokerButton(String totoUsername, String totoPassword) {
//		inchvor zibil, anhaskanali pahvacq
//		TotoGuestPage guest = new TotoGuestPage(driver);
//		guest.openPokerPage();
//		TotoLoginWindow totoLoginWindow = new TotoLoginWindow(driver);
//		totoLoginWindow.fillTotoLoginCredentials(totoUsername, totoPassword);
//		totoLoginWindow.submitTotoLoginForm();
//		
//		TotoMemberPage member = new TotoMemberPage(driver);
//		
//		DriverUtil.waitForElementPresent(driver, 3, "//div[contains(@class, 'sportHeaderLang')]");
//		
//		member.openSportsLangDropDown();
//		member.selectSportsEngLang();
//		DriverUtil.waitForElementPresent(driver, 3, "//div[contains(@class, 'tg-flag-en')]");
//		
//		member.openSportsPokerPage();
//		
//		TotoPokerPage pokerPage = new TotoPokerPage(driver);
//		pokerPage.clickOnPokerLogin();
	}
	
//	@Test(dependsOnMethods = { "testPokerButton" })
	public void testBeloteButton() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openGamesDropDown();
		TotoBelotePage belotePage = guest.openBelotePage();
//		DriverUtil.waitForElementPresent(driver, 5, "//a[@id='belote-lottery']");
		belotePage.beloteBackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
		
	}
//	
//	@Test(dependsOnMethods = { "testBeloteButton" })
	public void testBackgammonButton() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openGamesDropDown();
		TotoBackgammonPage backgammonPage = guest.openBackgammonPage();
//		DriverUtil.waitForElementPresent(driver, 5, "//div[contains(text(), 'Short')]");
		backgammonPage.backgammonBackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
		
		
	}
	
//	@Test(dependsOnMethods = { "testBackgammonButton" })
	public void testToto21Button() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openGamesDropDown();
		TotoToto21Page toto21Page = guest.openToto21Page();
//		DriverUtil.waitForElementPresent(driver, 5, "//div[contains(text(), 'TOTO 21')]");
		toto21Page.toto21BackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
		
	}
	
//	@Test(dependsOnMethods = { "testToto21Button" })
	public void testDominoButton() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openGamesDropDown();
		guest.openDominoPage();
		TotoDominoPage dominoPage = guest.openDominoPage();
//		DriverUtil.waitForElementPresent(driver, 5, "//div[@class='dominoIcon headerIcon']");
		dominoPage.dominoBackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
		
	}
	//(dependsOnMethods = { "testDominoButton" })
	@Test
	public void testKenoButton() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openKenoDropDown();
		TotoKenoPage kenoPage  = guest.openKenoPage();
		DriverUtil.waitForElementPresent(driver, 5, "//div[@class='top-players-container-header-item for-keno']");
		kenoPage.kenoBackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
		
	}
	
//	@Test(dependsOnMethods = { "testKenoButton" })
	public void testGoldKenoButton() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openKenoDropDown();
		guest.openGoldKenoPage();
		TotoGoldKenoPage backToHomePage = new TotoGoldKenoPage(driver);
//		DriverUtil.waitForElementPresent(driver, 5, "//div[@class='space-img']");
		backToHomePage.goldKenoBackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
		
	}
	
//	@Test(dependsOnMethods = { "testGoldKenoButton" })
	public void testCrashButton() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openCrashPage();
		TotoCrashPage backToHomePage = new TotoCrashPage(driver);
//		DriverUtil.waitForElementPresent(driver, 5, "//div[@class='top-players-container-header-item for-crash']");
		backToHomePage.crashBackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
		
	}
	
//	@Test(dependsOnMethods = { "testCrashButton" })
	public void testHiLoButton() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openHiLoPage();
		TotoHiLoPage backToHomePage = new TotoHiLoPage(driver);
//		DriverUtil.waitForElementPresent(driver, 5, "//div[@class='top-players-container-header-item for-hilo']");
		backToHomePage.hiLoBackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
		
	}

}
