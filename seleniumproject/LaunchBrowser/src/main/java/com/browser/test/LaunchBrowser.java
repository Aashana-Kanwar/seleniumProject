package com.browser.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\AutomationTesting\\firefox driver\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		
        WebDriver driver = new FirefoxDriver();
        
        driver.get("https://www.google.com/");
        Thread.sleep(1000);
        driver.get("https://www.facebook.com/");
        WebElement username = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("pass"));
        WebElement login = driver.findElement(By.name("login"));
        
        username.sendKeys("aashanatanwar501@gmail.com");
        Thread.sleep(1000);
        password.sendKeys("chulbuli@2001");
        login.click();
//        Thread.sleep(2000);
//        driver.get("https://web.whatsapp.com/");
        
//        System.out.println(driver.getTitle());
	}



}
