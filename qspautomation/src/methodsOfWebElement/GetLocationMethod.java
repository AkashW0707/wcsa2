package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement loginButton = driver.findElement(By.name("login"));
		Point loc =loginButton.getLocation();
		int xaxis=loc.getX();
		int yaxis=loc.getY();
		System.out.println("The placement of login button is as follow");
		System.out.println("X-axis distance : "+xaxis);
		System.out.println("X-axis distance : "+yaxis);

	}

}
