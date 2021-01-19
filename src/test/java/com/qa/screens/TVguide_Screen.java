package com.qa.screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TVguide_Screen {
	AndroidDriver<AndroidElement> driver;
	By recyclerview_dates = By.id("be.belgacom.mobile.tveverywhere:id/recyclerview_dates");
	By toggle_date_button = By.id("be.belgacom.mobile.tveverywhere:id/imageview_toggle_date_button");


	public TVguide_Screen(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
	}

	public WebElement getToggle_date_button() {
		return driver.findElement(toggle_date_button);
	}
	
	public WebElement getRecyclerview_dates() {
		return driver.findElement(recyclerview_dates);
	}

}
