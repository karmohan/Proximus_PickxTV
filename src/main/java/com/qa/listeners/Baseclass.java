package com.qa.listeners;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.qa.resources.base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Baseclass extends base{
	
	public Baseclass() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static AndroidDriver<AndroidElement> driver;

	public static ThreadLocal<AndroidDriver> tdriver = new ThreadLocal<AndroidDriver>();
	
	public AndroidDriver setUpAppium() throws MalformedURLException {
	File appDir = new File("src");
    File app = new File(appDir,getappName());
		
		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		capability.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		capability.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		capability.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	    capability.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "be.belgacom.mobile.tveverywhere");
	    capability.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "be.belgacom.mobile.tveverywhere.SplashActivity");
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capability);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		tdriver.set(driver);
		return getDriver();
	}
	
	public static synchronized AndroidDriver getDriver() {
		return tdriver.get();
	}
	
	

}
