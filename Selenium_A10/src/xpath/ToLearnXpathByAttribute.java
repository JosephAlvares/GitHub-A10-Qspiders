package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathByAttribute {
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		//driver.findElement(By.id("newsletter-email")).sendKeys("alvaresjoseph93@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='newsletter-email']")).sendKeys("alvaresjoseph93@gmail.com");
		driver.findElement(By.xpath("//input[@value='Subscribe']")).click();
		
	/*String text = driver.findElement(By.xpath("//div[@id='newsletter-result-block']")).getText();
	System.out.println(text);*/
		
		driver.close();
		
		
	}

}
