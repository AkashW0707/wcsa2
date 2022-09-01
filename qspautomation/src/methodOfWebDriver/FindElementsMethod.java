package methodOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("bike");
		Thread.sleep(2000);
        List<WebElement> webelementsuggestions = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
      //  for(int i = 0;i<webelementsuggestions.size();i++)
       // {
        //	WebElement sugg = webelementsuggestions.get(i);
        	//String textofsugg = sugg.getText();
        //	System.out.println(textofsugg);


        //}
        for(WebElement sugg:webelementsuggestions)
        {
        	String textofwebelement = sugg.getText();
        	System.out.println(textofwebelement);
        
        }

	}

}
