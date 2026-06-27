package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class welcomePage {
	//Register
	//Declaration
	@FindBy (linkText = "Register")
	private WebElement regLink;
	
	//Initialization
	public welcomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}
	//Calling getter methods

	public WebElement getRegLink() {
		return regLink;
	}
	
	//Login
	@FindBy (linkText = "Log in")
	private WebElement loginLink;

	public WebElement getLoginLink() {
		return loginLink;
	}
	
	//search text field
	@FindBy(id = "small-searchterms")
	private WebElement searchTextField;

	public WebElement getSearchTextField() {
		return searchTextField;
	}
	
	
	//Search Button
	@FindBy (xpath="//input[contains(@value,'Search')])[2]")
	private WebElement searchButton;

	public WebElement getSearchButton() {
		return searchButton;
	}
	
	
	
		
	
	

}
