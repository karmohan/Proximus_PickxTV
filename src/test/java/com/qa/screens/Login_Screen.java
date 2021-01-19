package com.qa.screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Login_Screen {

	AndroidDriver<AndroidElement> driver;
	By user_name_tab = MobileBy.AccessibilityId("userName");
	By password_tab= MobileBy.AccessibilityId("userPwd");
	By continue_button = By.id("be.belgacom.mobile.tveverywhere:id/button_continue");
	By user = By.xpath("//*[@text='Email']");
	By user_tab = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.widget.EditText");
	By pwd_tab = By.xpath("	\r\n" + 
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[3]/android.widget.EditText");
	By pwd = By.xpath("//*[@text='Password']");
	By con_button = By.xpath("//*[@text='Continue']");
	
	public Login_Screen(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
	}

	public WebElement getUser_name_tab() {
		return driver.findElement(user);
	}

	public WebElement getPassword_tab() {
		return driver.findElement(pwd);
	}

	public WebElement getContinue_button() {
		return driver.findElement(continue_button);
	}
	
	public WebElement getpwd_tab() {
		return driver.findElement(pwd_tab);
	}
	
	public WebElement getuser_tab() {
		return driver.findElement(user_tab);
	}
	
	public WebElement getcon_button() {
		return driver.findElement(con_button);
	}
}
