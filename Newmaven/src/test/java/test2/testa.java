package test2;



import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testa {	
	ChromeDriver driver;
	@BeforeSuite
	public void openbrowser() {
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");		
	}
	@BeforeMethod
	public void login() {
			driver.findElementByName("firstname").sendKeys("alekhya");
			driver.findElementByXPath("//input[contains(@name,'lastname')]").sendKeys("password");
			driver.findElementByXPath("//input[contains(@aria-label,'Mobile')] ").sendKeys("222222222");
			driver.findElementByXPath("//input[@autocomplete='new-password']").sendKeys("dddddd");	
	}
		@Test(priority=1)		 
		public void add() {
			
		System.out.println("need to enter more details");

	}
		@AfterSuite
		public void logout() {
			driver.close();
		}

}
