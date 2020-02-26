package guru;

import org.openqa.selenium.By;

import constant.Constant;

public class HomePage extends GeneralManagerPage {
	private final By _lblWelcome = By.xpath("//td/marquee[contains(.,'Welcome To Manager')]");
	private By _lblUser;

	public boolean isHomePageDisplayed() {
		return Constant.DRIVER.findElement(_lblWelcome).isDisplayed();
	}

	public boolean checkUserDisplayed(String user) {
		String txt = "//tr[@class]/td[contains(.,'" + user + "')] ";
		_lblUser = By.xpath(txt);
		return Constant.DRIVER.findElement(_lblUser).isDisplayed();
	}
}
