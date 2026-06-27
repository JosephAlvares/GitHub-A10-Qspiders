package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandlePetDiseaseAlerts {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://petdiseasealerts.org/");
		
		WebElement ele = driver.findElement(By.xpath("//a[normalize-space()='Go to maps']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", ele);
		
		
		ele.click();
		
		WebElement frame = driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]"));
		
		driver.switchTo().frame(frame);
		Thread.sleep(2000);
		driver.findElement(By.id("montana")).click();
		
		
	}

}
