package com.qa.screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Recordings_Screen {
	AndroidDriver<AndroidElement> driver;
	By recorded_tab= MobileBy.AccessibilityId("Recorded");
	By planned_tab= MobileBy.AccessibilityId("Planned");


	public Recordings_Screen(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
	}

	public WebElement getRecorded_tab() {
		return driver.findElement(recorded_tab);
	}
	
	public WebElement getPlanned_tab() {
		return driver.findElement(planned_tab);
	}
	

}
