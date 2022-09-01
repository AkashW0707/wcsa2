package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calculator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@onclick='r(1)'and .='1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@onclick='r(0)'and .='0']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@onclick='r(0)'and .='0']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@onclick='r('+')' or .='+']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@onclick='r(2)'and .='2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@onclick='r(0)'and .='0']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@onclick='r(0)'and .='0']")).click();
		Thread.sleep(1000);
		String result = driver.findElement(By.xpath("//div[@id='sciOutPut']")).getText();
		System.out.println("100+200 =" +result);
		driver.findElement(By.xpath("//span[@onclick='r(4)'and .='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@onclick='r(0)'and .='0']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@onclick='r(0)'and .='0']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@onclick='r('-')' or .='-']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@onclick='r(2)'and .='2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@onclick='r(0)'and .='0']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@onclick='r(0)'and .='0']")).click();
		Thread.sleep(1000);
		String result1 = driver.findElement(By.xpath("//div[@id='sciOutPut']")).getText();
		System.out.println("400-200 =" +result1);
		driver.findElement(By.xpath("//span[@onclick='r(4)'and .='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@onclick='r(0)'and .='0']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@onclick='r(0)'and .='0']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@onclick='r('*')' or .='*']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@onclick='r(2)'and .='2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@onclick='r(0)'and .='0']")).click();
		Thread.sleep(1000);
		
		String result11 = driver.findElement(By.xpath("//div[@id='sciOutPut']")).getText();
		System.out.println("400*20 =" +result11);
		
		
		
	}

}
