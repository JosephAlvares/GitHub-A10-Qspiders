package windowsMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSetSize {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		
		// to open the browser
		driver.get("https://www.flipkart.com/");
		
		//set dimensions of the window		
		driver.manage().window().setSize(new Dimension(700, 500));
		
		 
		
	}
}
