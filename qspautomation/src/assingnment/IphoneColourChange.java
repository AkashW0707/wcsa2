package assingnment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IphoneColourChange {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.flipkart.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone 12");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::a[@class='_1fQZEK'])[1]")).click();

		String parentTab = driver.getWindowHandle();
		System.out.println(parentTab);

		Set<String> childTab = driver.getWindowHandles();
		for (String tab:childTab)
		{

			if (!parentTab.equals(tab)) 
			{
				driver.switchTo().window(tab);
			}
		}

		driver.findElement(By.xpath("(//li[@class='_3V2wfe']/descendant::div[@class='_2C41yO'])[3]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//li[@id='swatch-2-storage']")).click();
		driver.findElement(By.xpath("//input[@class='_36yFo0']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='_36yFo0']")).sendKeys("411033");
		driver.findElement(By.xpath("//span[@class='_2P_LDn']")).click();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		Thread.sleep(3000);


		driver.findElement(By.xpath("//div[@class='_10vWcL td-FUv WDiNrH']/descendant::div[.='Remove']")).click();


	}
}
