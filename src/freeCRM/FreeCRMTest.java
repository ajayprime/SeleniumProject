package freeCRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FreeCRMTest {

	WebDriver driver;
	@Test
	public void crmLogin() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	driver.get("https://www.freecrm.com/index.html");
	Thread.sleep(5000);
	WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
	username.sendKeys("Ajay4oct");
	Thread.sleep(5000);
			WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
			Thread.sleep(5000);
			password.sendKeys("ajaykharwar4oct");
			
			WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
			loginBtn.click();
			driver.close();
		
	}
}
