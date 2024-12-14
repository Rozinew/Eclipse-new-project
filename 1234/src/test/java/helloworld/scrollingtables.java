package helloworld;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

import sun.awt.SunHints.Value;

public class scrollingtables {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		   driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
		   
		   Thread.sleep(400);
		  List<WebElement> rows= driver.findElements(By.xpath("//table[@class = 'table table-striped mt-3']/tbody/tr"));
		 System.out.println("total numbers of rows :" +rows.size());
		 
		 List<WebElement> columns= driver.findElements(By.xpath("//table[@class='table table-striped mt-3']/thead/tr/th"));
		 System.out.println("Total number of columns: " + columns.size());
		
		 //WebElement cellValue = driver.findElement(By.xpath("//table[@class='table table-striped mt-3']/tbody/tr[1]/td[1]"));
        //String value = cellValue.getText();
        // System.out.println("The value is: " + value);
         
         //for (int r=1; r<=rows.size(); r++ )
         //{
        //	 for( int c=1;c<=columns.size();c++)
        	 //{
        		 //String data =driver.findElement(By.xpath("//table[@class='table table-striped mt-3']/tbody/tr["+r+"]/td["+c+"]")).getText();
        	//        
        	        // System.out.println("The value is: " + data);
        	 //}      
        	//	System.out.println(" ");
        	 
        	 
        // }
         //WebElement cellValue = driver.findElement(By.xpath("//table[@class='table table-striped mt-3']/tbody/tr[1]/td[1]"));
         //String value = cellValue.getText();
         //System.out.println("The value is: " + value);
         //for( int c=1;c<=columns.size();c++)
    	 //{
    		 //String data =driver.findElement(By.xpath("//table[@class='table table-striped mt-3']/tbody/tr[1]/td["+c+"]")).getText();
    	        
    	      //   System.out.println("The value is: " + data);
         
    	// }
         for (int r=1; r<=rows.size(); r++ )
         {
        	 String data =driver.findElement(By.xpath("//table[@class='table table-striped mt-3']/tbody/tr["+r+"]/td[2]")).getText();
        	 System.out.println("The value is: " + data);
         }
         
         
         
         driver.quit();
	}
	
        	 
	}


