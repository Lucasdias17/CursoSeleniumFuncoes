package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageLogin {
	private WebDriver driver;
	private By userField;
	private By passField;
	private By loginBtn;
	
	public PageLogin(WebDriver driver) {
		this.driver = driver;
		userField = By.id("user-name");
		passField = By.id("password");
		loginBtn = By.id("login-button");
	}
	
	public void Login(String user, String pass) {
		driver.findElement(userField).sendKeys(user);
		driver.findElement(passField).sendKeys(pass);
		driver.findElement(loginBtn).click();
	}

}
