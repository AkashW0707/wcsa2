package OperationalMethodsOfDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Shree/Desktop/html/singleselectdropdown.html");
		WebElement singleselectdd = driver.findElement(By.id("menu"));
		Select sel = new Select(singleselectdd);
		List<WebElement> allops = sel.getOptions();
		for(int i=0;i<allops.size();i++)
		{
			WebElement op = allops.get(i);
			String text = op.getText();
			System.out.println(text);
			Thread.sleep(2000);
		}

	}

}
