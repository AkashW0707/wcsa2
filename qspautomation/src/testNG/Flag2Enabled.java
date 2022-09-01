package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2Enabled {
	//this test will not run itself....it is disabled!!
  @Test(enabled=false)
  public void method1() 
  {
	  Reporter.log("actitime valid login",true);
  }
  
  @Test
  public void method2() 
  {
	  Reporter.log("actitime Create user",true);
  }
  
  @Test
  public void method3() 
  {
	  Reporter.log("actitime Create Reports",true);
  }
  
  
  
}
