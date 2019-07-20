package am.qa.totogaming.tests.menus;

import java.util.ArrayList;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import am.qa.facebook.login.FacebookLoginPage;
import am.qa.totogaming.page.guest.TotoGuestPage;
import am.qa.totogaming.test.base.TotogamingBaseTest;
import am.qa.totogaming.util.DriverUtil;

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

	@Test(dependsOnMethods = "twitterTest")
	public void instagramTest() {
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openInstaTotoPage();
		ArrayList<String> promoTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(promoTab.get(1));
		DriverUtil.waitForElementPresent(driver, 3, "//h1[text()='TotoGaming']");
		driver.close();
		driver.switchTo().window(promoTab.get(0));
	}

	@Test(dependsOnMethods = "instagramTest")
	public void youtubeTest() {
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openYoutubeTotoPage();
		ArrayList<String> promoTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(promoTab.get(1));
		DriverUtil.waitForElementPresent(driver, 3,"//h1[@id='channel-title-container']//span[contains(text(), 'TOTO')]");
		driver.close();
		driver.switchTo().window(promoTab.get(0));
	}

	@Test(dependsOnMethods = "youtubeTest")
	public void telegramTest() {
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openTelegramTotoPage();
		ArrayList<String> promoTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(promoTab.get(1));
		DriverUtil.waitForElementPresent(driver, 3, "//div[@dir='auto' and contains(text(), 'Toto')]");
		driver.close();
		driver.switchTo().window(promoTab.get(0));
	}

	@Test(dependsOnMethods = "telegramTest")
	public void okTest() {
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openOkTotoPage();
		ArrayList<String> promoTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(promoTab.get(1));
		DriverUtil.waitForElementPresent(driver, 3, "//div[@class='mctc_name']//h1[contains(text(), 'Toto')]");
	}

	@Test(dependsOnMethods = "okTest")
	@Parameters({ "fbUsername", "fbPassword" })
	public void fbTest(String fbUsername, String fbPassword) {
		driver.get("https://en-gb.facebook.com/login/");
		FacebookLoginPage fbLoginPage = new FacebookLoginPage(driver);
		fbLoginPage.fillFbLoginCredentials(fbUsername, fbPassword);
		fbLoginPage.submitFbLoginForm();
		ArrayList<String> promoTab = new ArrayList<String>(driver.getWindowHandles());
		driver.close();
		driver.switchTo().window(promoTab.get(0));
		TotoGuestPage guest = new TotoGuestPage(driver);
		guest.openFbTotoPage();
		promoTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(promoTab.get(1));
		DriverUtil.waitForElementPresent(driver, 3, "//div[@id='entity_sidebar']//span[contains(text(), 'TotoGaming')]");
		driver.close();
		driver.switchTo().window(promoTab.get(0));
	}

}
