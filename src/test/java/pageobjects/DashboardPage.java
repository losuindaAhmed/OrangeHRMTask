package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {

	public DashboardPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//h6[normalize-space()='Dashboard']")
	private WebElement msgDashboard;

	@FindBy(xpath = "//span[@class='oxd-userdropdown-tab']")
	private WebElement menu;

	@FindBy(xpath = "//a[normalize-space()='Logout']")
	private WebElement button_logout;

	// Action methods
	public boolean isMessageDisplayed() {
		return (msgDashboard.isDisplayed());
	}

	public void clickMenu() {
		menu.click();

	}

	public void clickLogout() {
		button_logout.click();

	}
}
