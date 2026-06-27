package practiceAssignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignXpathFlipkart {
	
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//span[contains(@class,'b3wTlE')]")).click();
	
	driver.findElement(By.xpath("(//input[contains(@placeholder,'Search')])[1]")).sendKeys("mobile",Keys.ENTER);
	
	driver.findElement(By.xpath("//div[contains(@data-id,'MOBHHHBT766ZBUSF')]")).click();
	
	Set<String> allWinIds = driver.getWindowHandles();
	System.out.println("All Window Handles :"+allWinIds);
	
	String CurrWinId = driver.getWindowHandle();
	System.out.println("Current Window Handle :"+CurrWinId);
	
	for(String id:allWinIds) 
	{
		if(!id.equals(CurrWinId)) 
		{
		driver.switchTo().window(id);
		System.out.println("Switched Handle : "+id);
		String url = driver.getCurrentUrl();
		
		System.out.println("Current Url :"+url);
		
		Thread.sleep(3000);
		
		WebElement Mobile = driver.findElement(By.xpath("//h1"));
		System.out.println("Mobile Name : "+Mobile.getText());
		
		WebElement bankOffer = driver.findElement(By.xpath("(//div[contains(@id,'slot-list-container')]//*[contains(text(),'%')])[1]"));
		
		System.out.println("Bank Offer Percentage : "+bankOffer.getText());
		}
	}
	
	driver.quit();
	
}

}
