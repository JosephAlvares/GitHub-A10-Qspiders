package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathByAxis {
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/OneDrive/Desktop/Movie_Table.html");
		
		WebElement collection1 = driver.findElement(By.xpath("//td[text()='DHURANDHAR']/following-sibling::td[2]"));
		
		System.out.println("Collection of Dhurandhar is :"+collection1.getText());
		
		WebElement collection2 = driver.findElement(By.xpath("//td[text()='TOXIC']/following-sibling::td[2]"));
		
		System.out.println("Collection of Toxic is :"+collection2.getText());
		
		WebElement collection3 = driver.findElement(By.xpath("//td[text()='YOUTH']/following-sibling::td[2]"));
		
		System.out.println("Collection of Youth is :"+collection3.getText());
		
		WebElement imdb1 = driver.findElement(By.xpath("//td[text()='DHURANDHAR']/following-sibling::td[1]"));
		
		System.out.println("IMDB of Dhurandhar is :"+imdb1.getText());
		
		WebElement imdb2 = driver.findElement(By.xpath("//td[text()='TOXIC']/following-sibling::td[1]"));
		
		System.out.println("IMDB of Toxic is :"+imdb2.getText());
		
		WebElement imdb3 = driver.findElement(By.xpath("//td[text()='YOUTH']/following-sibling::td[1]"));
		
		System.out.println("IMDB of Youth is :"+imdb3.getText());
		
	}

}
