package helloworld;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.amazon.in/");
	     WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
	     Select d = new Select(dropdown);
	     List<WebElement> allOptions = d.getOptions();
         System.out.println("Dropdown values are:");
         //for (WebElement option : allOptions) {
             //System.out.println(option.getText());
         for (int i = 0; i < allOptions.size(); i++) {
             System.out.println(allOptions.get(i).getText());
         
         }

	}
	

}
