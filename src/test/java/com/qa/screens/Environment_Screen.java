package com.qa.screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Environment_Screen {
	
	AndroidDriver<AndroidElement> driver;
	By prod_radio_button = By.xpath("//*[@text='PROD']");
	By continue_button = By.id("be.belgacom.mobile.tveverywhere:id/button_continue");
	By choose_env_bar = By.id("be.belgacom.mobile.tveverywhere:id/toolbar");
	By login_button = By.id("be.belgacom.mobile.tveverywhere:id/button_login");
	By terms_and_condition_accept_button = By.id("be.belgacom.mobile.tveverywhere:id/button_agree");

	public Environment_Screen(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
	}

	public WebElement getProd_radio_button() {
		return driver.findElement(prod_radio_button);
	}
	
	public WebElement getContinue_button() {
		return driver.findElement(continue_button);
	}
	
	public WebElement getChoose_env_bar() {
		return driver.findElement(choose_env_bar);
	}
	
	public WebElement getLogin_button() {
		return driver.findElement(login_button);
	}
	
	public WebElement getTerms_and_condition_accept_button() {
		return driver.findElement(terms_and_condition_accept_button);
	}

}
