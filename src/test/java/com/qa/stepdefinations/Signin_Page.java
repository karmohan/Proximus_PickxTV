package com.qa.stepdefinations;

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

//import pageObjects.LandingPage;


import java.io.IOException;
import java.util.Set;

import org.junit.runner.RunWith;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.screens.Environment_Screen;


//@RunWith(Cucumber.class)
public class Signin_Page{
	public static AndroidDriver<AndroidElement> driver;
	
	public Signin_Page() throws IOException
	{
		this.driver=Hooks.getDriver();

	}
	
	@Test
	@Description("Verify user login")
	@Epic("E0001")
	@Feature("Feature:Login")
	@Story("Stroy: User registration")
	@Severity(SeverityLevel.CRITICAL)
	@Step("User opens the PickxTV application")
    @Given("^User opens the PickxTV application$")
    public void user_opens_the_pickxtv_application() throws Throwable {
		Environment_Screen signin=new Environment_Screen(driver);
		Assert.assertTrue(signin.getChoose_env_bar().isDisplayed());
    }
	
	@Test
	@Description("Verify user login")
	@Epic("E0001")
	@Feature("Feature:Login")
	@Story("Stroy: User registration")
	@Severity(SeverityLevel.CRITICAL)
	@Step("The User selects the environment")
    @When("^The User selects the environment$")
    public void the_user_selects_the_environment() throws Throwable {
		Environment_Screen signin=new Environment_Screen(driver);
		signin.getProd_radio_button().click();
		Assert.assertTrue(signin.getContinue_button().isEnabled()); 
    }
	
	@Test
	@Description("Verify user login")
	@Epic("E0001")
	@Feature("Feature:Login")
	@Story("Stroy: User registration")
	@Severity(SeverityLevel.CRITICAL)
	@Step("User select the login option")
	@And("^User select the login option$")
    public void user_select_the_login_option() throws Throwable {
		Environment_Screen signin=new Environment_Screen(driver);
		signin.getContinue_button().click();
		if(signin.getTerms_and_condition_accept_button().isDisplayed())
		{
			signin.getTerms_and_condition_accept_button().click();
		}
		else {
			
		}
		Assert.assertTrue(signin.getLogin_button().isDisplayed());
		signin.getLogin_button().click();
    }
}
