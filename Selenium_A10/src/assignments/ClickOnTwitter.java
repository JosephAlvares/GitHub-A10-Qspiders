package assignments;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnTwitter {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Twitter']")).click();
		
		Set<String> allWinIds = driver.getWindowHandles();
		for(String Id:allWinIds) {
			driver.switchTo().window(Id);
			String url = driver.getCurrentUrl();
			System.out.println("Current url:"+Id);
			if(url.equals("https://x.com/nopCommerce")) {
				Thread.sleep(5000);
				driver.findElement(By.xpath("//span[text()='Create account']")).click();
				
			}
		}
}
}
