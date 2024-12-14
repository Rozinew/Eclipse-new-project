package helloworld;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Logintest {
	WebDriver driver;
	
    @BeforeClass
	void setup()
	{
		
		driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
	}
    @Test
    

     void testLogin()
     {
    	 LoginPage lp= new LoginPage(driver);
    	 lp.clicklogin();
    	 lp.SetUserName("rozishahid32@gmail.com");
    	 lp.SetPassword("Rozi@786");
    	 lp.clicksubmit();
     }
   
}
