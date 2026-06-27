package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathUsingContains {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		String text = driver.findElement(By.xpath("//div[contains(text(),'Copyright')]")).getText();
		
		System.out.println(text);
		/*driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[contains(@title,'Search')])[1]")).sendKeys("mobile");*/
	}

}
