package webdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetCurrentUrl {
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.myntra.com/");
		//https://www.myntra.com/
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		if(url.equals("https://www.myntra.com/")) {
			System.out.println("Welcome Page is displayed");
			}
		else {
			System.out.println("Welcome page is not displayed");
		}
		
	}

}*/

public class ToLearnGetCurrentUrl {
	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//https://www.facebook.com/
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		if (url.equals("https://www.facebook.com/"))
		{
			System.out.println("Welcome Page is displayed");
			
		}
		else
		{
			System.out.println("Welcome page is not displayed");
		}
	}
}
