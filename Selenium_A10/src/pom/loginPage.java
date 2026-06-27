package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	@FindBy(id="Email")
	private WebElement emailTxtField;
	
	public loginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getEmailTxtField() {
		return emailTxtField;
	}
	
	@FindBy(id="Password")
	private WebElement PassTxtField;

	public WebElement getPassTxtField() {
		return PassTxtField;
	}
	
	
	@FindBy(xpath="//input[@value='Log in']")
	private WebElement LogInButton;

	public WebElement getLogInButton() {
		return LogInButton;
	}
	
		

}
