package pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageLoginErro {
	private WebDriver driver;

	public PageLoginErro(WebDriver driver) {
		this.driver = driver;
	}

	public void assertErroPage() {
		assertTrue(driver.findElement(By.cssSelector(".error-message-container h3")).getText()
				.contains("Epic sadface:"));
	}
}
