package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetText {
	
	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.xpath("//input[@id='_r_2_']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[contains(text(),'Log in')])[2]")).click();
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//span[contains(text(),'The email address or mobile number')]")).getText();
		System.out.println(text);
		driver.close();
	}

}
