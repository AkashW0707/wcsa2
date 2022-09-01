package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 //driver.get("https://opensource-demo.orangehrmlive.com/");
		 driver.manage().window().maximize();
		 
		 //tagName() Locator..
		 //driver.findElement(By.tagName("input")).sendKeys("admin");
		 //driver.findElement(By.tagName("input")).sendKeys("manager");
		
		 //id() Locator
		 //driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 //driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		 //driver.findElement(By.id("btnLogin")).click();
		 //driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		 //driver.findElement(By.id("searchSystemUser_userName")).sendKeys("Aaliyah.Haq");
		 
		 //name() Locator.. [in name() Locator use name attribute and its attribute_value]
		 //driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		 //driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		 //driver.findElement(By.name("Submit")).click();
		 
		 //className() Locator..
		 //driver.get("https://www.flipkart.com");
		 //Thread.sleep(4000);
		 //driver.findElement(By.className("_2IX_2- VJZDxU")).sendKeys("Admin"); By continuing, you agree to Flipkart's
		 //driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		 
		 //linkText() Locator..
		 //driver.get("https://www.flipkart.com");
		 //Thread.sleep(2000);
		 //driver.findElement(By.linkText("New to Flipkart? Create an account")).click();
		 
		 //partialLinkText() Locator..
		 //driver.get("https://www.flipkart.com");
		 //hread.sleep(2000);
		 //driver.findElement(By.partialLinkText("Flipkart?")).click();
		 
		 //cssSelector..
		 
		 
		 
		 	 
	}

}
