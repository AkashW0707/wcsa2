package screenshotOfWebpage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotOfWebElement {
	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("https://www.instagram.com/accounts/login/");
	WebElement element = driver.findElement(By.cssSelector("div[role='button']"));
	File scr = element.getScreenshotAs(OutputType.FILE);
	File dest=new File("./screenshots/ss6.jpg");
	Files.copy(scr, dest);
	
	

}
}