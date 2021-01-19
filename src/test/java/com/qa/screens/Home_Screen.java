package com.qa.screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Home_Screen {
	AndroidDriver<AndroidElement> driver;
	By home_button= MobileBy.AccessibilityId("Home");
	By liveTV_button= MobileBy.AccessibilityId("Live TV");
	By tvGuide_button= MobileBy.AccessibilityId("TV guide");
	By Recordings= MobileBy.AccessibilityId("Recordings");


	public Home_Screen(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
	}

	public WebElement getHome_button() {
		return driver.findElement(home_button);
	}
	
	public WebElement getLiveTV_button() {
		return driver.findElement(liveTV_button);
	}
	
	public WebElement getTvGuide_button() {
		return driver.findElement(tvGuide_button);
	}
	
	public WebElement getRecordings() {
		return driver.findElement(Recordings);
	}

}
