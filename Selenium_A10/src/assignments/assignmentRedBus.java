package assignments;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignmentRedBus {
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		// to launch redbus application
		driver.get("https://www.redbus.in/");
		
		//to launch redbus application in maximize mode
		driver.manage().window().maximize();
		
		
		//verify whether welcome page is displayed or not
		String title = driver.getTitle();
		
		System.out.println(title);
		
		if(title.equals("Bus Booking Online and Train Tickets at Lowest Price - redBus")) {
			
			System.out.println("Webpage is displayed");
		}
			
		/*String code = driver.getPageSource();
				System.out.println(code);*/
		
		//capture Height and width of an application
		Dimension size = driver.manage().window().getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		
		//capture position of the application
		Point position = driver.manage().window().getPosition();
		System.out.println(position.getX());
		System.out.println(position.getY());
		
		//close the application
		driver.close();
	}

}
