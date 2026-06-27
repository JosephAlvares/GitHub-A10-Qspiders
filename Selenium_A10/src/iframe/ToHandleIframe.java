package iframe;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleIframe {
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.rediff.com/");
				
		driver.switchTo().frame("moneyiframe");
		driver.findElement(By.xpath("//span[@id='bseindex']")).click();
		
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Sign in")).click();
		
	}

}
