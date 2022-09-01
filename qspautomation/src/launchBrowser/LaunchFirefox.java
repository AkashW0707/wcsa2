//How to open a Firefox Browser....
package launchBrowser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {
		//this statement is use for remove the IllegalStateException....
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		new FirefoxDriver(); // this statement is use to open a Firefox Browser....
	}

}
