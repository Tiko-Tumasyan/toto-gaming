import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FbTotoTest {

	@Test
	public void fbTest(){
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://totogaming.am");
		WebElement fbBtn = driver.findElement(By.xpath("//a[contains(@class, 'tg__socials--fb')]"));
		fbBtn.click();
			
	}
	
}
