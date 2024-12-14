package helloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

		
		WebDriver driver;
		
		LoginPage(WebDriver driver)
		{
			this.driver=driver;
		}
	          
		   By btn_login= By.xpath("//a[@id='login_Layer']");
		   By txt_username_loc =By.xpath("//input[@placeholder='Enter your active Email ID / Username']");
		   By txt_password_loc= By.xpath("//input[@placeholder='Enter your password']");
		   By btn_submit=  By.xpath("//button[@class='btn-primary loginButton']");
		    
		    public void clicklogin()
		    {
		    	driver.findElement(btn_login).click();
		    	
		    }
		    
		    public void SetUserName(String user)
		    {
		    	driver.findElement(txt_username_loc).sendKeys("rozishahid32@gmail.com");
		    }
		    
		    public void SetPassword(String password)
		    {
		    	driver.findElement(txt_password_loc).sendKeys("Rozi@786");
		    }
		    public void clicksubmit()
		    {
		    	driver.findElement(btn_submit).click();
		    }
		    
	
		
	}

	

}
