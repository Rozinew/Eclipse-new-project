package helloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseactions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	    WebElement menu =driver.findElement(By.xpath("//li[@class='menu-item menu-item-type-post_type menu-item-object-page current-menu-ancestor current_page_ancestor menu-item-has-children menu-item-2822']"));
	     Actions act=new Actions (driver);
	     act.moveToElement(menu).perform();
	     
	}

}
