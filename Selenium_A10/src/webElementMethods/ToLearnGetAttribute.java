package webElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetAttribute {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Count of Links"+ links.size());
		
		for(WebElement id:links) {
			System.out.println("Names of the link"+id.getText());
			System.out.println("URL of the link is"+id.getAttribute("href"));
		}
		driver.quit();
	}
}
