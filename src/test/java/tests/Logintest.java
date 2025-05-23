package tests;

import org.testng.annotations.Test;
import base.Baseclass;
import pages.Homepage_profile;
import pages.Loginpage;

public class Logintest extends Baseclass
{
       
 @Test
 public void naukrilogin() throws InterruptedException
 {
	 Loginpage lp=new Loginpage(driver);
	 lp.loginname();
  lp.username();
  lp.password();
  lp.submit();
  }
@Test(priority=2)
public void profileupdate()
{
Homepage_profile hp=new Homepage_profile(driver);
hp.profile();
hp.edit_button();
hp.select_period();
hp.save_button();
 }
}
