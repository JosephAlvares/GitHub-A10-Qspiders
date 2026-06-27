package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentAbhiBus {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[contains(text(),'Buses')]")).click();
		driver.findElement(By.xpath("//input[contains(@placeholder,'Leaving From')]")).sendKeys("Mangalore");
		driver.findElement(By.xpath("//li[@class='collection-item auto-complete-list-item ']//*[contains(text(), 'Mangalore')]")).click();
		driver.findElement(By.xpath("//input[contains(@placeholder,'Going To')]")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[@class='collection-item auto-complete-list-item ']//*[contains(text(), 'Bangalore')]")).click();
			
		driver.findElement(By.xpath("//span[contains(text(),'Search')]")).click();
		Thread.sleep(5000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		//Bus Names
		List<WebElement> busNames = driver.findElements(By.xpath("//div[contains(@class,'operator-info')]//h5"));
		//System.out.println("Total buses: "+busNames.size());
		for(WebElement busElement: busNames) {
			String busName = busElement.getText();
			System.out.println("bus name: "+busName);
		}
		//Price
		List<WebElement> busFares = driver.findElements(By.xpath("//div[contains(@id,'service-operator-fare')]//span[contains(@class,'fare text')]"));
		
		for(WebElement fareElement: busFares) {
			String busFare = fareElement.getText();
			System.out.println("Bus Fare: "+busFare);
		}
		
		//Departure and Arrival Time
		
		List<WebElement> departureTime = driver.findElements(By.xpath("//div[contains(@class,'operator-info col')]/..//span[contains(@class,'departure-time text-neutral-500')]"));
		
		for(WebElement JourneyStart:departureTime) {
			
			String journeyTime = JourneyStart.getText();
			System.out.println("Departure Time: "+journeyTime);
			
		}
		
		List<WebElement> arrivalTime = driver.findElements(By.xpath("//div[contains(@class,'operator-info col')]/..//span[contains(@class,'arrival-time text-neutral-500')]"));
		
		for(WebElement JourneyEnd:arrivalTime) {
			
			String arrival = JourneyEnd.getText();
			System.out.println("Arrival Time: "+arrival);
			
		}
		//Seat Availability
		
List<WebElement> noOfSeats = driver.findElements(By.xpath("//button[contains(@class,'btn bus-info-btn')]/..//div[contains(@class,'col')]"));
		
		for(WebElement seatAvail:noOfSeats) {
			
			String seat = seatAvail.getText();
			System.out.println("Seat Availability: "+seat);
			
		}
		
		driver.close();		
				
	}
}
