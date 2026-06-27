package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpathAssignment {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/");
		Thread.sleep(30000);
		String text = driver.findElement(By.xpath("(//span[text()='iphone']/..//span[contains(text(),'₹')])[1]")).getText();
		System.out.println("RS "+text);
		
		driver.findElement(By.xpath("//span[text()='iphone']/../..//button[@id='addToCart']")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
