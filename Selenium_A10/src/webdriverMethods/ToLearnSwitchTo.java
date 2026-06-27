package webdriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitchTo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/products_page/51");
		Thread.sleep(40000);
		driver.findElement(By.id("compare")).click();
		
		Set<String> allWinIds = driver.getWindowHandles();
		for(String id :allWinIds) {
			
			driver.switchTo().window(id);
			String url = driver.getCurrentUrl();
			
			if(url.equals("https://www.flipkart.com/")) {
				driver.manage().window().maximize();
			}else if(url.equals("https://www.amazon.in/")) {
				driver.manage().window().minimize();
			}else if(url.equals("https://www.ebay.com/")) {
				driver.close();
			}
		}
		
		
	}

}
