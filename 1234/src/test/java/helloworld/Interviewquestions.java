package helloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Interviewquestions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.amazon.in/");
	     driver.findElement(By.id("twotabsearchtextbox")).sendKeys("IPHONE");
	     driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	     driver.findElement(By.xpath("//*[contains(text(),'iPhone 16')]")).click();

	     

	}

}
