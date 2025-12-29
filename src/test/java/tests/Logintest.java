package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import base.Baseclass;
import pages.Homepage_profile;
import pages.Loginpage;


public class Logintest extends Baseclass
{
       
 @Test(priority=1)
 public void naukrilogin() throws InterruptedException, IOException
 {
	 Loginpage lp=new Loginpage(driver);
	 lp.loginname();
  lp.username();
  lp.password();
  lp.submit();
  }
@Test(priority=2)
public void profileupdate() throws InterruptedException
{
Homepage_profile hp=new Homepage_profile(driver);
hp.profile();
Thread.sleep(5000);
hp.edit_button();
Thread.sleep(5000);
hp.select_period();
Thread.sleep(5000);
hp.save_button();
Thread.sleep(5000);
hp.rhead_update();
Thread.sleep(5000);
hp.upload_resume();
}
}
