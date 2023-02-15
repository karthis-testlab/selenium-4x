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

public class SeleniumRelativeLocatorBelow {
	
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
	public void testSeleniumRelativeLocatorBelow() {
		WebElement table = driver.findElement(By.xpath("//table[@id='table1']/thead/tr/th/span[text()='Last Name']"));
		WebElement paraTag = driver.findElement(RelativeLocator.with(By.tagName("tr")).below(table));
		System.out.println(paraTag.findElement(By.tagName("td")).getText());
	}
	
	@Test
	public void testSeleniumRelativeLocatorBelowListElements() {
		WebElement table = driver.findElement(By.xpath("//table[@id='table1']/thead/tr/th/span[text()='Last Name']"));
		List<WebElement> elements = driver.findElements(RelativeLocator.with(By.xpath("//table[@id='table1']/tbody/tr/td[1]")).below(table));
		for (WebElement element : elements) {
			System.out.println(element.getText());
		}
	}
	
	@Test
	public void testSeleniumRelativeLocatorUseBelowAndAbove() {
		WebElement table1 = driver.findElement(By.xpath("//table[@id='table1']/thead/tr/th/span[text()='Last Name']"));
		WebElement table2 = driver.findElement(By.xpath("//table[@id='table2']/thead/tr/th/span[text()='Last Name']"));
		List<WebElement> elements = driver.findElements(RelativeLocator.with(By.xpath("//table[@id='table1']/tbody/tr/td")).below(table1).above(table2));
		for (WebElement element : elements) {
			System.out.println(element.getText());
		}
	}

}