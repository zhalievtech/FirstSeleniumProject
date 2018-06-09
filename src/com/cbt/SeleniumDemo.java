package com.cbt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo  {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","//Users/Z/Documents/selenium dependencies/drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("http://google.com");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("search")).sendKeys("СThis is America");
		
		driver.findElement(By.id("search-icon-legacy")).click();
		
		//driver.findElement(By.id("video-title")).click();
		
		
		

		
		
		
		
	}
}
