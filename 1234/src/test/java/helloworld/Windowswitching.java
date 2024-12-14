package helloworld;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Windowswitching {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button#newTabBtn")));
		driver.findElement(By.cssSelector("button#newTabBtn")).click();
		Set<String> windows = driver.getWindowHandles(); //[parentid,childid,subchildId]
		   Iterator<String>it = windows.iterator();

				String parentId = it.next();

				String childId = it.next();

				driver.switchTo().window(childId);;
	 //driver.findElement(By.id("alertBox")).click();
	}

}
