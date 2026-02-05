package pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage extends Basepage
{

	Properties propertey;
	  
	public Loginpage(WebDriver driver) throws IOException 
	{
		super(driver);
		propertey=new Properties();
		FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
	    propertey.load(fis);
		
	}
	
	@FindBy(xpath="//div[@class='nI-gNb-log-reg']//a") WebElement login;
	@FindBy(xpath="//input[@placeholder='Enter your active Email ID / Username']") WebElement username;
	@FindBy(xpath="//input[@placeholder='Enter your password']") WebElement password;
	@FindBy(xpath="//button[@type='submit']") WebElement submit;
	
	public void loginname()
	{
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    wait.until(ExpectedConditions.elementToBeClickable(login)).click();
	}

	public void username()
	{
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    wait.until(ExpectedConditions.visibilityOf(username))
	            .sendKeys(propertey.getProperty("username"));
	}

	public void password()
	{
	    password.sendKeys(propertey.getProperty("password"));
	}

	public void submit()
	{
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    wait.until(ExpectedConditions.elementToBeClickable(submit)).click();
	}
}