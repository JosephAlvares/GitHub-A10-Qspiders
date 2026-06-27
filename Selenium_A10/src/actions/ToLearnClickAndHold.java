package actions;

import java.time.Duration;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnClickAndHold {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://yonobusiness.sbi.bank.in/yonobusinesslogin");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		WebElement ele = driver.findElement(By.xpath("//*[@id='password']"));
		ele.sendKeys("1234");
		
		WebElement ele2 = driver.findElement(By.xpath("(//img[contains(@src,'assets/img/Revamp/')])[7]"));		
		Actions act= new Actions(driver);
				
		act.clickAndHold(ele2).perform();
		
	}
}
