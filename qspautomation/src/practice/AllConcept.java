package practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //it is use to open a chrome browser..
		driver.manage().window().maximize();
		/*driver.get("https://www.google.com");*/ //get() method are use for open a web-application..
		driver.get("https://www.flipkart.com/");
		String titleOfTheWebpage = driver.getTitle();//getTitle() method are use for get the current web-page title..
		System.out.println(titleOfTheWebpage);
		//driver.get("https://www.selenium.dev/");
		String currentUrl = driver.getCurrentUrl();//getCurrentUrl() method are use for get the URL of current web-page..   
		System.out.println(currentUrl);
		//String pageSourceCode = driver.getPageSource();//getPageSource() .method are use for get the current web-application html code..
		//System.out.println(pageSourceCode);
		driver.get("https://www.google.com");
		driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
		driver.navigate().to("https://www.google.com");
		driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Dimension targetSize = new Dimension(200, 500);
		driver.manage().window().setSize(targetSize);
		Point targetPosition = new Point(500, 200);
		driver.manage().window().setPosition(targetPosition);
	}

}
