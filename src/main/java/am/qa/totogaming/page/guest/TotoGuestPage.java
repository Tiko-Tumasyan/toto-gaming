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
import am.qa.totogaming.top.casino.games.buttons.pages.LuckyLadysCharmPage;

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
	
}
