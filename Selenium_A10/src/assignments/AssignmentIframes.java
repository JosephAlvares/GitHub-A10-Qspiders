package assignments;

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

public class AssignmentIframes {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String timestamp = LocalDateTime.now().toString().replace(":", ".");
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		//Enter "Selenium" inside textbox
		driver.switchTo().frame("singleframe");
		
		WebElement ele = driver.findElement(By.xpath("//input[@type='text']"));
		
		ele.sendKeys("Selenium");
		File temp = ele.getScreenshotAs(OutputType.FILE);
		File perm=new File("./screenshots/"+timestamp+".png");
		FileHandler.copy(temp, perm);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[contains(.,'Iframe with in')]")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("//iframe[@src='MultipleFrames.html']");
		Thread.sleep(2000);
		driver.switchTo().frame("//iframe[@src='SingleFrame.html']");
		
		WebElement ele2 = driver.findElement(By.xpath("//input[@type='text']"));
		
		ele2.sendKeys("Automation");
		File temp1=ele2.getScreenshotAs(OutputType.FILE);
		File perm2=new File("./screenshots/"+timestamp+".png");
		FileHandler.copy(temp1, perm2);
		
		
		
		
		
	}

}
