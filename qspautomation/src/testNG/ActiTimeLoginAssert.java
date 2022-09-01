package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class ActiTimeLoginAssert {
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://desktop-lt5ng4u/login.do");
	}
	@Test
	public void actiTime() 
	{
		String logInPageTitel = driver.getTitle();
		SoftAssert softassert=new SoftAssert();
		
		//SOFTASSERT..
		softassert.assertEquals(logInPageTitel, "actiTIME - Login");
		Reporter.log("login page titel is verified",true);
		
		//HARDASSERT..
		boolean statusOfUsernameTextBox = driver.findElement(By.name("username")).isDisplayed();
		Assert.assertEquals(statusOfUsernameTextBox, true);
		Reporter.log("username text box is displayed",true);
		driver.findElement(By.name("username")).sendKeys("Test Engineer");
		//---------------------------------------------------------------------
		
		//HARDASSERT..
		boolean statusOfPasswordTextBox = driver.findElement(By.name("pwd")).isDisplayed();
		Assert.assertEquals(statusOfPasswordTextBox, true);
		Reporter.log("password text box is displayed",true);
		driver.findElement(By.name("pwd")).sendKeys("te");
		//----------------------------------------------------------------------
		
		//HARDASSERT..
		boolean loginButton = driver.findElement(By.id("loginButton")).isDisplayed();
		Assert.assertEquals(loginButton, true);
		Reporter.log("login Button is displayed",true);
		driver.findElement(By.id("loginButton")).click();;
		
	}
	@AfterMethod
	public void logOut() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
}
