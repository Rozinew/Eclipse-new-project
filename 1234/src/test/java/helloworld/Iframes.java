package helloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframes {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	     driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
	   WebElement image  =driver.findElement(By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle']"));
	  WebElement trash =driver.findElement(By.xpath("//div[@class='ui-widget-content ui-state-default ui-droppable']"));
          Actions act = new Actions (driver);
          act.dragAndDrop(image, trash).perform();
	}

}
