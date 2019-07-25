package am.qa.totogaming.tests.menus;

import java.util.ArrayList;

import org.testng.annotations.Test;

import am.qa.facebook.login.FacebookLoginPage;
import am.qa.totogaming.page.guest.TotoGuestPage;
import am.qa.totogaming.test.base.TotogamingBaseTest;
import am.qa.totogaming.util.DriverUtil;
import am.qa.totogaming.util.ReadFromFileUtil;

public class TotogamingSocialMediaMenu extends TotogamingBaseTest {

	@Test
	public void twitterTest() {
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openTwitterTotoPage();
		ArrayList<String> promoTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(promoTab.get(1));
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='ProfileHeaderCard']//span[@class='username u-dir']");
		driver.close();
		driver.switchTo().window(promoTab.get(0));
	}

	@Test
	public void instagramTest() {
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openInstaTotoPage();
		ArrayList<String> promoTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(promoTab.get(1));
		DriverUtil.waitForElementPresent(driver, 3, "//h1[text()='TotoGaming']");
		driver.close();
		driver.switchTo().window(promoTab.get(0));
	}

	@Test
	public void youtubeTest() {
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openYoutubeTotoPage();
		ArrayList<String> promoTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(promoTab.get(1));
		DriverUtil.waitForElementPresent(driver, 3,"//h1[@id='channel-title-container']//span[contains(text(), 'TOTO')]");
		driver.close();
		driver.switchTo().window(promoTab.get(0));
	}

	@Test
	public void telegramTest() {
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openTelegramTotoPage();
		ArrayList<String> promoTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(promoTab.get(1));
		DriverUtil.waitForElementPresent(driver, 3, "//div[@dir='auto' and contains(text(), 'Toto')]");
		driver.close();
		driver.switchTo().window(promoTab.get(0));
	}

	@Test
	public void okTest() {
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openOkTotoPage();
		ArrayList<String> promoTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(promoTab.get(1));
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='mctc_name']//h1[contains(text(), 'Toto')]");
		driver.close();
		driver.switchTo().window(promoTab.get(0));
	}

	@Test
	public void fbTest() throws Exception {
		
		String fbUsername = ReadFromFileUtil.getProperties("fbUsername");
		String fbPassword = ReadFromFileUtil.getProperties("fbPassword");
		
		driver.get("https://en-gb.facebook.com/login/");
		FacebookLoginPage fbLoginPage = new FacebookLoginPage(driver);
		fbLoginPage.fillFbLoginCredentials(fbUsername, fbPassword);
		fbLoginPage.submitFbLoginForm();
		driver.get("https://totogaming.am");
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openFbTotoPage();
		ArrayList<String> promoTab = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(promoTab.get(1));
		DriverUtil.waitForElementPresent(driver, 20, "//div[@id='entity_sidebar']//span[contains(text(), 'TotoGaming')]");
		driver.close();
		driver.switchTo().window(promoTab.get(0));
	}

}
