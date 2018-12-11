package day7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		ChromeDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:/Users/gofor/Workspace/libs/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/droppable/");
		WebElement frameLink = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frameLink);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		String colorOfTargetBeforeDragAndDrop = target.getCssValue("color");
		Actions action = new Actions(driver);
		//action.dragAndDrop(source, target).build().perform();
		//Another way to perform drag and drop
		action.moveToElement(source).clickAndHold().moveToElement(target).release().build().perform();
		String colorOfTargetAfterDragAndDrop = target.getCssValue("color");
		System.out.println("Color before drag and drop : "+ colorOfTargetBeforeDragAndDrop);
		System.out.println("Color After drag and drop : "+ colorOfTargetAfterDragAndDrop);

	}

}
