package com.qa.screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Setting_Screen {
	AndroidDriver<AndroidElement> driver;
	By settings_button = By.id("be.belgacom.mobile.tveverywhere:id/imageview_settings_button");
	By logout_button = By.id("be.belgacom.mobile.tveverywhere:id/item_logout");


	public Setting_Screen(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
	}

	public WebElement getSettings_button() {
		return driver.findElement(settings_button);
	}
	
	public WebElement getLogout_button() {
		return driver.findElement(logout_button);
	}
	
}
