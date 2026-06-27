package windowsMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetPosition {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		Point Position = driver.manage().window().getPosition();
		System.out.println(Position.getX());
		System.out.println(Position.getY());
		
		driver.quit();
	}
}
