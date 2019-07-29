package am.qa.totogaming.tests.menus;


import java.util.ArrayList;

import org.testng.annotations.Test;

import am.qa.totogaming.footer.links.pages.FooterBackgammonPage;
import am.qa.totogaming.footer.links.pages.FooterBelotePage;
import am.qa.totogaming.footer.links.pages.FooterDominoPage;
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

//	TC ID 55
	@Test
	public void footerPromotionsTest(){
		TotoGuestPage guest = new TotoGuestPage(driver);
		FooterPromotionsPage guestPromo = guest.openFooterPromotionsPage();
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_promo_news_cont']");
		guestPromo.footerPromoBackToHomePage();
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='toto_landint_container']");
	}
	
//	TC ID 56
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
	
//	TC ID 57
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
	
//	TC ID 58
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
	
//	TC ID 59
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
	
//	TC ID 60
	@Test
	public void footerResultsTest(){
		TotoGuestPage guest = new TotoGuestPage(driver);
		FooterResultsPage guestResults = guest.openFooterResultsPage();
		DriverUtil.waitForElementPresent(driver, 3, "//a[contains(@class, 'active') and @id = 'mainSportBtn']");
		DriverUtil.waitForElementPresent(driver, 3, "//div[@id='sportLDRContainer']");
		guestResults.footerResultsBackToHomePage();
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='toto_landint_container']");
	}
	
//	TC ID 61
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
	
//	TC ID 62
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
	
//	TC ID 63
	@Test
	public void footerPreMatchBettingTest(){
		TotoGuestPage guest = new TotoGuestPage(driver);
		FooterPreMatchBettingPage guestPreMatchBetting = guest.openFooterPreMatchBettingPage();
		DriverUtil.waitForElementPresent(driver, 3, "//a[contains(@class, 'active') and @id = 'mainSportBtn']");
		DriverUtil.waitForElementPresent(driver, 3, "//div[contains(@class, 'tg__prematch_games')]");
		guestPreMatchBetting.footerPreMatchBettingBackToHomePage();
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='toto_landint_container']");
	}
	
//	TC ID 64
	@Test
	public void footerLiveBettingTest(){
		TotoGuestPage guest = new TotoGuestPage(driver);
		FooterLiveBettingPage guestLiveBetting = guest.openFooterLiveBettingPage();
		DriverUtil.waitForElementPresent(driver, 3, "//a[contains(@class, 'active') and @id = 'mainLiveBtn']");
		DriverUtil.waitForElementPresent(driver, 3, "//div[contains(@class, 'liveHeaderContainer')]");
		guestLiveBetting.footerLiveBettingBackToHomePage();
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='toto_landint_container']");
	}
	
//	TC ID 65
	@Test
	public void footerTvGamesTest(){
		TotoGuestPage guest = new TotoGuestPage(driver);
		FooterTvGamesPage guestTvGames = guest.openFooterTvGamesPage();
		DriverUtil.waitForElementPresent(driver, 3, "//button[text()='TV Games' and contains(@class, 'active')]");
		DriverUtil.waitForElementPresent(driver, 3, "//iframe[@name='betgames_iframe_1']");
		guestTvGames.footerTvGamesBackToHomePage();
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='toto_landint_container']");
	}
	
//	TC ID 66
	@Test
	public void footerFastGamesTest(){
		TotoGuestPage guest = new TotoGuestPage(driver);
		FooterFastGamesPage guestFastGames = guest.openFooterFastGamesPage();
		DriverUtil.waitForElementPresent(driver, 3, "//a[text()='Fast Games' and contains(@class, 'active')]");
		DriverUtil.waitForElementPresent(driver, 3, "//div[@id='golden-race-desktop-app']");
		guestFastGames.footerFastGamesBackToHomePage();
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='toto_landint_container']");
	}
	
//	TC ID 67
	@Test
	public void footerSportLottoTest(){
		TotoGuestPage guest = new TotoGuestPage(driver);
		FooterSportLottoPage guestSportLotto = guest.openFooterSportLottoPage();
		DriverUtil.waitForElementPresent(driver, 3, "//div[text()='TV Games' and contains(@class, 'active')]");
		DriverUtil.waitForElementPresent(driver, 3, "//div[@id='other_games_panel']");
		guestSportLotto.footerSportLottoBackToHomePage();
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='toto_landint_container']");
	}
	
//	TC ID 68
	@Test
	public void footerSlotsTest(){
		TotoGuestPage guest = new TotoGuestPage(driver);
		FooterSlotsPage guestSlots = guest.openFooterSlotsPage();
		DriverUtil.waitForElementPresent(driver, 3, "//a[text()='Casino' and contains(@class, 'active')]");
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='tl_games flex']");
		guestSlots.footerSlotsBackToHomePage();
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='toto_landint_container']");
	}
	
//	TC ID 69
	@Test
	public void footerLiveCasinoTest(){
		TotoGuestPage guest = new TotoGuestPage(driver);
		FooterLiveCasinoPage guestLiveCasino = guest.openFooterLiveCasinoPage();
		DriverUtil.waitForElementPresent(driver, 3, "//button[text()='Live Casino' and contains(@class, 'active')]");
		DriverUtil.waitForElementPresent(driver, 5, "//div[@class='evolutionFrame_block']");
		guestLiveCasino.footerLiveCasinoBackToHomePage();
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='toto_landint_container']");
	}
	
//	TC ID 70
	@Test
	public void footerBeloteTest(){
		TotoGuestPage guest = new TotoGuestPage(driver);
		FooterBelotePage guestBelote = guest.openFooterBelotePage();
		DriverUtil.waitForElementPresent(driver, 3, "//button[text()='Games' and contains(@class, 'active')]");
		DriverUtil.waitForElementPresent(driver, 5, "//iframe[@id='beloteFrame']");
		guestBelote.footerBeloteBackToHomePage();
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='toto_landint_container']");
	}
	
//	TC ID 71
	@Test
	public void footerToto21Test(){
		TotoGuestPage guest = new TotoGuestPage(driver);
		FooterToto21Page guestToto21 = guest.openFooterToto21Page();
		DriverUtil.waitForElementPresent(driver, 3, "//button[text()='Games' and contains(@class, 'active')]");
		DriverUtil.waitForElementPresent(driver, 5, "//iframe[@id='game21Frame']");
		guestToto21.footerToto21BackToHomePage();
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='toto_landint_container']");
	}
	
//	TC ID 72
	@Test
	public void footerBackgammonTest(){
		TotoGuestPage guest = new TotoGuestPage(driver);
		FooterBackgammonPage guestBackgammon = guest.openFooterBackgammonPage();
		DriverUtil.waitForElementPresent(driver, 3, "//button[text()='Games' and contains(@class, 'active')]");
		DriverUtil.waitForElementPresent(driver, 5, "//iframe[@class='backgammon_p2p']");
		guestBackgammon.footerBackgammonBackToHomePage();
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='toto_landint_container']");
	}
	
//	TC ID 73
	@Test
	public void footerDominoTest(){
		TotoGuestPage guest = new TotoGuestPage(driver);
		FooterDominoPage guestDomino = guest.openFooterDominoPage();
		DriverUtil.waitForElementPresent(driver, 3, "//button[text()='Games' and contains(@class, 'active')]");
		DriverUtil.waitForElementPresent(driver, 5, "//iframe[@class='domino_p2p']");
		guestDomino.footerDominoBackToHomePage();
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='toto_landint_container']");
	}
	
//	TC ID 74
	@Test
	public void footerTermsAndConditionsTest(){
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openFooterTermsAndConditionsPage();
		ArrayList<String> promoTab = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(promoTab.get(1));
		DriverUtil.waitForElementPresent(driver, 3, "//li[contains(@class, 'active sub')]//a[@title='General Terms and Conditions']");
		DriverUtil.waitForElementPresent(driver, 3, "//strong[contains(text(), 'General rules')]");
		driver.close();
		driver.switchTo().window(promoTab.get(0));
	}
	
//	TC ID 75
	@Test
	public void footerSportsRegulationsTest(){
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openFooterSportsRegulationsPage();
		ArrayList<String> promoTab = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(promoTab.get(1));
		DriverUtil.waitForElementPresent(driver, 3, "//li[contains(@class, 'active sub')]//a[@title='Regulation']");
		DriverUtil.waitForElementPresent(driver, 3, "//h1[text()='Sport']");
		driver.close();
		driver.switchTo().window(promoTab.get(0));
	}
	
//	TC ID 76
	@Test
	public void footerCasinoRegulationsTest(){
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openFooterCasinoRegulationsPage();
		ArrayList<String> promoTab = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(promoTab.get(1));
		DriverUtil.waitForElementPresent(driver, 3, "//li[contains(@class, 'active sub')]//a[@title='Regulation']");
		DriverUtil.waitForElementPresent(driver, 3, "//h1[text()='Casino']");
		driver.close();
		driver.switchTo().window(promoTab.get(0));
	}
	
//	TC ID 77
	@Test
	public void footerPrivacyPolicyTest(){
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openFooterPrivacyPolicyPage();
		ArrayList<String> promoTab = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(promoTab.get(1));
		DriverUtil.waitForElementPresent(driver, 3, "//li[contains(@class, 'active sub')]//a[@title='Privacy Policy']");
		DriverUtil.waitForElementPresent(driver, 3, "//h1[text()='Casino']");
		driver.close();
		driver.switchTo().window(promoTab.get(0));
	}
	
//	TC ID 78
	@Test
	public void footerResponsibleGamingTest(){
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openFooterResponsibleGamingPage();
		ArrayList<String> promoTab = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(promoTab.get(1));
		DriverUtil.waitForElementPresent(driver, 3, "//li[contains(@class, 'active')]//a[@title='Responsible Gaming']");
		DriverUtil.waitForElementPresent(driver, 3, "//h1[text()='Responsible Gaming']");
		driver.close();
		driver.switchTo().window(promoTab.get(0));
	}
	
//	TC ID 79
	@Test
	public void footerAboutUsTest(){
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openFooterAboutUsPage();
		ArrayList<String> promoTab = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(promoTab.get(1));
		DriverUtil.waitForElementPresent(driver, 3, "//li[contains(@class, 'active')]//a[@title='About Us']");
		DriverUtil.waitForElementPresent(driver, 3, "//h1[text()='About Us']");
		driver.close();
		driver.switchTo().window(promoTab.get(0));
	}
	
//	TC ID 80
	@Test
	public void footerVacanciesTest(){
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openFooterVacanciesPage();
		ArrayList<String> promoTab = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(promoTab.get(1));
		DriverUtil.waitForElementPresent(driver, 3, "//li[contains(@class, 'active')]//a[@title='Vacancies']");
		DriverUtil.waitForElementPresent(driver, 3, "//h1[text()='Sport betting analyst']");
		driver.close();
		driver.switchTo().window(promoTab.get(0));
	}
	
//	TC ID 81
	@Test
	public void footerContactUsTest(){
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openFooterContactUsPage();
		ArrayList<String> promoTab = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(promoTab.get(1));
		DriverUtil.waitForElementPresent(driver, 3, "//li[contains(@class, 'active')]//a[@title='Contact Us']");
		DriverUtil.waitForElementPresent(driver, 3, "//h1[text()='Contact Us']");
		driver.close();
		driver.switchTo().window(promoTab.get(0));
	}
	
}
