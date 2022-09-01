package methodOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetBrowserPosition1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Dimension targetSize = new Dimension(500, 500);
		driver.manage().window().setSize(targetSize);
		Point targetPosition = new Point(300, 300);
		driver.manage().window().setPosition(targetPosition);
		
		

	}

}
