package freeCRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomePageTest {

	WebDriver driver;
	@Test
	public void crmLogin() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().deleteAllCookies();
		
}
}
