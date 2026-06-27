package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnIsSelected {
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		boolean status = driver.findElement(By.xpath("//label[@for='pollanswers-1']")).isDisplayed();
		System.out.println(status);
		
		boolean enabled = driver.findElement(By.xpath("//label[@for='pollanswers-1']")).isEnabled();
		System.out.println(enabled);
	}

}
