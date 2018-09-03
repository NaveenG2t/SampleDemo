package navish.SampleDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.common.annotations.VisibleForTesting;



public class AppTest extends BaseClass {
	
	
	@BeforeClass
	public void Startup() {
		GetDriver("firefox");
	}
	
	@Test
	public void Test1() throws InterruptedException {
	    
		LoginClass lc = new LoginClass();
		
		
		UIClass ui = new UIClass(driver);
		ui.Btn_reg.click();
		
		Thread.sleep(5000);

		String Expected_Title = "Registration | Demoqa"; 
		String Actual_Title = driver.getTitle().toString();
		
		
		if(Expected_Title.equals(Actual_Title));{
			System.out.println("IS Equal");
		}
		
		driver.findElement(By.name("first_name")).sendKeys("Kannan");
		
	}

}
