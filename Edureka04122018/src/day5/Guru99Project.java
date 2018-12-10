package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverCommandExecutor;
import org.openqa.selenium.support.ui.Select;

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
		driver.findElement(By.name("name")).sendKeys("Gagan");
		driver.findElement(By.xpath("//input[@value='f']")).click();
		driver.findElement(By.name("dob")).sendKeys("05/03/2017");
		driver.findElement(By.name("addr")).sendKeys("Amsterdam \n Netherlands");
		driver.findElement(By.name("city")).sendKeys("Amsterdam");
		driver.findElement(By.name("state")).sendKeys("Netherlands");
		driver.findElement(By.name("pinno")).sendKeys("657854");
		driver.findElement(By.name("telephoneno")).sendKeys("1234567895");
		String emailID = "aa" + System.currentTimeMillis() + "@gmail.com";
		driver.findElement(By.name("emailid")).sendKeys(emailID);
		driver.findElement(By.name("password")).sendKeys("hfgdh");
		driver.findElement(By.name("sub")).click();
		//driver.findElement(By.partialLinkText(partialLinkText))
		//driver.findElement(By.linkText("Log out")).click();
		
		
	}
	
	public void addNewAccount(String customerID) {
		driver.findElement(By.linkText("New Account")).click();
		driver.findElement(By.name("cusid")).sendKeys(customerID);
		WebElement selectAccount = driver.findElement(By.name("selaccount"));
		Select accountDropdown = new Select(selectAccount);
		accountDropdown.selectByVisibleText("Current");
		driver.findElement(By.name("inideposit")).sendKeys("46478");
		driver.findElement(By.name("button2")).click();
		
	}
	
	public String getCustomerID() {
		String customerID = driver.findElement(By.xpath("//table[@id='customer']/tbody/tr[4]/td[2]")).getText();
		return customerID;
	}
	
	public void changePassword() {
		driver.findElement(By.linkText("Change Password")).click();
		driver.findElement(By.name("oldpassword")).sendKeys("hubumug");
		driver.findElement(By.name("newpassword")).sendKeys("h5@hdh");
		driver.findElement(By.name("confirmpassword")).sendKeys("h5@hdh");
		driver.findElement(By.name("sub")).click();
	}

}
