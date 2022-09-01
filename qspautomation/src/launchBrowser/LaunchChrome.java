package launchBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) {
		//this statement is use for remove the IllegalStateException....
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		new ChromeDriver(); // this statement is use to open a Chrome Browser....

	}

}
