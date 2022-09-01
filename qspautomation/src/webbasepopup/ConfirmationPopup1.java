package webbasepopup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("file:///C:/Users/Shree/Desktop/html/Confirmation.html");
	WebElement butn = driver.findElement(By.xpath("//button[@onclick='myFunction()']"));
	butn.click();
	Thread.sleep(2000);
	Alert al = driver.switchTo().alert();
	al.accept();
	Thread.sleep(2000);
	
	driver.navigate().refresh();
	WebElement butn1 = driver.findElement(By.xpath("//button[@onclick='myFunction()']"));
	Thread.sleep(2000);
	butn1.click();
	Alert a2 = driver.switchTo().alert();
	Thread.sleep(2000);
	a2.dismiss();
	}	
}

