package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
		//Declaration
	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd") private WebElement pass;
	@FindBy(id="loginButton") private WebElement loginButton;
	@FindBy(id="keepLoggedInCheckBox") private WebElement checkBox;
	@FindBy(xpath="//a[contains(text(),'Actimind ')]") private WebElement linkActiTime;
	@FindBy(xpath="License for using this software") private WebElement licenseLink;
	@FindBy(xpath="//img[contains(@src,'timer')]") private WebElement logoActiTime;
	
	
	//initialization go to source generate constructor field deselect all check boxes and generate
	//then remove super() and write PageFactory.initElements(driver,this)
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public WebElement getUsn() {
		return usn;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	public WebElement getCheckBox() {
		return checkBox;
	}
	public WebElement getLinkActiTime() {
		return linkActiTime;
	}
	public WebElement getLicenseLink() {
		return licenseLink;
	}
	public WebElement getLogoActiTime() {
		return logoActiTime;
	}
	
	//operational methods
	public void validLoginActiTime(String validUsername, String validPassword)
	{
		usn.sendKeys(validUsername);
		pass.sendKeys(validPassword);
		loginButton.click();
		
	}
	
	public void invalidLoginActiTime(String invalidusername, String invalidPassword) throws InterruptedException
	{
		usn.sendKeys(invalidusername);
		pass.sendKeys(invalidPassword);
		loginButton.click();
		Thread.sleep(3000);
		usn.clear();
	}
	
}
