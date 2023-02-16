package com.selenium.four.relative.locators.add;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumRelativeLocatorNear {
	
	private WebDriver driver;
	
	@BeforeMethod
	public void startUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void tearDown() { driver.quit(); }

	@Test
	public void testSeleniumRelativeLocatorNearWebTable() {
		driver.get("https://the-internet.herokuapp.com/tables");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement col1 = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[1]/td"));
		List<WebElement> elements = driver.findElements(RelativeLocator.with(By.xpath("//table[@id='table1']/tbody/tr[1]/td")).near(col1));
		for (WebElement element : elements) {
			System.out.println(element.getText());
		}
	}
	
	@Test
	public void testSeleniumRelativeLocatorNearLoginPage() {
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement userName = driver.findElement(By.id("login_credentials"));
		WebElement pwd = driver.findElement(RelativeLocator.with(By.className("login_password")).near(userName));
		System.out.println(pwd.getText().split(":")[1].trim());
	}

}