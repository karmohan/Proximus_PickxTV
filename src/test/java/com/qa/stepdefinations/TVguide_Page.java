package com.qa.stepdefinations;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.resources.base;
import com.qa.screens.Home_Screen;
import com.qa.screens.Setting_Screen;
import com.qa.screens.TVguide_Screen;

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

public class TVguide_Page extends base {
	public static AndroidDriver<AndroidElement> driver;
	public TVguide_Screen tvGuide;
	public Home_Screen home;

	public TVguide_Page() throws IOException {
		this.driver = Hooks.getDriver();

	}
	@Test
	@Description("Verify TVguide page")
	@Epic("E0003")
	@Feature("Feature:TVguide")
	@Story("Stroy: TVguide page test")
	@Severity(SeverityLevel.NORMAL)
    @Given("^The user navigates to the TV guide page$")
    public void the_user_navigates_to_the_tv_guide_page() throws Throwable {
        home = new Home_Screen(driver);
        tvGuide= new TVguide_Screen(driver);
        home.getTvGuide_button().click();
        Assert.assertTrue(tvGuide.getToggle_date_button().isDisplayed());
    }
	
	@Test
	@Description("Verify TVguide page")
	@Epic("E0003")
	@Feature("Feature:TVguide")
	@Story("Stroy: TVguide page test")
	@Severity(SeverityLevel.NORMAL)
    @When("^The user clicks on the date drop down to see the dates view$")
    public void the_user_clicks_on_the_date_dropdown_to_see_the_dates_view() throws Throwable {
		tvGuide= new TVguide_Screen(driver);
		tvGuide.getToggle_date_button().click();
		Assert.assertTrue(tvGuide.getRecyclerview_dates().isDisplayed());
		tvGuide.getToggle_date_button().click();
    }
    
}
