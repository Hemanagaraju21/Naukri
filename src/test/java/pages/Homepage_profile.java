package pages;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage_profile extends Basepage
{
  //WebDriver driver;
	Actions act;
	
	public Homepage_profile(WebDriver driver)
  {
	  super(driver);
	  this.act=new Actions(driver);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }
	//WebDriverWait pwait=new WebDriverWait(driver, Duration.ofSeconds(15));
	@FindBy(xpath="//div[@class='view-profile-wrapper']//a")WebElement profile;
	@FindBy(xpath="//em[contains(@class,'icon edit')]") WebElement edit;
	@FindBy(xpath="/html[1]/body[1]/div[6]/div[11]/div[2]/div[1]/form[1]/div[6]/div[1]/div[2]/span[2]") WebElement period;
	@FindBy(xpath="//button[@id='saveBasicDetailsBtn']") WebElement Save;
	@FindBy(xpath="//div[@id='lazyResumeHead']//span[2]") WebElement rclick;
	@FindBy(xpath="//textarea[@id='resumeHeadlineTxt']") WebElement hupdate;
	@FindBy(xpath="//button[text()='Save']") WebElement rsave;
	@FindBy(xpath="//input[@class='dummyUpload typ-14Bold']") WebElement upload;
   	
	public void profile()
	{
		profile.click();
	}
   public void edit_button()
   {
	   edit.click();
   }
   public void select_period()
   {
	   period.click();
   }
   public void save_button()
   {
	   Save.click();
   }
  public void upload_resume()
 {
   upload.sendKeys(System.getProperty("user.dir")+"\\HemaNagaraju-Test Engineer.docx");
 }
 public void rhead_update()
 {
 rclick.click();
 hupdate.click();
 act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).keyDown(Keys.ARROW_RIGHT).keyUp(Keys.ARROW_RIGHT).perform();
 hupdate.sendKeys(".");
 rsave.click();
 }
}