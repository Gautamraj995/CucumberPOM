package com.qa.factory;

import org.openqa.selenium.WebDriver;

public class DriverFactory {
	public WebDriver driver;
	
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
	
	public void init_driver(String browser) {
		
	}
}
