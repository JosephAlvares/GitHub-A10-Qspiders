package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentToGetCountAndLinks {
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.pinterest.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Count of Links:"+links.size());
		
		for(WebElement link : links)
		{			
			System.out.println("Name of the link"+link.getText());
			System.out.println("URL of the link"+link.getAttribute("href"));
		}
		
		driver.quit();
	}

}
