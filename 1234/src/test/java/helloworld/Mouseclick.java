package helloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseclick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/buttons.php");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(3000);
		//right click
		
		WebElement button1=driver.findElement(By.xpath("//button[@class='btn btn-secondary']"));
		Actions act = new Actions(driver);
		act.contextClick(button1).perform();
		
		// double click
		
		WebElement button=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		act.doubleClick(button).perform();
		

	}

}
