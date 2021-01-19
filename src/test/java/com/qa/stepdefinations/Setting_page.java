package com.qa.stepdefinations;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.resources.base;
import com.qa.screens.Home_Screen;
import com.qa.screens.Login_Screen;
import com.qa.screens.Setting_Screen;
import com.qa.screens.TVguide_Screen;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

public class Setting_page extends base {
	public static AndroidDriver<AndroidElement> driver;
	public Setting_Screen setting;
	public Home_Screen home;
	public TVguide_Screen tvGuide;

	public Setting_page() throws IOException {
		this.driver = Hooks.getDriver();

	}
	@Test
	@Description("Verify settings page")
	@Epic("E0002")
	@Feature("Feature:Settings")
	@Story("Stroy: Settings page test")
	@Severity(SeverityLevel.MINOR)
	@Step("The user navigates to the settings page")
    @Given("^The user navigates to the settings page$")
    public void the_user_navigates_to_the_settings_page() throws Throwable {
		setting = new Setting_Screen(driver);
		Assert.assertTrue(setting.getSettings_button().isDisplayed());
		setting.getSettings_button().click();
    }
	
	@Test
	@Description("Verify settings page")
	@Epic("E0002")
	@Feature("Feature:Settings")
	@Story("Stroy: Settings page test")
	@Severity(SeverityLevel.MINOR)
	@Step("The user validates the logout button")
    @When("^The user validates the logout button$")
    public void the_user_validates_the_logout_button() throws Throwable {
		setting = new Setting_Screen(driver);
		Assert.assertTrue(setting.getLogout_button().isDisplayed());
    }
	
	@Test
	@Description("Verify settings page")
	@Epic("E0002")
	@Feature("Feature:Settings")
	@Story("Stroy: Settings page test")
	@Severity(SeverityLevel.MINOR)
	@Step("The user navigates to the home page")
    @Then("^The user navigates to the home page$")
    public void the_user_navigates_to_the_home_page() throws Throwable {
		driver.navigate().back();

    }
	
    @Given("^The user navigates to the settings page failure case$")
    public void the_user_navigates_to_the_settings_page_failure_case() throws Throwable {
		tvGuide.getToggle_date_button().click();
		Assert.assertTrue(tvGuide.getRecyclerview_dates().isDisplayed());
    }
    
}
