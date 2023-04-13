package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.WebTestBase;

public class MyAccountPage extends WebTestBase {
	 
	
	@FindBy(xpath = "//*[@class='sl-login-switch-link__link']")
	WebElement create; 
	
	public MyAccountPage(){
        PageFactory.initElements(driver, this);
    }
	
	
	
	public void createaccount() {
		create.click();
	}


	
}
