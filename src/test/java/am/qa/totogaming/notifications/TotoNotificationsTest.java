package am.qa.totogaming.notifications;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import am.qa.totogaming.page.guest.TotoGuestPage;
import am.qa.totogaming.page.login.TotoLoginWindow;
import am.qa.totogaming.page.member.TotoMemberPage;
import am.qa.totogaming.page.notifications.win.TotoNotificationsWindow;
import am.qa.totogaming.page.notifications.win.TotoNotificationsWindowUpdated;
import am.qa.totogaming.test.base.TotogamingBaseTest;
import am.qa.totogaming.util.DriverUtil;

public class TotoNotificationsTest extends TotogamingBaseTest {

	@Test
	@Parameters({ "totoUsername", "totoPassword"})
	public void notificationsTest(String totoUsername, String totoPassword) {
		driver.get("https://totogaming.am");
		TotoGuestPage guest = new TotoGuestPage(driver);
		TotoLoginWindow totoLoginWin = guest.openLoginDialog();
		totoLoginWin.fillTotoLoginCredentials(totoUsername, totoPassword);
		totoLoginWin.submitTotoLoginForm();
		DriverUtil.waitForElementPresent(driver, 5, "//span[@class='tg-ico']");
		
		TotoMemberPage notificationWinOpen = new TotoMemberPage(driver);
		
		notificationWinOpen.openLangDropDown();
		notificationWinOpen.selectEngLang();
		DriverUtil.waitForElementPresent(driver, 3, "//div[contains(@class, 'tg-flag-en')]");
		notificationWinOpen.openUserNameDropDown();
		notificationWinOpen.NotificatiosBtnClick();
		
		DriverUtil.waitForElementPresent(driver, 5, "//div[@id='notificationoptions']");
		
		TotoNotificationsWindow notWin = new TotoNotificationsWindow(driver);
		
		notWin.emailNotificationsDepositsClick();
		notWin.emailNotificationsWithdrawals();
		notWin.smsNotificationsDeposits();
		notWin.smsNotificationsWithdrawals();
		notWin.updateBtnClick();
		
		DriverUtil.waitForElementPresent(driver, 5, "//div[text()='Data is updated...']");
	
		TotoNotificationsWindowUpdated closeWin = new TotoNotificationsWindowUpdated(driver);
		
		closeWin.clickCloseBtn();
	}
	
}
