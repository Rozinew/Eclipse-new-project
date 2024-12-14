package helloworld;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script {

	public static void (String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?tag=msndeskstdin-21&ref=pd_sl_5joubhsx1q_e&adgrpid=1329311215457583&hvadid=83082214671780&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=148996&hvtargid=kwd-83082880452797:loc-90&hydadcr=5653_2377271");
		 webdriver title=driver.getTitle();
		 System.out.println("title=" +title);
		 
	}
