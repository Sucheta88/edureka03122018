package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99Project {
	
	ChromeDriver driver;
	
	public void inVokeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/gofor/Workspace/libs/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.guru99.com/v4/");
	}
	
	public void closeBrowser() {
		driver.quit();
	}
	
	public void logIn(String username, String password) {
		driver.findElement(By.name("uid")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("btnLogin")).click();
	}
	
	public void addCustomer() {
		
		driver.findElement(By.linkText("New Customer")).click();
	}

}
