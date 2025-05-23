package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage extends Basepage
{

	WebDriver driver;
	public Loginpage(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//a[@id='login_Layer']") WebElement login;
	@FindBy(xpath="//input[@placeholder='Enter your active Email ID / Username']") WebElement username;
	@FindBy(xpath="//input[@placeholder='Enter your password']") WebElement password;
	@FindBy(xpath="//button[@type='submit']") WebElement submit;
	
	public void loginname()
	{
		login.click();
	}
	public void username()
	{
		username.sendKeys("naga.sntv@gmail.com");
	}
	public void password()
	{
		password.sendKeys("Hema@3975");
		
	}
    public void submit() throws InterruptedException
    {
         submit.click();
         Thread.sleep(10);  
    }
}