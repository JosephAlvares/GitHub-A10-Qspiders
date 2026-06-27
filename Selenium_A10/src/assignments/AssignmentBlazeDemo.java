package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentBlazeDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		System.out.println("hello github");
		
		/*driver.manage().window().maximize();
		driver.get("https://blazedemo.com/");
		
		driver.findElement(By.xpath("//input[contains(@value,'Find Flights')]")).click();
		
		WebElement price = driver.findElement(By.xpath("//td[text()='Aer Lingus']/following-sibling::td[3]"));
		
		System.out.println("Lowest Price of Flight : "+price.getText());
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//td[text()='Aer Lingus']/preceding-sibling::td[2]")).click();
		
		//driver.close();*/
	}

}
