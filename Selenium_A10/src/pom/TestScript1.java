package pom;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript1 {
	public static void main(String[] args) throws IOException {
		
		
				//Step 1: Store the location of file
				FileInputStream fis = new FileInputStream("./TestData/commondata.properties");
				//Step 2: create file specific object
				Properties prop = new Properties();
				//Step 3: Load the file
				prop.load(fis);
				//Step 4:call the properties
				String url = prop.getProperty("url");
				String email = prop.getProperty("email");
				String pwd = prop.getProperty("password");
				
				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
						
				driver.get(url);
								
				welcomePage wp= new welcomePage(driver);
				wp.getLoginLink().click();
				
				loginPage lp = new loginPage(driver);
				lp.getEmailTxtField().sendKeys(email);
				lp.getPassTxtField().sendKeys(pwd);
				lp.getLogInButton().click();
				
				
				
				
				
		
	}

}
