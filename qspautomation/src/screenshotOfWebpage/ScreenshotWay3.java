package screenshotOfWebpage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

//get the ss using WebDriver Interface(downcasting)
public class ScreenshotWay3 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 RemoteWebDriver rwd = (RemoteWebDriver)driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.instagram.com/accounts/login/");
		 
		File src = rwd.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/ss3.png");
		Files.copy(src, dest);
		 

	}

}
