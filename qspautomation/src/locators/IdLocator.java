package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Shree/Desktop/html/loginPage.html");
		driver.findElement(By.id("i1")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.id("i2")).sendKeys("manager");


	}

}
