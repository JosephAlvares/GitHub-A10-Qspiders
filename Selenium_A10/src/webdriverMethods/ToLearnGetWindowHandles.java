package webdriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetWindowHandles {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/");
		Thread.sleep(40000);
		
		driver.findElement(By.id("compare")).click();
		Set<String> allWinids=driver.getWindowHandles();
		for(String id:allWinids) {
			System.out.println(id);
		}
	}

}
