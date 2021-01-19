package com.qa.stepdefinations;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.screens.Home_Screen;
import com.qa.screens.LiveTV_Screen;
import com.qa.screens.Setting_Screen;

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
import io.qameta.allure.Story;

public class LiveTV_Page {
	
	public static AndroidDriver<AndroidElement> driver;
	public Setting_Screen setting;
	public LiveTV_Screen liveTV;
	public Home_Screen home;

	public LiveTV_Page() throws IOException {
		this.driver = Hooks.getDriver();

	}
	@Test
	@Description("Verify LiveTV page")
	@Epic("E0005")
	@Feature("Feature:LiveTV")
	@Story("Stroy: LiveTV page test")
	@Severity(SeverityLevel.NORMAL)
    @Given("^The user navigates to the Live TV page$")
    public void the_user_navigates_to_the_live_tv_page() throws Throwable {
		home = new Home_Screen(driver);
		Assert.assertTrue(home.getLiveTV_button().isDisplayed());
		home.getLiveTV_button().click();
    }
	
	@Test
	@Description("Verify LiveTV page")
	@Epic("E0005")
	@Feature("Feature:LiveTV")
	@Story("Stroy: LiveTV page test")
	@Severity(SeverityLevel.NORMAL)
    @When("^The user selects one video$")
    public void the_user_selects_one_video() throws Throwable {
		liveTV = new LiveTV_Screen(driver);
		Assert.assertTrue(liveTV.getReplay_button().isDisplayed());
		liveTV.getReplay_button().click();
    }
	
	@Test
	@Description("Verify LiveTV page")
	@Epic("E0005")
	@Feature("Feature:LiveTV")
	@Story("Stroy: LiveTV page test")
	@Severity(SeverityLevel.NORMAL)
	   @And("^The user validates live option is available$")
    public void the_user_validates_live_option_is_available() throws Throwable {
		liveTV = new LiveTV_Screen(driver);
		Assert.assertTrue(liveTV.getLive_now().isDisplayed());
    }
	
	@Test
	@Description("Verify LiveTV page")
	@Epic("E0005")
	@Feature("Feature:LiveTV")
	@Story("Stroy: LiveTV page test")
	@Severity(SeverityLevel.NORMAL)
    @Then("^The user returns to the home page$")
    public void the_user_returns_to_the_home_page() throws Throwable {
		liveTV = new LiveTV_Screen(driver);
		Assert.assertTrue(liveTV.getNavigate_up_button().isDisplayed());
		liveTV.getNavigate_up_button().click();
		driver.navigate().back();
    }

}
