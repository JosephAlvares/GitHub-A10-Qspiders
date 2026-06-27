package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetRect {
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		Rectangle values = driver.findElement(By.xpath("//input[@type='submit']")).getRect();
		System.out.println(values.getHeight());
		System.out.println(values.getWidth());
		System.out.println(values.getX());
		System.out.println(values.getY());
	
	}

}
