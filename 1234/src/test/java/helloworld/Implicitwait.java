package helloworld;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicitwait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get("https://www.google.co.in/");
	   //WebDriverWait wait = new WebDriverWait(driver,30);
	  // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.urlToBe("https://www.youtube.com/"));
		driver.navigate().to("https://www.youtube.com/");
		driver.findElement(By.name("search_query")).sendKeys("Honey singh latest songs");
		driver.findElement(By.id("search-icon-legacy")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlMatches("https://www.youtube.com/results?search_query=Honey+singh+latest+songs"));
		//driver.get("https://www.youtube.com/results?search_query=Honey+singh+latest+songs");
		driver.navigate().back();
		//driver.findElement(By.xpath("//aria-label[text()='MILLIONAIRE SONG (Full Video): @YoYoHoneySingh  | GLORY | BHUSHAN KUMAR by T-Series 109,052,047 views 1 month ago 3 minutes, 30 seconds']")).click();
		//wait.until(ExpectedConditions.urlToBe("https://www.youtube.com/"));
		//driver.navigate().back();
		//driver.navigate().forward();
		
	}

}
