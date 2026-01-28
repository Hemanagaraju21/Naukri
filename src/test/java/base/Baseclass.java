package base;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Baseclass 
{
	public WebDriver driver;
	@Parameters("browser")
	@BeforeClass
    public void setup(String browser_m)
  {
	if(browser_m.equalsIgnoreCase("chrome")) {	
    driver = new ChromeDriver();}
	else if(browser_m.equalsIgnoreCase("edge")) {
		driver = new EdgeDriver();}
	else if(browser_m.equalsIgnoreCase("firefox")) {
		driver = new FirefoxDriver();}
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
