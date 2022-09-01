package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1Description {
  @Test(description="this test is used to perform a valid login")
  public void validActiTimeTest()
  {
	  Reporter.log("valid login is performed",true);
  }
  @Test(description= "this test is to perform a invalid login")
  public void invalidActiTimeTest()
  {
	  Reporter.log("invalid login is performed",true);
  }
}
