package helloworld;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowswitching2 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
	 driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
	 driver.switchTo().alert().dismiss();
	 driver.findElement(By.cssSelector(".button e.g. button_hilite button_pale small_button")).click();
	 Set<String> windows = driver.getWindowHandles(); //[parentid,childid,subchildId]
	   Iterator<String>it = windows.iterator();
	   String parentId = it.next();
	   String childId = it.next();
      driver.switchTo().window(childId);
}
}
	