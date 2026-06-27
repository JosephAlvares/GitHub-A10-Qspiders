package assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentHdfc {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.hdfc.bank.in/");
		
		driver.findElement(By.xpath("(//button[text()='Login'])[1]")).click();
		
		driver.findElement(By.xpath("(//span[text()='NetBanking'])[1]")).click();
		
		Set<String> allWinIds = driver.getWindowHandles();
		System.out.println("all window ids:"+allWinIds);
		System.out.println("current window handle id: "+driver.getWindowHandle());
		
		String currentWindHan = driver.getWindowHandle();
		
		for(String id : allWinIds) 
			
		{			
			if(!id.equals(currentWindHan)) {
				driver.switchTo().window(id);
				
				System.out.println("Switched to id: "+id);
				String url = driver.getCurrentUrl();
				System.out.println("Current URL: "+url);
				Thread.sleep(5000);
				driver.findElement(By.xpath("//input[@id='username']")).sendKeys("123456789");
				driver.findElement(By.xpath("//input[@aria-label='Enter Password']")).sendKeys("@lvaresjoseph93");
				Thread.sleep(10000);
				break;
			}
		}
	driver.quit();
			
	}

}
