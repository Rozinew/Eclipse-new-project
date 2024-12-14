package helloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardactions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/login.php");
		Actions a = new Actions(driver); 
		//a.sendKeys(Keys.ENTER).perform();
		//a.sendKeys(Keys.SHIFT).perform(); 
		//a.sendKeys(Keys.BACK_SPACE).perform();
		driver.findElement(By.id("email")).sendKeys("rozishahid32@gmail.com"); 
		
		//ctlr+ A
		
		a.keyDown(Keys.CONTROL);
		a.sendKeys("a"); 
		a.keyUp(Keys.CONTROL);
		a.perform(); 
		
		//ctrl+c
		
		a.keyDown(Keys.CONTROL); 
		a.sendKeys("c"); 
		a.keyUp(Keys.CONTROL); 
		a.perform();
		driver.findElement(By.id("password"));
		
		
		//CTLR + V
		
		a.sendKeys(Keys.ENTER);
		a.perform();
		a.keyDown(Keys.CONTROL);
		a.sendKeys("v");
		a.keyUp(Keys.CONTROL);
		a.perform();
		
	}


	}


