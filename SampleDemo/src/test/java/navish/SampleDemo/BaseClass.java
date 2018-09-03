package navish.SampleDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
 public WebDriver driver ; 
 
 public void GetDriver(String browser) {
	 
	 if(browser== "Chrome") {
	 System.setProperty("webdriver.chrome.driver", "resource/driver/chromedriver.exe");
//		System.setProperty("webdriver.gecko.dr", "resource/driver/chromedriver.exe");
		 driver = new ChromeDriver();
		
		driver.get("http://demoqa.com/");
		driver.manage().window().maximize();
		
 }else {
	 
	System.setProperty("webdriver.gecko.driver", "resource/driver/geckodriver.exe");
		 driver = new FirefoxDriver();
		
		driver.get("http://demoqa.com/");
		driver.manage().window().maximize();
 }
 
}
}