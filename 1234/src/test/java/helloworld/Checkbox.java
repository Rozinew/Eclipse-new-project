package helloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/check-box.php");
		driver.findElement(By.xpath("//input[@id='c_bs_1']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='c_bs_2']")).isSelected());
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		Thread.sleep(4000);
		driver.findElement(By.linkText("Radio Button")).click();
		driver.findElement(By.xpath("//input[@value='igottwo']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='check']")).getText());
		
		
	}

}
