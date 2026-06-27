package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignmentDropdown {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//*[contains(text(),'UI Testing Concepts')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'Dropdown')]")).click();
		
		WebElement code = driver.findElement(By.id("country_code"));
		Select sel=new Select(code);
		//single select country code
		sel.selectByIndex(3);
		Thread.sleep(2000);
		sel.selectByValue("+92");
		Thread.sleep(2000);
		sel.selectByVisibleText("+44");
		
		// single select country
		WebElement country = driver.findElement(By.id("select3"));
		Select sel2=new Select(country);
		
		sel2.selectByIndex(7);
		
		//single select state
		WebElement state = driver.findElement(By.id("select5"));
		Select sel3=new Select(state);
		
		sel3.selectByValue("Karnataka");
		
		/*single select city
		WebElement city = driver.findElement(By.xpath("//label[contains(.,'City')]"));
		Select sel4=new Select(city);
		
		sel4.selectByIndex(2);*/
		
		//multiple select
		driver.findElement(By.xpath("//a[contains(.,'Multi Select')]")).click();
		
		WebElement multiple = driver.findElement(By.id("select-multiple-native"));
		Select sel5=new Select(multiple);
		
		sel5.selectByIndex(2);
		Thread.sleep(2000);
		sel5.selectByValue("Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops");
		Thread.sleep(2000);
		sel5.selectByVisibleText("Mens Casual Slim Fit...");
		
		Thread.sleep(2000);
		sel5.deselectAll();
		
		//disabled
		
		driver.findElement(By.xpath("//a[contains(.,'Disabled')]")).click();
		//Inspect Element
		WebElement ele = driver.findElement(By.id("SelectCountry"));
		//Upcasting
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//Call Method
		js.executeScript("arguments[0].removeAttribute('disabled')", ele);
		//single select country
		WebElement country1 = driver.findElement(By.id("SelectCountry"));
		Select sel6=new Select(country1);
		sel6.selectByIndex(1);
		
		
		
	}

}
