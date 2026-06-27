package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToChildWindowPopups {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.flipkart.com/");
		
		Set<String> allwinids = driver.getWindowHandles();
		for(String ids:allwinids) {
			driver.switchTo().window(ids);
		}
		driver.findElement(By.xpath("//a[normalize-space()='facebook']")).click();
	}

}
