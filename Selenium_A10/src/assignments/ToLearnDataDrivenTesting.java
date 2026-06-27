package assignments;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnDataDrivenTesting {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		FileInputStream fis = new FileInputStream("./TestData/freshersworld.properties");
		//Step 2: create file specific object
		Properties prop = new Properties();
		//Step 3: Load the file
		prop.load(fis);
		//Step 4: Call the properties
		String url = prop.getProperty("url");
		System.out.println(url);
		
		String name = prop.getProperty("Name");
		System.out.println(name);
		String email = prop.getProperty("Email");
		System.out.println(email);
		String mobile = prop.getProperty("Mobile");
		System.out.println(mobile);
		String age = prop.getProperty("Age");
		System.out.println(age);
		
		driver.get(url);
		driver.findElement(By.xpath("//span[@id='reg_new_btn']")).click();
		
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys(mobile);
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		File f= new File("C://Users//HP//OneDrive//Desktop//JAVA_SQL Resume.docx");
		
		String absolutepath=f.getAbsolutePath();
		
		driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys(absolutepath);
	}

}
