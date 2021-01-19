package com.qa.resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class base {
	//static AndroidDriver<AndroidElement> driver;
	protected Properties prop;
	protected FileInputStream fis = new FileInputStream(
			System.getProperty("user.dir") + "/src/main/java/com/qa/resources/data.properties");

	public base() throws IOException {
		prop = new Properties();
		prop.load(fis);
	}

	public String getUsername() {
		return prop.getProperty("username");
	}

	public String getPassword() {
		return prop.getProperty("password");
	}
	
	public String getNativeView() {
		return prop.getProperty("native");
	}

	public String getWebView() {
		return prop.getProperty("web");
	}
	
	public String getappName() {
		return (String) prop.get("appname");
	}
	
}
