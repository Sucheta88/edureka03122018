package day7;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
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
			//selCategory.selectByVisibleText(category);
			driver.findElement(By.xpath("//input[@value='Go']")).click();
			System.out.println(driver.findElement(By.id("s-result-count")).getText());
		}
		
		public String getNthProduct(int itemNumber) {
			String productIdLocator = String.format("result_%d", itemNumber - 1);
			return driver.findElement(By.id(productIdLocator)).getText();
		}
		
		public void printAllProducts() {
			List<WebElement> allProducts = driver.findElements(By.xpath("//li[starts-with(@id,'result_')]"));
			for(WebElement products:allProducts) {
				System.out.println(products.getText());
				System.out.println("------------------------------------------");
			}
		}
		
		public void printAllProductsViaMouseScrollDown() {
			List<WebElement> allProducts = driver.findElements(By.xpath("//li[starts-with(@id,'result_')]"));
			Actions action = new  Actions(driver);
			
			for(WebElement products:allProducts) {
				action.moveToElement(products).build().perform();
				System.out.println(products.getText());
				System.out.println("------------------------------------------");
			}
		}
		
		public void printAllProductsViaJavaScript() {
			List<WebElement> allProducts = driver.findElements(By.xpath("//li[starts-with(@id,'result_')]"));
			int x,y;	
			
			
			for(WebElement product:allProducts) {
				x = product.getLocation().x;
				y = product.getLocation().y;
				scrollDown(x, y);
				System.out.println(product.getText());
				System.out.println("------------------------------------------");
			}
		}
		
		private void scrollDown(int x,int y) {
			String jsCommand = String.format("window.scrollBy(%d,%d)", x,y);
			driver.executeScript(jsCommand);
		}

}
