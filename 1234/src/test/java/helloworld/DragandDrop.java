package helloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import 
public class DragandDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/droppable.php");
		WebElement S1=driver.findElement(By.id("draggable"));
		WebElement S2=driver.findElement(By.id("droppable"));
		Actions a = new Actions(driver);
		a.dragAndDrop(S1, S2).perform();
	}

}
