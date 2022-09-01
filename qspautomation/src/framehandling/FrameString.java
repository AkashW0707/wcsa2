package framehandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameString {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/Shree/Desktop/username.html");
		driver.findElement(By.id("un")).sendKeys("admin");
		driver.switchTo().frame("frnm");//frame(string name or id)
		Thread.sleep(4000);
		driver.findElement(By.id("pwd")).sendKeys("manager");
	}

}
