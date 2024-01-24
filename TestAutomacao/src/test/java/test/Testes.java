package test;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import pages.PageLogin;
import pages.PageLoginErro;
import pages.PageLogon;
import utils.Utils;

public class Testes {

	private WebDriver driver;

	@Before
	public void setUp() {
		DesiredCapabilities caps = new DesiredCapabilities();
		System.setProperty("webdriver.chrome.driver", "drives/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.saucedemo.com/");

		Utils util = new Utils();
		util.sleepSeconds(5);
	}

	@Test
	public void login() {
		/*
		 * driver.findElement(By.id("user-name")).sendKeys("standard_user");
		 * driver.findElement(By.id("password")).sendKeys("secret_sauce");
		 * driver.findElement(By.id("login-button")).click();
		 */
		PageLogin login = new PageLogin(driver);
		PageLogon logon = new PageLogon(driver);
		
		login.Login("standard_user", "secret_sauce");

		Utils util = new Utils();
		util.sleepSeconds(4);

		logon.assertLogonPage();

	}
	@Test
	public void loginErrado() {
		PageLogin login = new PageLogin(driver);
		PageLoginErro loginErro = new PageLoginErro(driver);
		
		login.Login("teste@", "1234");

		Utils util = new Utils();
		util.sleepSeconds(4);

		loginErro.assertErroPage();

	}

	@After
	public void finalizaTeste() {
		driver.close();
	}

}
