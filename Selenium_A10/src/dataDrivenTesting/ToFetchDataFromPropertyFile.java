package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFetchDataFromPropertyFile {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Step 1: Store the location of file
		FileInputStream fis = new FileInputStream("./TestData/commondata.properties");
		//Step 2: create file specific object
		Properties prop = new Properties();
		//Step 3: Load the file
		prop.load(fis);
		//Step 4:call the properties
		String url = prop.getProperty("url");
		System.out.println(url);
		
		String email = prop.getProperty("email");
		System.out.println(email);
		
		String password = prop.getProperty("password");
		System.out.println(password);
		
		//Test Script
		
		driver.get(url);
		
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		
		driver.findElement(By.id("Email")).sendKeys(email);
		
		driver.findElement(By.id("Password")).sendKeys(password);
	}

}
