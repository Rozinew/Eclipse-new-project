package helloworld;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.google.co.in/");
		driver.navigate().to("https://www.youtube.com/");
		driver.findElement(By.name("search_query")).sendKeys("Honey singh latest songs");
		driver.findElement(By.id("search-icon-legacy")).click();
		wait.until(ExpectedConditions.urlMatches("https://www.youtube.com/results?search_query=Honey+singh+latest+songs"));
		Thread.sleep(1000);

	}

}
