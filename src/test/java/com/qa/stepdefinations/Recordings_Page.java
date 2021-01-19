package com.qa.stepdefinations;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.resources.base;
import com.qa.screens.Home_Screen;
import com.qa.screens.Recordings_Screen;
import com.qa.screens.Setting_Screen;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class Recordings_Page extends base {
	public static AndroidDriver<AndroidElement> driver;
	public Recordings_Screen record;
	public Home_Screen home;

	public Recordings_Page() throws IOException {
		this.driver = Hooks.getDriver();

	}
	@Test
	@Description("Verify Recordings page")
	@Epic("E0004")
	@Feature("Feature:Recordings")
	@Story("Stroy: Recordings page test")
	@Severity(SeverityLevel.NORMAL)
    @Given("^The user navigates to the recordings page$")
    public void the_user_navigates_to_the_recordings_page() throws Throwable {
        home = new Home_Screen(driver);
        home.getRecordings().click();
    }
	
	@Test
	@Description("Verify Recordings page")
	@Epic("E0004")
	@Feature("Feature:Recordings")
	@Story("Stroy: Recordings page test")
	@Severity(SeverityLevel.NORMAL)
    @When("^The user checks both recorded and planned tabs are available$")
    public void the_user_checks_both_recorded_and_planned_tabs_are_available() throws Throwable {
		record = new Recordings_Screen(driver);
		Assert.assertTrue(record.getRecorded_tab().isDisplayed());
		record.getPlanned_tab().click();
		Assert.assertTrue(record.getPlanned_tab().isDisplayed());
		
    }

}
