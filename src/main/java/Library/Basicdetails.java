package Library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class Basicdetails {
	
	public WebDriver driver;
	Notepad no = new Notepad();
	
	@BeforeSuite
	public void openthedata() {
		System.out.println("open data");
	}
	
	@BeforeClass
	public void luncherbrowser() throws Exception {
	System.out.println("open the browser");
	
		
	String BROWSER = no.getdatafilepath("Browser");
	System.out.println("BROWSER");
		
	if(BROWSER.equalsIgnoreCase("Chrome"))
	{
	 driver = new ChromeDriver();	
	}
	else if (BROWSER.equalsIgnoreCase("firefox"))
	{
	driver = new FirefoxDriver();	
	}
	
	else if(BROWSER.equalsIgnoreCase("Edge")) {	
	driver = new EdgeDriver();
	}
	else {
		System.out.println("invalid browser");
	}
	
	  driver.get("https://www.saucedemo.com");
	  
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	}
		
	
	
	@AfterClass
	public void closethebrowser() {
		System.out.println("close the browser");
		driver.quit();
	}
	@AfterSuite
	public void closethedata() {
		System.out.println("close data");
	}

}
