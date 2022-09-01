package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag7invocationCount {
	
  @Test(invocationCount=5000)
  public void f()
  {
	  Reporter.log("create and delete user",true);
  }
}
