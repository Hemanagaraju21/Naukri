package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class Baseclass 
{
	public WebDriver driver;
	@BeforeClass
    public void setup()
  {
	
    driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.naukri.com/");
	driver.manage().window().maximize();
	
}
   @AfterClass
	public void teardown() throws InterruptedException
{
	   Thread.sleep(10);
	   driver.quit();	
}
}
