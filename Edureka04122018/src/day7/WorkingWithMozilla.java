package day7;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithMozilla {
	FirefoxDriver driver;
	List<WebElement> allLinks;
		public void inVokeBrowser() {
			System.setProperty("webdriver.gecko.driver", "C:/Users/gofor/Workspace/libs/geckodriver-v0.23.0-win64/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
			driver.get("https://flipkart.com");
			driver.findElement(By.xpath("//div[@class='_3Njdz7']/button[@class='_2AkmmA _29YdH8']")).click();;
			
		}
		
		public void mouseHover() {
			
			WebElement eleckLink= driver.findElement(By.xpath("//span[text()='Electronics']"));
			Actions action = new Actions(driver);
			action.moveToElement(eleckLink).build().perform();
			WebElement samsungLink = driver.findElement(By.linkText("Samsung"));
			String urlOfSamLnk = samsungLink.getAttribute("href");
			System.out.println("Url of Samsung link : "+urlOfSamLnk);
			System.out.println(driver.getTitle());
		}
		
		public int getLinkCount() {
			
		 allLinks = driver.findElements(By.tagName("a"));
		    int count = allLinks.size();
		    return count;
		}
		
		public void printAllLinks() {
			for(WebElement link : allLinks) {
				System.out.println(link.getText()+ "and its URL : "+link.getAttribute("href"));
			}
			
		}


}
