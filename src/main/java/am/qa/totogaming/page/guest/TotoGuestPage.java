package am.qa.totogaming.page.guest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.qa.social.media.toto.page.FbTotoPage;
import am.qa.social.media.toto.page.InstaTotoPage;
import am.qa.social.media.toto.page.OkTotoPage;
import am.qa.social.media.toto.page.TelegramTotoPage;
import am.qa.social.media.toto.page.TwitterTotoPage;
import am.qa.social.media.toto.page.VkTotoPage;
import am.qa.social.media.toto.page.YoutubeTotoPage;
import am.qa.totogaming.footer.links.pages.FooterAboutUsPage;
import am.qa.totogaming.footer.links.pages.FooterBackgammonPage;
import am.qa.totogaming.footer.links.pages.FooterBelotePage;
import am.qa.totogaming.footer.links.pages.FooterBettingShopsPage;
import am.qa.totogaming.footer.links.pages.FooterCasinoRegulationsPage;
import am.qa.totogaming.footer.links.pages.FooterContactUsPage;
import am.qa.totogaming.footer.links.pages.FooterDominoPage;
import am.qa.totogaming.footer.links.pages.FooterFAQPage;
import am.qa.totogaming.footer.links.pages.FooterFastGamesPage;
import am.qa.totogaming.footer.links.pages.FooterLiveBettingPage;
import am.qa.totogaming.footer.links.pages.FooterLiveCasinoPage;
import am.qa.totogaming.footer.links.pages.FooterLiveResultsPage;
import am.qa.totogaming.footer.links.pages.FooterPreMatchBettingPage;
import am.qa.totogaming.footer.links.pages.FooterPrivacyPolicyPage;
import am.qa.totogaming.footer.links.pages.FooterPromotionsPage;
import am.qa.totogaming.footer.links.pages.FooterResponsibleGamingPage;
import am.qa.totogaming.footer.links.pages.FooterResultsPage;
import am.qa.totogaming.footer.links.pages.FooterSlotsPage;
import am.qa.totogaming.footer.links.pages.FooterSportLottoPage;
import am.qa.totogaming.footer.links.pages.FooterSportsRegulationsPage;
import am.qa.totogaming.footer.links.pages.FooterStatisticsPage;
import am.qa.totogaming.footer.links.pages.FooterSupportPage;
import am.qa.totogaming.footer.links.pages.FooterTermsAndConditionsPage;
import am.qa.totogaming.footer.links.pages.FooterToto21Page;
import am.qa.totogaming.footer.links.pages.FooterTotoExpertPage;
import am.qa.totogaming.footer.links.pages.FooterTvGamesPage;
import am.qa.totogaming.footer.links.pages.FooterVacanciesPage;
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
import am.qa.totogaming.main.menu.buttons.pages.TotoSportTournamentPage;
import am.qa.totogaming.main.menu.buttons.pages.TotoSportsPage;
import am.qa.totogaming.main.menu.buttons.pages.TotoSuperJackpotPage;
import am.qa.totogaming.main.menu.buttons.pages.TotoToto21Page;
import am.qa.totogaming.main.menu.buttons.pages.TotoWarOfBetsPage;
import am.qa.totogaming.main.menu.buttons.pages.TotoWheelPage;
import am.qa.totogaming.page.base.PageObject;
import am.qa.totogaming.page.login.TotoLoginWindow;
import am.qa.totogaming.page.promotions.TotogamingPromotionsPage;
import am.qa.totogaming.page.registration.TotoRegWindow;
import am.qa.totogaming.page.toto.expert.TotogamingTotoExpertPage;
import am.qa.totogaming.top.casino.games.buttons.pages.BookOfSunPage;
import am.qa.totogaming.top.casino.games.buttons.pages.LuckyLadysCharmPage;
import am.qa.totogaming.top.casino.games.buttons.pages.SugarPopPage;
import am.qa.totogaming.top.casino.games.buttons.pages.SuperHot40Page;
import am.qa.totogaming.top.live.casino.games.buttons.pages.BaccaratPage;
import am.qa.totogaming.top.live.casino.games.buttons.pages.BlackJackPage;
import am.qa.totogaming.top.live.casino.games.buttons.pages.DreamCatcherPage;
import am.qa.totogaming.top.live.casino.games.buttons.pages.RoulettePage;

public class TotoGuestPage extends PageObject {

	public TotoGuestPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//div[contains(@class, 'tl_login_container')]//a[@data-dialog-title='Login']")
	WebElement loginLink;
	
	@FindBy(xpath="//a[@data-dialog-title='New User']")
	WebElement regLink;
	
	@FindBy(xpath="//a[contains(@class, 'dropdown-menu')]")
	WebElement langDropDown;
	
	@FindBy(xpath="//a[@class='flex en']")
	WebElement engLangSelect;
	
	@FindBy(xpath="//i[@id='icon_promotions']")
	WebElement promotionsBtn;
	
	@FindBy(xpath="//a[@class='sep_titles']")
	WebElement totoExpertLink;
	
	@FindBy(xpath="//a[text()='Sports']")
	WebElement sportsLink;
	
	@FindBy(xpath="//a[text()='Live']")
	WebElement liveLink;
	
	@FindBy(xpath="//a[text()='Casino']")
	WebElement casinoLink;
	
	@FindBy(xpath="//button[text()='Live Casino']")
	WebElement liveCasinoLink;
	
	@FindBy(xpath="//a[text()='Evolution Live Casino']")
	WebElement evolutionLiveCasino;
	
	@FindBy(xpath="//a[text()='Lucky Streak Live Casino']")
	WebElement luckyStreakLiveCasino;
	
	@FindBy(xpath="//button[text()='TV Games']")
	WebElement tvGamesLink;
	
	@FindBy(xpath="//a[text()='Lucky 7']")
	WebElement lucky7Link;
	
	@FindBy(xpath="//a[text()='Lucky 6']")
	WebElement lucky6Link;
	
	@FindBy(xpath="//a[text()='Lucky 5']")
	WebElement lucky5Link;
	
	@FindBy(xpath="//a[text()='Dice']")
	WebElement diceLink;
	
	@FindBy(xpath="//a[text()='Dice Duel']")
	WebElement diceDuelLink;
	
	@FindBy(xpath="//a[text()='Wheel']")
	WebElement wheelLink;
	
	@FindBy(xpath="//a[text()='Bet on Poker']")
	WebElement betOnPokerLink;
	
	@FindBy(xpath="//a[text()='Baccarat']")
	WebElement baccaratLink;
	
	@FindBy(xpath="//a[text()='War Of Bets']")
	WebElement warOfBetsLink;
	
	@FindBy(xpath="//a[text()='Sportloto 5 from 36']")
	WebElement sportLoto5From36Link;
	
	@FindBy(xpath="//a[text()='Sportloto 7 from 42']")
	WebElement sportLoto7From42Link;
	
	@FindBy(xpath="//a[text()='SuperJackpot']")
	WebElement superJackpotLink;
	
	@FindBy(xpath="//a[text()='Fast games']")
	WebElement fastGamesLink;
	
	@FindBy(xpath="//a[text()='Poker']")
	WebElement pokerLink;
	
	@FindBy(xpath="//button[text()='Games']")
	WebElement gamesLink;
	
	@FindBy(xpath="//div[contains(@class, 'shadow')]//a[text()='Belote']")
	WebElement beloteLink;
	
	@FindBy(xpath="//div[contains(@class, 'shadow')]//a[text()='Backgammon']")
	WebElement backgammonLink;
	
	@FindBy(xpath="//a[text()='Toto 21']")
	WebElement toto21Link;
	
	@FindBy(xpath="//div[contains(@class, 'shadow')]//a[text()='Domino']")
	WebElement dominoLink;
	
	@FindBy(xpath="//button[text()='Keno']")
	WebElement kenoLink;
	
	@FindBy(xpath="//div[contains(@class, 'shadow')]//a[text()='KENO']")
	WebElement kenoDropDownLink;
	
	@FindBy(xpath="//div[contains(@class, 'shadow')]//a[text()='Gold Keno']")
	WebElement goldKenoLink;
	
	@FindBy(xpath="//a[text()='Crash']")
	WebElement crashLink;
	
	@FindBy(xpath="//a[text()='HI LO']")
	WebElement hiLoLink;
	
	@FindBy(xpath="//p[text()='Sports']")
	WebElement sportsBanner;
	
	@FindBy(xpath="//p[text()='Sport Tournament']")
	WebElement sportTournamentBanner;
	
	@FindBy(xpath="//p[text()='Keno']")
	WebElement kenoBanner;
	
	@FindBy(xpath="//p[text()='Casino']")
	WebElement casinoBanner;
	
	@FindBy(xpath="//p[text()='Live Casino']")
	WebElement liveCasinoBanner;
	
	@FindBy(xpath="//p[text()='Belote']")
	WebElement beloteBanner;
	
	@FindBy(xpath="//p[text()='Poker']")
	WebElement pokerBanner;
	
	@FindBy(xpath="//a[@class='new_fic tw']")
	WebElement twitterBtn;
	
	@FindBy(xpath="//a[@class='new_fic inst']")
	WebElement instaBtn;
	
	@FindBy(xpath="//a[@class='new_fic yt']")
	WebElement youtubeBtn;
	
	@FindBy(xpath="//a[@class='new_fic tel']")
	WebElement telegramBtn;
	
	@FindBy(xpath="//a[@class='new_fic vk']")
	WebElement vkBtn;
	
	@FindBy(xpath="//a[@class='new_fic ok']")
	WebElement okBtn;
	
	@FindBy(xpath="//a[contains(@href, 'Lucky-Ladys-Charm')]")
	WebElement luckyLadysCharmBtn;
	
	@FindBy(xpath="//a[@class='new_fic fb']")
	WebElement fbBtn;
	
	@FindBy(xpath="//a[contains(@href, '40-Super-Hot')]")
	WebElement superHot40Btn;
	
	@FindBy(xpath="//a[contains(@href, 'Sugar-Pop')]")
	WebElement sugarPopBtn;
	
	@FindBy(xpath="//a[contains(@href, 'Book-of-Sun')]")
	WebElement bookOfSunBtn;
	
	@FindBy(xpath="//img[contains(@src, 'blackjack')]")
	WebElement blackJackBtn;
	
	@FindBy(xpath="//img[contains(@src, 'roulette')]")
	WebElement rouletteBtn;
	
	@FindBy(xpath="//img[contains(@src, 'baccarat')]")
	WebElement baccaratBtn;
	
	@FindBy(xpath="//img[contains(@src, 'dream')]")
	WebElement dreamCatcherBtn;
	
	@FindBy(xpath="//ul[@class='tl_footer_links_row']//a[text() = 'Promotions']")
	WebElement footerPromotionsLink;
	
	@FindBy(xpath="//ul[@class='tl_footer_links_row']//a[text() = 'FAQ']")
	WebElement footerFAQLink;
	
	@FindBy(xpath="//ul[@class='tl_footer_links_row']//a[contains(text(), 'Support')]")
	WebElement footerSupportLink;
	
	@FindBy(xpath="//ul[@class='tl_footer_links_row']//a[text() = 'Betting shops']")
	WebElement footerBettingShopsLink;
	
	@FindBy(xpath="//ul[@class='tl_footer_links_row']//a[text() = 'TotoExpert']")
	WebElement footerTotoExpertLink;
	
	@FindBy(xpath="//ul[@class='tl_footer_links_row']//a[contains(text(), 'Results') and @target='_self']")
	WebElement footerResultsLink;
	
	@FindBy(xpath="//ul[@class='tl_footer_links_row']//a[contains(text(), 'Results') and @target='_blank']")
	WebElement footerLiveResultsLink;
	
	@FindBy(xpath="//ul[@class='tl_footer_links_row']//a[contains(text(), 'Statistics')]")
	WebElement footerStatisticsLink;
	
	@FindBy(xpath="//ul[@class='tl_footer_links_row']//a[text() = 'Pre-match Betting']")
	WebElement footerPreMatchBettingLink;
	
	@FindBy(xpath="//ul[@class='tl_footer_links_row']//a[text() = 'Live Betting']")
	WebElement footerLiveBettingLink;
	
	@FindBy(xpath="//ul[@class='tl_footer_links_row']//a[text() = 'TV Games']")
	WebElement footerTvGamesLink;
	
	@FindBy(xpath="//ul[@class='tl_footer_links_row']//a[text() = 'Fast Games']")
	WebElement footerFastGamesLink;
	
	@FindBy(xpath="//ul[@class='tl_footer_links_row']//a[text() = 'Sportlotto']")
	WebElement footerSportLottoLink;
	
	@FindBy(xpath="//ul[@class='tl_footer_links_row']//a[text() = 'Slots']")
	WebElement footerSlotsLink;
	
	@FindBy(xpath="//ul[@class='tl_footer_links_row']//a[text() = 'Live Casino']")
	WebElement footerLiveCasinoLink;
	
	@FindBy(xpath="//ul[@class='tl_footer_links_row']//a[text() = 'Belote']")
	WebElement footerBeloteLink;
	
	@FindBy(xpath="//ul[@class='tl_footer_links_row']//a[text() = 'Toto21']")
	WebElement footerToto21Link;
	
	@FindBy(xpath="//ul[@class='tl_footer_links_row']//a[text() = 'Backgammon']")
	WebElement footerBackgammonLink;
	
	@FindBy(xpath="//ul[@class='tl_footer_links_row']//a[text() = 'Domino']")
	WebElement footerDominoLink;
	
	@FindBy(xpath="//ul[@class='tl_footer_links_row']//a[text() = 'General Terms and Conditions']")
	WebElement footerTermsAndConditionsLink;
	
	@FindBy(xpath="//ul[@class='tl_footer_links_row']//a[text() = 'Sports Regulations']")
	WebElement footerSportsRegulationsLink;
	
	@FindBy(xpath="//ul[@class='tl_footer_links_row']//a[text() = 'Casino Regulations']")
	WebElement footerCasinoRegulationsLink;
	
	@FindBy(xpath="//ul[@class='tl_footer_links_row']//a[text() = 'Privacy Policy']")
	WebElement footerPrivacyPolicyLink;
	
	@FindBy(xpath="//ul[@class='tl_footer_links_row']//a[text() = 'Responsible Gaming']")
	WebElement footerResponsibleGamingLink;
	
	@FindBy(xpath="//ul[@class='tl_footer_links_row']//a[text() = 'About Us']")
	WebElement footerAboutUsLink;
	
	@FindBy(xpath="//ul[@class='tl_footer_links_row']//a[text() = 'Vacancies']")
	WebElement footerVacanciesLink;
	
	@FindBy(xpath="//ul[@class='tl_footer_links_row']//a[text() = 'Contact Us']")
	WebElement footerContactUsLink;
	
	public TotoLoginWindow openLoginDialog() {
		loginLink.click();
		return new TotoLoginWindow(driver);
	}
	
	public  TotoRegWindow openRegDialog() {
		regLink.click();
		return new TotoRegWindow(driver);
	}
	
	public void openLangDropDown() {
		langDropDown.click();
	}
	
	public void selectEngLang() {
		engLangSelect.click();
	}
	
	public  TotogamingPromotionsPage openPromotionsPage() {
		promotionsBtn.click();
		return new TotogamingPromotionsPage(driver);
	}
	
	public  TotogamingTotoExpertPage clickOnTotoExpertLink() {
		totoExpertLink.click();
		return new TotogamingTotoExpertPage(driver);
	}
		
	public  TotoSportsPage openSportsPage() {
		sportsLink.click();
		return new TotoSportsPage(driver);
	}
	
	public  TotoCasinoPage openCasinoPage() {
		casinoLink.click();
		return new TotoCasinoPage(driver);
	}
	
	public  TotoGuestPage openLiveCasinoDropDown() {
		liveCasinoLink.click();
		return new TotoGuestPage(driver);
	}
	
//	public TotoGuestPage openLiveCasinoDropDown() {
//		Actions action = new Actions(driver);
//		action.moveToElement(casinoLink).perform();
//		return new TotoGuestPage(driver);
//	}
	
	public  TotoLivePage openLivePage() {
		liveLink.click();
		return new TotoLivePage(driver);
	}
	
	//Casino Link x2
	public  TotoEvolutionLiveCasinoPage openEvolutionLiveCasinoPage() {
		evolutionLiveCasino.click();
		return new TotoEvolutionLiveCasinoPage(driver);
	}
	
	public  TotoLuckyStreakLiveCasinoPage openLuckyStreakLiveCasinoPage() {
		luckyStreakLiveCasino.click();
		return new TotoLuckyStreakLiveCasinoPage(driver);
	}
	
	//TV Games Link x12
	public TotoGuestPage openTvGamesDropDown() {
		tvGamesLink.click();
		return new TotoGuestPage(driver);
	}
	
	public TotoLucky7Page openTotoLucky7Page() {
		lucky7Link.click();
		return new TotoLucky7Page(driver);
	}
	
	public TotoLucky6Page openTotoLucky6Page() {
		lucky6Link.click();
		return new TotoLucky6Page(driver);
	}
	
	public TotoLucky5Page openTotoLucky5Page() {
		lucky5Link.click();
		return new TotoLucky5Page(driver);
	}
	
	public TotoDicePage openTotoDicePage() {
		diceLink.click();
		return new TotoDicePage(driver);
	}
	
	public TotoDiceDuelPage openTotoDiceDuelPage() {
		diceDuelLink.click();
		return new TotoDiceDuelPage(driver);
	}
	
	public TotoWheelPage openTotoWheelPage() {
		wheelLink.click();
		return new TotoWheelPage(driver);
	}
	
	public TotoBetOnPokerPage openTotoBetOnPokerPage() {
		betOnPokerLink.click();
		return new TotoBetOnPokerPage(driver);
	}
	
	public TotoBaccaratPage openTotoBaccaratPage() {
		baccaratLink.click();
		return new TotoBaccaratPage(driver);
	}
	
	public TotoWarOfBetsPage openTotoWarOfBetsPage() {
		warOfBetsLink.click();
		return new TotoWarOfBetsPage(driver);
	}
	
	public TotoSportLoto5From36Page openTotoSportLoto5From36Page() {
		sportLoto5From36Link.click();
		return new TotoSportLoto5From36Page(driver);
	}
	
	public TotoSportLoto7From42Page openTotoSportLoto7From42Page() {
		sportLoto7From42Link.click();
		return new TotoSportLoto7From42Page(driver);
	}
	
	public TotoSuperJackpotPage openTotoSuperJackpotPage() {
		superJackpotLink.click();
		return new TotoSuperJackpotPage(driver);
	}
	
	public  TotoFastGamesPage openFastGamesPage() {
		fastGamesLink.click();
		return new TotoFastGamesPage(driver);
	}
	
	public  TotoLoginWindow openPokerPage() {
		pokerLink.click();
		return new TotoLoginWindow(driver);
	}
	
	//Games Link x4
	
	public  TotoGuestPage openGamesDropDown() {
		gamesLink.click();
		return new TotoGuestPage(driver);
	}
	
	public  TotoBelotePage openBelotePage() {
		beloteLink.click();
		return new TotoBelotePage(driver);
	}
	
	public  TotoBackgammonPage openBackgammonPage() {
		backgammonLink.click();
		return new TotoBackgammonPage(driver);
	}
	
	public  TotoToto21Page openToto21Page() {
		toto21Link.click();
		return new TotoToto21Page(driver);
	}
	
	public  TotoDominoPage openDominoPage() {
		dominoLink.click();
		return new TotoDominoPage(driver);
	}
	
	//Keno Link x2
	public  TotoGuestPage openKenoDropDown() {
		kenoLink.click();
		return new TotoGuestPage(driver);
	}
	
	public  TotoKenoPage openKenoPage() {
		kenoDropDownLink.click();
		return new TotoKenoPage(driver);
	}
	
	
	public  TotoGoldKenoPage openGoldKenoPage() {
		goldKenoLink.click();
		return new TotoGoldKenoPage(driver);
	}
	
	public  TotoCrashPage openCrashPage() {
		crashLink.click();
		return new TotoCrashPage(driver);
	}
	
	public  TotoHiLoPage openHiLoPage() {
		hiLoLink.click();
		return new TotoHiLoPage(driver);
	}
	
	public  TotoSportsPage openBannersSportsPage() {
		sportsBanner.click();
		return new TotoSportsPage(driver);
	}
	
	public  TotoSportTournamentPage openSportTournamentPage() {
		sportTournamentBanner.click();
		return new TotoSportTournamentPage(driver);
	}
	
	public  TotoKenoPage openBannersKenoPage() {
		kenoBanner.click();
		return new TotoKenoPage(driver);
	}
	
	public  TotoCasinoPage openBannersCasinoPage() {
		casinoBanner.click();
		return new TotoCasinoPage(driver);
	}
	
	public  TotoEvolutionLiveCasinoPage openBannersLiveCasinoPage() {
		liveCasinoBanner.click();
		return new TotoEvolutionLiveCasinoPage(driver);
	}
	
	public  TotoBelotePage openBannersBelotePage() {
		beloteBanner.click();
		return new TotoBelotePage(driver);
	}
	
	public  TotoPokerPage openBannersPokerPage() {
		pokerBanner.click();
		return new TotoPokerPage(driver);
	}
	
	public  TwitterTotoPage openTwitterTotoPage() {
		twitterBtn.click();
		return new TwitterTotoPage(driver);
	}
	
	public  InstaTotoPage openInstaTotoPage() {
		instaBtn.click();
		return new InstaTotoPage(driver);
	}
	
	public  YoutubeTotoPage openYoutubeTotoPage() {
		youtubeBtn.click();
		return new YoutubeTotoPage(driver);
	}
	
	public  TelegramTotoPage openTelegramTotoPage() {
		telegramBtn.click();
		return new TelegramTotoPage(driver);
	}
	
	public  VkTotoPage openVkTotoPage() {
		vkBtn.click();
		return new VkTotoPage(driver);
	}
	
	public  OkTotoPage openOkTotoPage() {
		okBtn.click();
		return new OkTotoPage(driver);
	}
	
	public  LuckyLadysCharmPage openLuckyLadysCharmPage() {
		luckyLadysCharmBtn.click();
		return new LuckyLadysCharmPage(driver);
	}
	
	public FbTotoPage openFbTotoPage() {
		fbBtn.click();
		return new FbTotoPage(driver);
	}
	
	public SuperHot40Page open40SuperHotPage() {
		superHot40Btn.click();
		return new SuperHot40Page(driver);
	}
	
	public SugarPopPage openSugarPopPage() {
		sugarPopBtn.click();
		return new SugarPopPage(driver);
	}
	
	public BookOfSunPage openBookOfSunPage() {
		bookOfSunBtn.click();
		return new BookOfSunPage(driver);
	}
	
	public BlackJackPage openBlackJackPage() {
		blackJackBtn.click();
		return new BlackJackPage(driver);
	}
	
	public RoulettePage openRoulettePage() {
		rouletteBtn.click();
		return new RoulettePage(driver);
	}
	
	public BaccaratPage openBaccaratPage() {
		baccaratBtn.click();
		return new BaccaratPage(driver);
	}
	
	public DreamCatcherPage openDreamCatcherPage() {
		dreamCatcherBtn.click();
		return new DreamCatcherPage(driver);
	}
	
	public FooterPromotionsPage openFooterPromotionsPage() {
		footerPromotionsLink.click();
		return new FooterPromotionsPage(driver);
	}
	
	public FooterFAQPage openFooterFAQPage() {
		footerFAQLink.click();
		return new FooterFAQPage(driver);
	}
	
	public FooterSupportPage openFooterSupportPage() {
		footerSupportLink.click();
		return new FooterSupportPage(driver);
	}
	
	public FooterBettingShopsPage openFooterBettingShopsPage() {
		footerBettingShopsLink.click();
		return new FooterBettingShopsPage(driver);
	}	
	
	public FooterTotoExpertPage openFooterTotoExpertPage() {
		footerTotoExpertLink.click();
		return new FooterTotoExpertPage(driver);
	}
	
	public FooterResultsPage openFooterResultsPage() {
		footerResultsLink.click();
		return new FooterResultsPage(driver);
	}
	
	public FooterLiveResultsPage openFooterLiveResultsPage() {
		footerLiveResultsLink.click();
		return new FooterLiveResultsPage(driver);
	}
	
	public FooterStatisticsPage openFooterStatisticsPage() {
		footerStatisticsLink.click();
		return new FooterStatisticsPage(driver);
	}
	
	public FooterPreMatchBettingPage openFooterPreMatchBettingPage() {
		footerPreMatchBettingLink.click();
		return new FooterPreMatchBettingPage(driver);
	}
	
	public FooterLiveBettingPage openFooterLiveBettingPage() {
		footerLiveBettingLink.click();
		return new FooterLiveBettingPage(driver);
	}
	
	public FooterTvGamesPage openFooterTvGamesPage() {
		footerTvGamesLink.click();
		return new FooterTvGamesPage(driver);
	}
	
	public FooterFastGamesPage openFooterFastGamesPage() {
		footerFastGamesLink.click();
		return new FooterFastGamesPage(driver);
	}
	
	public FooterSportLottoPage openFooterSportLottoPage() {
		footerSportLottoLink.click();
		return new FooterSportLottoPage(driver);
	}
	
	public FooterSlotsPage openFooterSlotsPage() {
		footerSlotsLink.click();
		return new FooterSlotsPage(driver);
	}
	
	public FooterLiveCasinoPage openFooterLiveCasinoPage() {
		footerLiveCasinoLink.click();
		return new FooterLiveCasinoPage(driver);
	}
	
	public FooterBelotePage openFooterBelotePage() {
		footerBeloteLink.click();
		return new FooterBelotePage(driver);
	}
	
	public FooterToto21Page openFooterToto21Page() {
		footerToto21Link.click();
		return new FooterToto21Page(driver);
	}
	
	public FooterBackgammonPage openFooterBackgammonPage() {
		footerBackgammonLink.click();
		return new FooterBackgammonPage(driver);
	}
	
	public FooterDominoPage openFooterDominoPage() {
		footerDominoLink.click();
		return new FooterDominoPage(driver);
	}
	
	public FooterTermsAndConditionsPage openFooterTermsAndConditionsPage() {
		footerTermsAndConditionsLink.click();
		return new FooterTermsAndConditionsPage(driver);
	}
	
	public FooterSportsRegulationsPage openFooterSportsRegulationsPage() {
		footerSportsRegulationsLink.click();
		return new FooterSportsRegulationsPage(driver);
	}
	
	public FooterCasinoRegulationsPage openFooterCasinoRegulationsPage() {
		footerCasinoRegulationsLink.click();
		return new FooterCasinoRegulationsPage(driver);
	}
	
	public FooterPrivacyPolicyPage openFooterPrivacyPolicyPage() {
		footerPrivacyPolicyLink.click();
		return new FooterPrivacyPolicyPage(driver);
	}
	
	public FooterResponsibleGamingPage openFooterResponsibleGamingPage() {
		footerResponsibleGamingLink.click();
		return new FooterResponsibleGamingPage(driver);
	}
	
	public FooterAboutUsPage openFooterAboutUsPage() {
		footerAboutUsLink.click();
		return new FooterAboutUsPage(driver);
	}
	
	public FooterVacanciesPage openFooterVacanciesPage() {
		footerVacanciesLink.click();
		return new FooterVacanciesPage(driver);
	}
	
	public FooterContactUsPage openFooterContactUsPage() {
		footerContactUsLink.click();
		return new FooterContactUsPage(driver);
	}
	
}
