package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTestngClass {
  @Test
  public void method1() 
  {
	  Reporter.log("method 1",true);
  }
  @Test
  public void method2() 
  {
	  Reporter.log("method 2",true);
  }
  @Test
  public void method3() 
  {
	  int a=9;
	  int b=0;
	  int res=a/b;
	  System.out.println(res);
	  Reporter.log("method 3",true);
  }
  @Test
  public void method4() 
  {
	  Reporter.log("method 4",true);
  }
}
