package com.selenium.four.implicity.wait.change;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium4ImplicityWaitChange {
	
	private WebDriver driver;
	
	/*
	 * On Before, Selenium 4.0.0 version implicitlyWait method have
	 * two arguments first one is long data type and second one is TimeUnit enum type
	 * 
	 * ex: driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 * 
	 * After Selenium 4.0.0 release version selenium type did one major change on the implicitlyWait method
	 * they deprecated the mplicitlyWait method have two arguments and 
	 * implement the on new method implicitlyWait with one argument as Duration class type
	 * 
	 * ex: driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 * 
	 */
	@Test
	public void testSelenium4ImplicityWaitChange() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

}