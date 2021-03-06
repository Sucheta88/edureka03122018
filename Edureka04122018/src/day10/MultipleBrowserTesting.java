package day10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowserTesting {

	WebDriver driver;

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
		driver.get("https://amazon.in");	

	}

}
