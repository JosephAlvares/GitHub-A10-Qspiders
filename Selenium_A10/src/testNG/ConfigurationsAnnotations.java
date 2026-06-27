package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationsAnnotations {
	
	@BeforeSuite
	public void beforesuite() {
		Reporter.log("Before suite is executed",true);
	}
	
	@AfterSuite
	public void aftersuite() {
		Reporter.log("After suite is executed",true);
	}
	
	@BeforeTest
	public void beforetest() {
		Reporter.log("Before Test is executed",true);
	}
	
	@AfterTest
	public void aftertest() {
		Reporter.log("After test is executed",true);
	}
	
	@BeforeClass
	public void beforeclass() {
		Reporter.log("Before class is executed",true);
	}
	@AfterClass
	public void afterclass() {
	Reporter.log("After class is executed",true);
		}
	
	@BeforeMethod
	public void beforemethod(){
	Reporter.log("Before Method is executed",true);
	}
	
	@AfterMethod
	public void aftermethod() {
		Reporter.log("After Method is executed",true);
	}
	
	@Test
	public void demo() {
		Reporter.log("Testscript is executed",true);
	}
	
	
}
	


