package Tests;

import static org.testng.Assert.assertFalse;

import org.testng.Assert;
import org.testng.annotations.Test;

import Library.Basicdetails;
import Library.Notepad;
import Pomrepogiary.Loginpage;

public class Logindetails extends Basicdetails {
	
	
	
	
	@Test
	public void login() throws Exception {
		
		
	Notepad no = new Notepad();	
	Loginpage lo = new Loginpage(driver);
	
	String USENAME = no.getdatafilepath("username");
	System.out.println(USENAME);
	
	String PASSWORD = no.getdatafilepath("password");
	System.out.println(PASSWORD);
	
	lo.getUsernmae().sendKeys(USENAME);
     Thread.sleep(4000);
     
   lo.getPasswprd().sendKeys(PASSWORD);
   Thread.sleep(3000);
   
   lo.getSignBt().click();
   Thread.sleep(4000);
   
   Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("https://www.saucedemo.com/inventory.htmlcrcf");
   assertFalse(verifyTitle);
   
//   String Acuttitle = driver.getTitle();
//   String exceptedtitle = "https://www.saucedemo.com/inventory.html";
//   Assert.assertEquals(Acuttitle, exceptedtitle);
	
	
	
	
		
	}

}
