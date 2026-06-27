package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPageAssignment {
	
	//RegisterPage
	@FindBy(id="FirstName")
	private WebElement FirstName;
	
	public RegisterPageAssignment(WebDriver Driver) {
		PageFactory.initElements(Driver,this);		
	}

	public WebElement getFirstName() {
		return FirstName;
	}
	
	@FindBy(id="LastName")
	private WebElement LastName;

	public WebElement getLastName() {
		return LastName;
	}
	
	@FindBy(id="Email")
	private WebElement Email;

	public WebElement getEmail() {
		return Email;
	}
	
	
	@FindBy(id="Password")
	private WebElement Password;

	public WebElement getPassword() {
		return Password;
	}
	
	@FindBy(id="ConfirmPassword")
	private WebElement ConfirmPassword;

	public WebElement getConfirmPassword() {
		return ConfirmPassword;
	}
	
	
	@FindBy(id="register-button")
	private WebElement Registerbttn;

	public WebElement getRegisterbttn() {
		return Registerbttn;
	}
	
	@FindBy(id="gender-male")
	private WebElement gmmale;

	public WebElement getGmmale() {
		return gmmale;
	}
	
	


}
