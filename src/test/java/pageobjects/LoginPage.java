package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	// locators

	@FindBy(xpath = "//input[@placeholder='Username']")
	private WebElement txt_username;

	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement txt_password;

	@FindBy(xpath = "//button[normalize-space()='Login']")
	private WebElement button_login;

	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
	private WebElement invalidErrorMessage;
	@FindBy(tagName = "span")
	private WebElement requiredMessage;

	// Action method
	public void setusername(String username) {
		txt_username.sendKeys(username);

	}

	public void setpassword(String pws) {
		txt_password.sendKeys(pws);
	}

	public void clicklogin() {
		button_login.click();
	}

	public boolean errorMessgeText() {

		return invalidErrorMessage.isDisplayed();
	}

	public boolean isRequiredMessageIsVisiable() {
		return requiredMessage.isDisplayed();
	}
}
