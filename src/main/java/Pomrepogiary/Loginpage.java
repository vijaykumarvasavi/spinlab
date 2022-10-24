package Pomrepogiary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	
	
	public  Loginpage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);	
	}
	
	
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement usernmae;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement passwprd;
	
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement signBt;

	public WebElement getUsernmae() {
		return usernmae;
	}

	public WebElement getPasswprd() {
		return passwprd;
	}

	public WebElement getSignBt() {
		return signBt;
	}
	
	
	
	

}
