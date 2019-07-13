package am.qa.totogaming.page.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObject {

	protected WebDriver driver;

	public PageObject(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);//bolor findBy-ery inicializacnum e.
		
	}

}
