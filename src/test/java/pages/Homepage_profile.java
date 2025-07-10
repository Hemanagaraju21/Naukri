package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage_profile extends Basepage
{
  WebDriver driver;
	public Homepage_profile(WebDriver driver)
  {
	  super(driver);
  }
	@FindBy(xpath="//a[normalize-space()='View profile']") WebElement profile;
	@FindBy(xpath="//em[contains(@class,'icon edit')]") WebElement edit;
	@FindBy(xpath="/html[1]/body[1]/div[6]/div[11]/div[2]/div[1]/form[1]/div[6]/div[1]/div[2]/span[2]") WebElement period;
	@FindBy(xpath="//button[@id='saveBasicDetailsBtn']") WebElement Save;
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
}