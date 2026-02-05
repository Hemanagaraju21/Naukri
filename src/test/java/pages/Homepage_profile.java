package pages;

import java.time.Duration;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage_profile extends Basepage
{
 	Actions act;
	
	public Homepage_profile(WebDriver driver)
  {
	  super(driver);
	  this.act=new Actions(driver);
	   }
	
		 @FindBy(xpath="//a[normalize-space()='View profile']")WebElement profile;
		 /* 
		 * @FindBy(xpath="//em[contains(@class,'edit')]") WebElement edit;
		 * 
		 * @FindBy(xpath="//span[@class='chip-item active']") WebElement period;
		 * 
		 * @FindBy(xpath="//button[@id='saveBasicDetailsBtn']") WebElement Save;
		 */
	@FindBy(xpath="//div[@id='lazyResumeHead']//span[2]") WebElement rclick;
	@FindBy(xpath="//textarea[@id='resumeHeadlineTxt']") WebElement hupdate;
	@FindBy(xpath="//button[text()='Save']") WebElement rsave;
	@FindBy(xpath="//input[@class='dummyUpload typ-14Bold']") WebElement upload;
   	
	 public void profile() { 
		 WebDriverWait wait = new WebDriverWait(driver,	 Duration.ofSeconds(20));
	     wait.until(ExpectedConditions.visibilityOf(profile));
	  
	     act.moveToElement(profile).perform(); // Naukri menu hover fix
	     wait.until(ExpectedConditions.elementToBeClickable(profile)).click(); 
	  }
	 /* public void edit_button() { WebDriverWait wait = new WebDriverWait(driver,
	 * Duration.ofSeconds(20));
	 * 
	 * // 1️⃣ Wait until element present
	 * wait.until(ExpectedConditions.visibilityOf(edit));
	 * 
	 * // 2️⃣ Scroll element to CENTER (avoids header overlap)
	 * ((JavascriptExecutor)driver).executeScript(
	 * "window.scrollBy(0, arguments[0].getBoundingClientRect().top - 200);", edit);
	 * // 3️⃣ Small wait for page stabilization
	 * wait.until(ExpectedConditions.elementToBeClickable(edit));
	 * 
	 * try { // 4️⃣ Normal Click edit.click(); }
	 * catch(ElementClickInterceptedException e) { // 5️⃣ JS Fallback (Senior
	 * Automation Trick) ((JavascriptExecutor)driver)
	 * .executeScript("arguments[0].click();", edit); } } public void
	 * select_period() { period.click(); } public void save_button() { Save.click();
	 * }
	 */
  public void upload_resume()
 {
   upload.sendKeys(System.getProperty("user.dir")+"\\HemaNagaraju-Test Engineer.docx");
 }
  public void rhead_update()
  {
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
      wait.until(ExpectedConditions.elementToBeClickable(rclick));
      rclick.click();
      wait.until(ExpectedConditions.visibilityOf(hupdate)).click();
      act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).keyDown(Keys.ARROW_RIGHT).keyUp(Keys.ARROW_RIGHT).perform();
      hupdate.sendKeys(".");
      wait.until(ExpectedConditions.elementToBeClickable(rsave)).click();
 }
}