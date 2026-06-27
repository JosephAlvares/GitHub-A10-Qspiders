package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToCaptureAllOptions {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/HP/OneDrive/Desktop/html%20files/single%20select%20dropdown.html");
		
		WebElement dropdown = driver.findElement(By.id("Countries"));
		Select sel=new Select(dropdown);
		List<WebElement> alloptions = sel.getOptions();
		for(WebElement ele:alloptions) {
			System.out.println(ele.getText());
		}
		
		
	}

}
