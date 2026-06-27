package assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentEnterAllDetails {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		
		Set<String> allWinIds = driver.getWindowHandles();
		for(String Id:allWinIds) {
			driver.switchTo().window(Id);
			String url = driver.getCurrentUrl();
			System.out.println("Current url:"+url);
			if(url.equals("https://www.facebook.com/nopCommerce")) {
				Thread.sleep(5000);
				driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("alvaresjoseph93@gmail.com");
				driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("@lvaresjoseph93");
			}
		}
		
		//driver.findElement(By.xpath("//a[@href='http://www.facebook.com/nopCommerce']")).click();
		
		

	}

}
