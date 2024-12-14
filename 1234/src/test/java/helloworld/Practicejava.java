package helloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practicejava {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.naukri.com/");
	     driver.findElement(By.xpath("//a[@id='login_Layer']")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("rozishahid32@gmail.com");
	     driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Rozi@786");
	     driver.findElement(By.xpath("//button[@class='btn-primary loginButton']")).click();
	     //driver.findElement(By.xpath("//input[placeholder='Email ID / Username']")).sendKeys("rozishahid32@gmail.com");
	     //driver.findElement(By.id("login-submit")).click();
	}

}
