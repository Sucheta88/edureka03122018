package da11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Guru99 {
	WebDriver driver;
    @Parameters("browserType")
	@BeforeClass(alwaysRun=true)
	public void invokeBrowser(String browserType) {
		if (browserType.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:/Users/gofor/Workspace/libs/chromedriver_win32/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserType.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:/Users/gofor/Workspace/libs/geckodriver-v0.23.0-win64/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserType.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "C:/Users/gofor/Workspace/libs/MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
		} else {
			System.out.println("Invalid Browser : " + browserType);
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/v4");	
	}

	@AfterClass(alwaysRun=true)
	public void closeBrowser() {
		driver.quit();
	}

	@Test(priority = 0)
	public void getTitle() {

		String excpectedResult = "Guru99 Bank Home Page 1";
		String actualResult = driver.getTitle();
		Assert.assertEquals(actualResult, excpectedResult);
	}

	@Parameters({ "userName", "password" })
	@Test(priority = 1000,groups="Sanity")
	public void logIn(String userName, String password) {
		driver.findElement(By.name("uid")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("btnLogin")).click();
	}

}
