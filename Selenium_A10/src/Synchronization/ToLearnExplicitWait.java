package Synchronization;

import java.time.Duration;
//import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnExplicitWait {
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//String time = LocalDateTime.now().toString().replace(":", "-");
		
		driver.get("https://shoppersstack.com/products_page/51");
		WebElement checkTextBox = driver.findElement(By.id("Check Delivery"));
		checkTextBox.sendKeys("123456");
		WebElement button = driver.findElement(By.id("Check"));
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(button));
		button.click();
		
		driver.quit();
	}

}
