package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-lt5ng4u/login.do");//actitime login
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("admin");
		//driver.findElement(By.name("pwd")).sendKeys("manager");
		//driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.partialLinkText("License ")).click();
		driver.quit();
		

	}

}
