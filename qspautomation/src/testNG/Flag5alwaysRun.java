package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag5alwaysRun {
  @Test
  public void actiTimeLogin() 
  {
	  int i=9/0;
	  System.out.println(i);
	  Reporter.log("Login Successful",true);
  }
  
  @Test(dependsOnMethods="actiTimeLogin")
  public void actiTimeCreateUser() 
  {
	  Reporter.log("Create user",true);
  }
  
  @Test(dependsOnMethods="actiTimeCreateUser",alwaysRun=true)
  public void actiTimeLogout() 
  {
	  Reporter.log("Logout Successful",true);
  }
}
