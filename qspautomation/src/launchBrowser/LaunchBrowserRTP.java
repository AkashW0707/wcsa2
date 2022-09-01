package launchBrowser;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowserRTP {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		//took yhe user input
		 Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the Browser Name, Chrome or Firefox");
	     String browserValue = sc.nextLine();
	     
	     //browserValue variable constains the name of the browser which is supposed to be opened
	     
	     if (browserValue.equalsIgnoreCase("chrome")) 
	    {
	    	 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");//avoid illegal
	    	 driver=new ChromeDriver();//open chrome browser
	    	 driver.manage().window().maximize();
	    	 driver.get("https://www.google.com");
	    	 Thread.sleep(5000);
	    	 driver.close();
	    }
	     
	     else if (browserValue.equalsIgnoreCase("firefox")) 
		    {
		    	 System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");//avoid illegal
		    	 driver=new FirefoxDriver();//open chrome browser
		    	 driver.manage().window().maximize();
		    	 driver.get("https://www.google.com");
		    	 Thread.sleep(5000);
		    	 driver.close();
		    }
	     
	     else
	     {
	    	 System.out.println("Enter valid input");
	     }

	}

}
