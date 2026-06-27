package webdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetTitle {
public static void main(String[] args) {
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	//Online Shopping India Mobile, Cameras, Lifestyle & more Online @ Flipkart.com
	
	String title = driver.getTitle();
	System.out.println(title);
	
	if (title.equals("Online Shopping India Mobile, Cameras, Lifestyle & more Online @ Flipkart.com")) {
		System.out.println("Welcome Page is displayed");
	}
}
}
