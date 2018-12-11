package day7;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonProject {
	ChromeDriver driver;
	
		public void inVokeBrowser() {
			System.setProperty("webdriver.chrome.driver", "C:/Users/gofor/Workspace/libs/chromedriver_win32/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
			driver.get("https://amazon.in");			
			
		}
		
		public void searchProduct(String product, String category) {
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys(product);
			WebElement dropDown = driver.findElement(By.id("searchDropdownBox"));
			Select  selCategory = new Select(dropDown);
			selCategory.selectByVisibleText(category);
			driver.findElement(By.xpath("//input[@value='Go']")).click();
			System.out.println(driver.findElement(By.id("s-result-count")).getText());
		}

}
