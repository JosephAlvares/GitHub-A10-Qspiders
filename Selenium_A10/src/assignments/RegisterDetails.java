package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterDetails {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("ico-register")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Joseph");
		driver.findElement(By.id("LastName")).sendKeys("Alvares");
		driver.findElement(By.id("Email")).sendKeys("alvaresjoseph93@gmail.com");
		
		driver.findElement(By.id("Password")).sendKeys("@lvaresjoseph93");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("@lvaresjoseph93");
		
		
		
	}

}
