package helloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseover {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.navigate().to("https://www.youtube.com/");
		//Actions a = new Actions(driver);
		//a.moveToElement(driver.findElement(By.id("guide-button"))).build().perform();
		//a.moveToElement(driver.findElement(By.name("search_query"))).click().keyDown(Keys.SHIFT).sendKeys("honey singh songs");
		//driver.findElement(By.name("search_query")).sendKeys("honey singh");
		WebElement searchbox= driver.findElement(By.name("search_query"));
		searchbox.sendKeys(Keys.SHIFT+"aadat songs");
	}
}