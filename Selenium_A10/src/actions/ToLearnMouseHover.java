package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnMouseHover {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		
		Actions act= new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("(//a[@data-reactid='21'])[1]"));
		
		act.moveToElement(ele).perform();
		
	}

}
