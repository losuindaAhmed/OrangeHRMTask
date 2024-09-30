package testcases;



import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.DashboardPage;
import pageobjects.LoginPage;

public class LoginTest extends BaseTest {
	LoginPage lp = new LoginPage(driver);
	DashboardPage dp;

	@Test(priority = 1)
	public void testSuccessLogin() {
		lp = new LoginPage(driver);
		lp.setusername(p.getProperty("username"));
		lp.setpassword(p.getProperty("passsword"));
		lp.clicklogin();
		dp = new DashboardPage(driver);
		if (dp.isMessageDisplayed() == true) {
			Assert.assertTrue(true);
			dp.clickMenu();
			dp.clickLogout();

		} else {
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 2)
	public void testInvalidUsername() {
		lp = new LoginPage(driver);
		lp.setusername(p.getProperty("invalidusername"));
		lp.setpassword(p.getProperty("passsword"));
		lp.clicklogin();
		assertTrue(lp.errorMessgeText());

	}

	@Test(priority = 3)
	public void testInvalidPassword() {
		lp = new LoginPage(driver);
		lp.setusername(p.getProperty("username"));
		lp.setpassword(p.getProperty("invalidpassword"));
		lp.clicklogin();
		assertTrue(lp.errorMessgeText());

	}

	@Test(priority = 4)

	public void testEmptyusername() {
		lp = new LoginPage(driver);
		lp.setusername("");
		lp.setpassword(p.getProperty("passsword"));
		lp.clicklogin();
		assertTrue(lp.isRequiredMessageIsVisiable());

	}

	@Test(priority = 5)
	public void testEmptypassword() {
		lp = new LoginPage(driver);
		lp.setusername(p.getProperty("username"));
		lp.setpassword("");
		lp.clicklogin();
		assertTrue(lp.isRequiredMessageIsVisiable());

	}

	@Test(priority = 6)
	public void testEmptyFields() {
		lp = new LoginPage(driver);
		lp.setusername("");
		lp.setpassword("");
		lp.clicklogin();
		assertTrue(lp.isRequiredMessageIsVisiable());

	}
}
