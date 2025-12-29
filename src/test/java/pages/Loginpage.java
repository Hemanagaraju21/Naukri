package pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends Basepage
{

	WebDriver driver;
	//Properties propertey;
	  
	public Loginpage(WebDriver driver) throws IOException 
	{
		super(driver);
		//propertey=new Properties();
		//FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\config.properties");
	    //propertey.load(fis);
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
		
		username.sendKeys("hemanagaraju.d@gmail.com");
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