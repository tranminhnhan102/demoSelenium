package guruTestCase;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import common.Utilities;
import constant.Constant;

public class TestBase {
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", Utilities.getProjectPath() + "\\src\\driver\\chromedriver.exe" );
		Constant.DRIVER = new ChromeDriver();
		Constant.DRIVER.manage().window().maximize();
	}
	
	@AfterMethod
	public void afterMethod() {
		Constant.DRIVER.close();
	}
}
