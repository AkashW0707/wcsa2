package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("a.k.k.i.0707");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("akki@777");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class*=' L3NKy']")).click();
		driver.findElement(By.cssSelector("button[class*='yWX7d']")).click();
	}

}
