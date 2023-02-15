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

public class SeleniumRelativeLocatorAbove {
	
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
	public void testSeleniumRelativeLocatorAbove() {
		WebElement table = driver.findElement(By.id("table1"));
		WebElement paraTag = driver.findElement(RelativeLocator.with(By.tagName("p")).above(table));
		System.out.println(paraTag.getText());
	}

}