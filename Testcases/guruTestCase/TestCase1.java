package guruTestCase;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import constant.Constant;
import guru.HomePage;
import guru.LoginPage;

public class TestCase1 extends TestBase{

	/*
	 * TC1: Login and verify user name 
	 * */
	@Test
	public void TC01() {
		LoginPage login = new LoginPage();
		String url = Constant.urlGuru;
		String username = Constant.user;
		String password = Constant.password;
		HomePage homepage = login.navigate(url).Login(username, password);
		boolean check = homepage.checkUserDisplayed(username);
		assertEquals(check, true);
	}
}
