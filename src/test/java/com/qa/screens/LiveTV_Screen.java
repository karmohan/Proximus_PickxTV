package com.qa.screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LiveTV_Screen {
	AndroidDriver<AndroidElement> driver;
	By replay_button = By.id("be.belgacom.mobile.tveverywhere:id/all_channels_ic_replay");
	By live_now = By.id("be.belgacom.mobile.tveverywhere:id/channel_meta_live");
	By Navigate_up_button= MobileBy.AccessibilityId("Navigate up");


	public LiveTV_Screen(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
	}

	public WebElement getReplay_button() {
		return driver.findElement(replay_button);
	}
	
	public WebElement getLive_now() {
		return driver.findElement(live_now);
	}
	
	public WebElement getNavigate_up_button() {
		return driver.findElement(Navigate_up_button);
	}

}
