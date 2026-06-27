package Synchronization;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnImplicitWait {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		String timestamp = LocalDateTime.now().toString().replace(":", ".");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("https://shoppersstack.com/");
		
		driver.findElement(By.xpath("(//span[contains(text(),'iphone')])[1]")).click();
		
		driver.findElement(By.xpath("//input[@id='Check Delivery']")).sendKeys("123456");
		
		WebElement button = driver.findElement(By.xpath("//button[contains(@id,'Check')]"));
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(button));
		button.click();
		
		WebElement ele = driver.findElement(By.xpath("//input[@id='Check Delivery']"));
		File temp = ele.getScreenshotAs(OutputType.FILE);
		File perm=new File("./screenshots/"+timestamp+".png");
		FileHandler.copy(temp, perm);
		//driver.quit();
		
	}

}
