package pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageLogon {
	private WebDriver driver;

	public PageLogon(WebDriver driver) {
		this.driver = driver;
	}
	
	public void assertLogonPage() {
		assertTrue(driver.findElement(By.cssSelector(".header_secondary_container span.title")).getText()
				.contains("Products"));
	}
}
