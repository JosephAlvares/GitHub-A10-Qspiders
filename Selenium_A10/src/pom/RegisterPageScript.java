package pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class RegisterPageScript {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("./TestData/Assignment.properties");
		//Step 2: create file specific object
		Properties prop = new Properties();
		//Step 3: Load the file
		prop.load(fis);
		fis.close();
		String url = prop.getProperty("URL");
		String FN = prop.getProperty("FN");
		String LN = prop.getProperty("LN");
		String EM = prop.getProperty("EM");
		String pwd = prop.getProperty("PWD");
		String cnmpwd = prop.getProperty("CNMpwd");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String timestamp = LocalDateTime.now().toString().replace(":", ".");
		
		driver.get(url);
		
		
		welcomePage wp= new welcomePage(driver);
		wp.getRegLink().click();
		
		RegisterPageAssignment rp=new RegisterPageAssignment(driver);
		rp.getGmmale().click();
		rp.getFirstName().sendKeys(FN);
		rp.getLastName().sendKeys(LN);
		rp.getEmail().sendKeys(EM);
		rp.getPassword().sendKeys(pwd);
		rp.getConfirmPassword().sendKeys(cnmpwd);
		rp.getRegisterbttn().click();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File perm=new File("./screenshots/"+timestamp+".png");
		FileHandler.copy(temp, perm);
		
		driver.close();
		
		
	}

}
