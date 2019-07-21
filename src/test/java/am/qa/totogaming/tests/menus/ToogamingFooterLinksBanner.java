package am.qa.totogaming.tests.menus;


import java.util.ArrayList;

import org.testng.annotations.Test;

import am.qa.totogaming.footer.links.pages.FooterBelotePage;
import am.qa.totogaming.footer.links.pages.FooterFastGamesPage;
import am.qa.totogaming.footer.links.pages.FooterLiveBettingPage;
import am.qa.totogaming.footer.links.pages.FooterLiveCasinoPage;
import am.qa.totogaming.footer.links.pages.FooterPreMatchBettingPage;
import am.qa.totogaming.footer.links.pages.FooterPromotionsPage;
import am.qa.totogaming.footer.links.pages.FooterResultsPage;
import am.qa.totogaming.footer.links.pages.FooterSlotsPage;
import am.qa.totogaming.footer.links.pages.FooterSportLottoPage;
import am.qa.totogaming.footer.links.pages.FooterToto21Page;
import am.qa.totogaming.footer.links.pages.FooterTvGamesPage;
import am.qa.totogaming.page.guest.TotoGuestPage;
import am.qa.totogaming.test.base.TotogamingBaseTest;
import am.qa.totogaming.util.DriverUtil;

public class ToogamingFooterLinksBanner extends TotogamingBaseTest{

	@Test
	public void footerPromotionsTest(){
		TotoGuestPage guest = new TotoGuestPage(driver);
		FooterPromotionsPage guestPromo = guest.openFooterPromotionsPage();
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_promo_news_cont']");
		guestPromo.footerPromoBackToHomePage();
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='toto_landint_container']");
	}
	
	@Test
	public void footerFAQTest(){
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openFooterFAQPage();
		ArrayList<String> promoTab = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(promoTab.get(1));
		DriverUtil.waitForElementPresent(driver, 3, "//li[contains(@class, 'open')]//a[@title='FAQ']");
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='main-col']");
		driver.close();
		driver.switchTo().window(promoTab.get(0));
	}
	
	@Test
	public void footerSupportTest(){
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openFooterSupportPage();
		ArrayList<String> promoTab = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(promoTab.get(1));
		DriverUtil.waitForElementPresent(driver, 3, "//li[contains(@class, 'active')]//a[@title='Contact Us']");
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='main-col']//h1[text()='Contact Us']");
		driver.close();
		driver.switchTo().window(promoTab.get(0));
	}
	
	@Test
	public void footerBettingShopsTest(){
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openFooterBettingShopsPage();
		ArrayList<String> promoTab = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(promoTab.get(1));
		DriverUtil.waitForElementPresent(driver, 3, "//li[contains(@class, 'active')]//a[@title='Betshops']");
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='main-col']//h1[text()='Betshops']");
		driver.close();
		driver.switchTo().window(promoTab.get(0));
	}
	
	@Test
	public void footerTotoExpertTest(){
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openFooterTotoExpertPage();
		ArrayList<String> promoTab = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(promoTab.get(1));
		DriverUtil.waitForElementPresent(driver, 3, "//main[@id='totoexpert-main-wrap']");
		driver.close();
		driver.switchTo().window(promoTab.get(0));
	}
	
	@Test
	public void footerResultsTest(){
		TotoGuestPage guest = new TotoGuestPage(driver);
		FooterResultsPage guestResults = guest.openFooterResultsPage();
		DriverUtil.waitForElementPresent(driver, 3, "//a[contains(@class, 'active') and @id = 'mainSportBtn']");
		DriverUtil.waitForElementPresent(driver, 3, "//div[@id='sportLDRContainer']");
		guestResults.footerResultsBackToHomePage();
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='toto_landint_container']");
	}
	
	@Test
	public void footerLiveResultsTest(){
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openFooterLiveResultsPage();
		ArrayList<String> promoTab = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(promoTab.get(1));
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='GameList']");
		driver.close();
		driver.switchTo().window(promoTab.get(0));
	}
	
	@Test
	public void footerStatisticsTest(){
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openFooterStatisticsPage();
		ArrayList<String> promoTab = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(promoTab.get(1));
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='Competition']");
		driver.close();
		driver.switchTo().window(promoTab.get(0));
	}
	
	@Test
	public void footerPreMatchBettingTest(){
		TotoGuestPage guest = new TotoGuestPage(driver);
		FooterPreMatchBettingPage guestPreMatchBetting = guest.openFooterPreMatchBettingPage();
		DriverUtil.waitForElementPresent(driver, 3, "//a[contains(@class, 'active') and @id = 'mainSportBtn']");
		DriverUtil.waitForElementPresent(driver, 3, "//div[contains(@class, 'tg__prematch_games')]");
		guestPreMatchBetting.footerPreMatchBettingBackToHomePage();
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='toto_landint_container']");
	}
	
	@Test
	public void footerLiveBettingTest(){
		TotoGuestPage guest = new TotoGuestPage(driver);
		FooterLiveBettingPage guestLiveBetting = guest.openFooterLiveBettingPage();
		DriverUtil.waitForElementPresent(driver, 3, "//a[contains(@class, 'active') and @id = 'mainLiveBtn']");
		DriverUtil.waitForElementPresent(driver, 3, "//div[contains(@class, 'liveHeaderContainer')]");
		guestLiveBetting.footerLiveBettingBackToHomePage();
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='toto_landint_container']");
	}
	
	@Test
	public void footerTvGamesTest(){
		TotoGuestPage guest = new TotoGuestPage(driver);
		FooterTvGamesPage guestTvGames = guest.openFooterTvGamesPage();
		DriverUtil.waitForElementPresent(driver, 3, "//button[text()='TV Games' and contains(@class, 'active')]");
		DriverUtil.waitForElementPresent(driver, 3, "//iframe[@name='betgames_iframe_1']");
		guestTvGames.footerTvGamesBackToHomePage();
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='toto_landint_container']");
	}
	
	@Test
	public void footerFastGamesTest(){
		TotoGuestPage guest = new TotoGuestPage(driver);
		FooterFastGamesPage guestFastGames = guest.openFooterFastGamesPage();
		DriverUtil.waitForElementPresent(driver, 3, "//a[text()='Fast Games' and contains(@class, 'active')]");
		DriverUtil.waitForElementPresent(driver, 3, "//div[@id='golden-race-desktop-app']");
		guestFastGames.footerFastGamesBackToHomePage();
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='toto_landint_container']");
	}
	
	@Test
	public void footerSportLottoTest(){
		TotoGuestPage guest = new TotoGuestPage(driver);
		FooterSportLottoPage guestSportLotto = guest.openFooterSportLottoPage();
		DriverUtil.waitForElementPresent(driver, 3, "//div[text()='TV Games' and contains(@class, 'active')]");
		DriverUtil.waitForElementPresent(driver, 3, "//div[@id='other_games_panel']");
		guestSportLotto.footerSportLottoBackToHomePage();
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='toto_landint_container']");
	}
	
	@Test
	public void footerSlotsTest(){
		TotoGuestPage guest = new TotoGuestPage(driver);
		FooterSlotsPage guestSlots = guest.openFooterSlotsPage();
		DriverUtil.waitForElementPresent(driver, 3, "//a[text()='Casino' and contains(@class, 'active')]");
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_games flex']");
		guestSlots.footerSlotsBackToHomePage();
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='toto_landint_container']");
	}
	
	@Test
	public void footerLiveCasinoTest(){
		TotoGuestPage guest = new TotoGuestPage(driver);
		FooterLiveCasinoPage guestLiveCasino = guest.openFooterLiveCasinoPage();
		DriverUtil.waitForElementPresent(driver, 3, "//button[text()='Live Casino' and contains(@class, 'active')]");
		DriverUtil.waitForElementPresent(driver, 5, "//div[@class='evolutionFrame_block']");
		guestLiveCasino.footerLiveCasinoBackToHomePage();
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='toto_landint_container']");
	}
	
	@Test
	public void footerBeloteTest(){
		TotoGuestPage guest = new TotoGuestPage(driver);
		FooterBelotePage guestBelote = guest.openFooterBelotePage();
		DriverUtil.waitForElementPresent(driver, 3, "//button[text()='Games' and contains(@class, 'active')]");
		DriverUtil.waitForElementPresent(driver, 5, "//iframe[@id='beloteFrame']");
		guestBelote.footerBeloteBackToHomePage();
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='toto_landint_container']");
	}
	
	@Test
	public void footerToto21Test(){
		TotoGuestPage guest = new TotoGuestPage(driver);
		FooterToto21Page guestToto21 = guest.openFooterToto21Page();
		DriverUtil.waitForElementPresent(driver, 3, "//button[text()='Games' and contains(@class, 'active')]");
		DriverUtil.waitForElementPresent(driver, 5, "//iframe[@id='game21Frame']");
		guestToto21.footerToto21BackToHomePage();
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='toto_landint_container']");
	}
	
}
