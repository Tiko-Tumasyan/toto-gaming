package am.qa.totogaming.tests.menus;


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
import am.qa.totogaming.main.menu.buttons.pages.TotoPokerPage;
import am.qa.totogaming.main.menu.buttons.pages.TotoSportLoto5From36Page;
import am.qa.totogaming.main.menu.buttons.pages.TotoSportLoto7From42Page;
import am.qa.totogaming.main.menu.buttons.pages.TotoSportsPage;
import am.qa.totogaming.main.menu.buttons.pages.TotoSuperJackpotPage;
import am.qa.totogaming.main.menu.buttons.pages.TotoToto21Page;
import am.qa.totogaming.main.menu.buttons.pages.TotoWarOfBetsPage;
import am.qa.totogaming.main.menu.buttons.pages.TotoWheelPage;
import am.qa.totogaming.page.guest.TotoGuestPage;
import am.qa.totogaming.page.login.TotoLoginWindow;
import am.qa.totogaming.page.member.TotoMemberPage;
import am.qa.totogaming.test.base.TotogamingBaseTest;
import am.qa.totogaming.util.DriverUtil;
import am.qa.totogaming.util.ReadFromFileUtil;

public class TotogamingMainButtonsMenu extends TotogamingBaseTest{
	
	@Test
	public void testSportsButton() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		
		TotoSportsPage sportsPage = guest.openSportsPage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//a[@id='mainSportBtn' and contains(@class, 'active')]");
		DriverUtil.waitForElementPresent(driver, 3, "//div[@id='live_betting']");
		
		sportsPage.sportsBackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
	}
	
	@Test
	public void testLiveButton() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		
		TotoLivePage livePage = guest.openLivePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//a[@id='mainLiveBtn' and contains(@class, 'active')]");
		DriverUtil.waitForElementPresent(driver, 3, "//div[@id='LivePage']");
		livePage.liveBackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
	}
	
	@Test
	public void testCasinoButton() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		TotoCasinoPage casinoPage = guest.openCasinoPage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//a[@class='active navItem' and text()='Casino']");
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_games flex']");
		
		casinoPage.casinoBackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
	}
	
	@Test
	public void testEvolutionLiveCasinoButton() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openLiveCasinoDropDown();
		
		TotoEvolutionLiveCasinoPage evolutionLiveCasinoPage = guest.openEvolutionLiveCasinoPage();
		DriverUtil.waitForElementPresent(driver, 3, "//button[contains(@class , 'active') and text()='Live Casino']");
		DriverUtil.waitForElementPresent(driver, 5, "//div[@class='evolutionFrame_block']");
		
		evolutionLiveCasinoPage.evolutionLiveCasinoBackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
	}
	
	@Test
	public void testLuckyStreakLiveCasinoButton() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openLiveCasinoDropDown();
		
		TotoLuckyStreakLiveCasinoPage luckyStreakLiveCasinoPage = guest.openLuckyStreakLiveCasinoPage();
		DriverUtil.waitForElementPresent(driver, 3, "//button[contains(@class , 'active') and text()='Live Casino']");
		DriverUtil.waitForElementPresent(driver, 5, "//iframe[@id='_luckyStreakFrame']");
		
		luckyStreakLiveCasinoPage.luckyStreakLiveCasinoBackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
	}
	
	@Test// ???
	public void testLucky7Button() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openTvGamesDropDown();
		
		TotoLucky7Page lucky7Page = guest.openTotoLucky7Page();
//		DriverUtil.waitForElementPresent(driver, 6, "//div[@data-qa='button-game-menu-1']");
		DriverUtil.waitForElementPresent(driver, 3, "//iframe[@id='betgames_iframe_1']");
		
		lucky7Page.lucky7BackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
	}
	
	@Test// ???
	public void testLucky6Button() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openTvGamesDropDown();
		
		TotoLucky6Page lucky6Page = guest.openTotoLucky6Page();
		DriverUtil.waitForElementPresent(driver, 3, "//iframe[@id='betgames_iframe_1']");
		lucky6Page.lucky6BackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
		
	}
	
	@Test// ???
	public void testLucky5Button() {
		

		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openTvGamesDropDown();
		
		TotoLucky5Page lucky5Page = guest.openTotoLucky5Page();
		DriverUtil.waitForElementPresent(driver, 3, "//iframe[@id='betgames_iframe_1']");
		lucky5Page.lucky5BackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
		
	}
	
	@Test// ???
	public void testDiceButton() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openTvGamesDropDown();
		
		TotoDicePage dicePage = guest.openTotoDicePage();
		DriverUtil.waitForElementPresent(driver, 3, "//iframe[@id='betgames_iframe_1']");
		dicePage.diceBackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
		
	}
	
	@Test// ???
	public void testDiceDuelButton() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openTvGamesDropDown();
		
		TotoDiceDuelPage diceDuelPage = guest.openTotoDiceDuelPage();
		DriverUtil.waitForElementPresent(driver, 3, "//iframe[@id='betgames_iframe_1']");
		diceDuelPage.diceDuelBackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
		
		
	}
	
	@Test// ???
	public void testWheelButton() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openTvGamesDropDown();
		
		TotoWheelPage wheelPage = guest.openTotoWheelPage();
		DriverUtil.waitForElementPresent(driver, 3, "//iframe[@id='betgames_iframe_1']");
		wheelPage.wheelBackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
		
	}
	
	@Test// ???
	public void testBetOnPokerButton() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openTvGamesDropDown();
		
		TotoBetOnPokerPage betOnPokerPage = guest.openTotoBetOnPokerPage();
		DriverUtil.waitForElementPresent(driver, 3, "//iframe[@id='betgames_iframe_1']");
		betOnPokerPage.betOnPokerBackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
		
	}
	
	@Test// ???
	public void testBaccaratButton() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openTvGamesDropDown();
		
		TotoBaccaratPage baccaratPage = guest.openTotoBaccaratPage();
		DriverUtil.waitForElementPresent(driver, 3, "//iframe[@id='betgames_iframe_1']");
		baccaratPage.baccaratBackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
		
	}
	
	@Test// ???
	public void testWarOfBetsButton() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openTvGamesDropDown();
		
		TotoWarOfBetsPage warOfBetsPage = guest.openTotoWarOfBetsPage();
		DriverUtil.waitForElementPresent(driver, 3, "//iframe[@id='betgames_iframe_1']");
		warOfBetsPage.warOfBetsBackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
		
	}
	
	@Test// ???
	public void testSportLoto5From36Button() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openTvGamesDropDown();
		
		TotoSportLoto5From36Page sportLoto5From36Page = guest.openTotoSportLoto5From36Page();
		DriverUtil.waitForElementPresent(driver, 3, "//div[@id='superloto_div_iframe']");
		sportLoto5From36Page.sportLoto5BackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
		
	}
	
	@Test// ???
	public void testSportLoto7From42Button() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openTvGamesDropDown();
		
		TotoSportLoto7From42Page sportLoto7From42Page = guest.openTotoSportLoto7From42Page();
		DriverUtil.waitForElementPresent(driver, 3, "//div[@id='superloto_div_iframe']");
		DriverUtil.waitForElementPresent(driver, 3, "//li[@class='lottery active']//span[@class='lottery_name ' and contains(text(), 'Sportloto 7 from 42')]");
		sportLoto7From42Page.sportLoto7BackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
		
	}
	
	@Test//???
	public void testSuperJackpotButton() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openTvGamesDropDown();
		
		TotoSuperJackpotPage superJackpotPage = guest.openTotoSuperJackpotPage();
		DriverUtil.waitForElementPresent(driver, 3, "//div[@id='superloto_div_iframe']");
		superJackpotPage.superJackpotBackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
		
	}
	
	@Test 
	public void testFastGamesButton() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		
		TotoFastGamesPage fastGamesPage = guest.openFastGamesPage();
		DriverUtil.waitForElementPresent(driver, 3, "//a[text()='Fast games' and contains(@class, 'active')]");
		DriverUtil.waitForElementPresent(driver, 3, "//div[@id='golden-race-desktop-app']");
		fastGamesPage.fastGamesBackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
	}
		
	@Test
	public void testPokerButton() throws Exception {
		String totoPassword = ReadFromFileUtil.getProperties("password");
		 String totoUsername =	ReadFromFileUtil.getProperties("user");
		
		TotoGuestPage guestPage = new TotoGuestPage(driver);
		TotoLoginWindow totoLoginWindow = guestPage.openLoginDialog();
		totoLoginWindow.fillTotoLoginCredentials(totoUsername, totoPassword);
		totoLoginWindow.submitTotoLoginForm();
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_logged_in flex']");
		
		TotoMemberPage memberPage = new TotoMemberPage(driver);
		
		TotoPokerPage pokerPage = memberPage.openMemberPokerPage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//a[text()='Poker' and contains(@class, 'active')]");
		DriverUtil.waitForElementPresent(driver, 3, "//iframe[@id='_EventBetFrame']");
		
		pokerPage.pokerBackToHomePage();
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
	}
	
	@Test
	public void testBeloteButton() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openGamesDropDown();
		TotoBelotePage belotePage = guest.openBelotePage();
		DriverUtil.waitForElementPresent(driver, 3, "//button[text()='Games' and contains(@class, 'active')]");
		DriverUtil.waitForElementPresent(driver, 5, "//iframe[@id='beloteFrame']");
		
		belotePage.beloteBackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
		
	}
	
	@Test
	public void testBackgammonButton() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openGamesDropDown();
		TotoBackgammonPage backgammonPage = guest.openBackgammonPage();
		DriverUtil.waitForElementPresent(driver, 3, "//button[text()='Games' and contains(@class, 'active')]");
		DriverUtil.waitForElementPresent(driver, 5, "//iframe[@class='backgammon_p2p']");
		backgammonPage.backgammonBackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
		
		
	}
	
	@Test
	public void testToto21Button() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openGamesDropDown();
		TotoToto21Page toto21Page = guest.openToto21Page();
		DriverUtil.waitForElementPresent(driver, 3, "//button[text()='Games' and contains(@class, 'active')]");
		DriverUtil.waitForElementPresent(driver, 5, "//iframe[@id='game21Frame']");
		toto21Page.toto21BackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
		
	}
	
	@Test
	public void testDominoButton() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openGamesDropDown();
		TotoDominoPage dominoPage = guest.openDominoPage();
		DriverUtil.waitForElementPresent(driver, 3, "//button[text()='Games' and contains(@class, 'active')]");
		DriverUtil.waitForElementPresent(driver, 5, "//iframe[@class='domino_p2p']");
		dominoPage.dominoBackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
		
	}
	
	@Test
	public void testKenoButton() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openKenoDropDown();
		TotoKenoPage kenoPage  = guest.openKenoPage();
		DriverUtil.waitForElementPresent(driver, 3, "//button[text()='Keno' and contains(@class, 'active')]");
		DriverUtil.waitForElementPresent(driver, 5, "//iframe[@id='betongamesFrame']");
		kenoPage.kenoBackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
		
	}
	
	@Test
	public void testGoldKenoButton() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openKenoDropDown();
		TotoGoldKenoPage goldKenoPage = guest.openGoldKenoPage();
		DriverUtil.waitForElementPresent(driver, 5, "//iframe[@class='flgGames_frame']");
		goldKenoPage.goldKenoBackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
		
	}
	
	@Test
	public void testCrashButton() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openCrashPage();
		TotoCrashPage backToHomePage = new TotoCrashPage(driver);
		DriverUtil.waitForElementPresent(driver, 3, "//a[text()='Crash' and contains(@class, 'active')]");
		DriverUtil.waitForElementPresent(driver, 5, "//iframe[@id='betongamesFrame']");
		
		backToHomePage.crashBackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
		
	}
	
	@Test
	public void testHiLoButton() {
		
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openHiLoPage();
		TotoHiLoPage backToHomePage = new TotoHiLoPage(driver);
		DriverUtil.waitForElementPresent(driver, 3, "//a[text()='HI LO' and contains(@class, 'active')]");
		DriverUtil.waitForElementPresent(driver, 5, "//iframe[@id='_HiloFrame']");
		backToHomePage.hiLoBackToHomePage();
		
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_header_bot_row_fix flex']");
		
	}

}
