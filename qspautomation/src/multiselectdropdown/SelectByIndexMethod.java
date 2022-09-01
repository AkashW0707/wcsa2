package multiselectdropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndexMethod {

	public static void main(String[] args) {
		//using for each loop
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Shree/Desktop/html/multiselectdropdown.html");
		WebElement multiselectdd = driver.findElement(By.id("menu"));
		Select op = new Select(multiselectdd);
		for(int i=0;i<=4;i++)
		{
			op.selectByIndex(i);
		}
	}

}
