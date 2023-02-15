package com.selenium.four.relative.locators.add;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumRelativeLocatorToLeftOf {
	
	private WebDriver driver;
	
	@BeforeMethod
	public void startUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/tables");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@AfterMethod
	public void tearDown() { driver.quit(); }

	@Test
	public void testSeleniumRelativeLocatorToLeftOf() {
		WebElement col1 = driver.findElement(By.xpath("//table[@id='table1']/thead/tr/th/span[text()='First Name']"));
		WebElement col2 = driver.findElement(RelativeLocator.with(By.xpath("//span")).toLeftOf(col1));
		System.out.println(col2.getText());
	}

}