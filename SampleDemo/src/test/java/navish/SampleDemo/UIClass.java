package navish.SampleDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UIClass {

	private WebDriver driver;
	
	@FindBy(linkText="Registration") public WebElement Btn_reg;
	
	public UIClass(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
}
