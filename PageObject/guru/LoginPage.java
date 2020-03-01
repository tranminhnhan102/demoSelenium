package guru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import constant.Constant;

public class LoginPage {
	private final By _txtUserName = By.xpath("//input[@name='uid']");
	private final By _txtPassword = By.xpath("//input[@name='password']");
	private final By _btnLogin = By.xpath("//input[@name='btnLogin']");
	
	protected WebElement userName()
	{
		return Constant.DRIVER.findElement(_txtUserName);
	}
	
	protected WebElement password() {
		return Constant.DRIVER.findElement(_txtPassword);
	}
	
	protected WebElement btnLogin() {
		return Constant.DRIVER.findElement(_btnLogin);
	}
	
	public LoginPage navigate(String url)
	{
		Constant.DRIVER.navigate().to(Constant.urlGuru);
		return new LoginPage();
	}
	
	public HomePage Login(String username, String password)
	{
		userName().sendKeys(username);
		password().sendKeys(password);
		btnLogin().click();
		return new HomePage();
	}

}
