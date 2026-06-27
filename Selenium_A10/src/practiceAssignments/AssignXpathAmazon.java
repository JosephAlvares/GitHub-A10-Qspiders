package practiceAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignXpathAmazon {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search Amazon.in')]")).sendKeys("iphone 16 pro");	
		driver.findElement(By.xpath("//input[contains(@id,'nav-search')]")).click();
		
		//Mobile Name
		List<WebElement> names = driver.findElements(By.xpath("//div[contains(@class,'a-section')]/..//span[contains(text(),'iPhone 16 Plus')]"));
		
		for(WebElement mobileName : names) {
			
			System.out.println(mobileName.getText());
			
		}
		//Price
		
		List<WebElement> price = driver.findElements(By.xpath("//div[contains(@class,'a-section a-spacing-small a-spacing-top-small')]/..//span[contains(text(),'₹')]"));
		
		for(WebElement mobilePrice : price) {
			
			System.out.println(mobilePrice.getText());
			
		}
		
	}

}
