package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnSingleSelect {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/HP/OneDrive/Desktop/html%20files/single%20select%20dropdown.html");
		
		WebElement dropdown1 = driver.findElement(By.id("Countries"));
		Select sel=new Select(dropdown1);
		
		sel.selectByIndex(1);
		Thread.sleep(2000);
		sel.selectByValue("6");
		Thread.sleep(2000);
		sel.selectByVisibleText("USA");
		
		
	}

}
