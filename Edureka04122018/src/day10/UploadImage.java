package day10;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadImage {

	ChromeDriver driver;

	public void inVokeBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/gofor/Workspace/libs/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("https://images.google.com/?gws_rd=ssl");
	}

	public void uploadImage() throws IOException {
		driver.findElement(By.className("S3Wjs")).click();
		driver.findElement(By.linkText("Een afbeelding uploaden")).click();
		driver.findElement(By.id("qbfile")).click();
		Runtime.getRuntime().exec("C:/Users/gofor/git/repository/edureka03122018/Edureka04122018/Script/Upload.exe");
	}

}
