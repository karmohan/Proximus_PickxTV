package com.qa.stepdefinations;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.And;
//import pageObjects.LandingPage;
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

import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import org.junit.runner.RunWith;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.resources.Utilities;
import com.qa.resources.base;
import com.qa.screens.Home_Screen;
import com.qa.screens.Login_Screen;

//@RunWith(Cucumber.class)
public class Login_Page extends base {

	public static AndroidDriver<AndroidElement> driver;
	public Login_Screen login;
	public Home_Screen home;

	public Login_Page() throws IOException {
		this.driver = Hooks.getDriver();

	}
	@Test
	@Description("Verify user login")
	@Epic("E0001")
	@Feature("Feature:Login")
	@Story("Stroy: User registration")
	@Severity(SeverityLevel.CRITICAL)
	@Step("User is on the login page")
	@And("^User is on the login page$")
    public void user_is_on_login_page() throws Throwable {
		login = new Login_Screen(driver);
		Assert.assertTrue(login.getUser_name_tab().isDisplayed());
    }
	
	@Test
	@Description("Verify user login")
	@Epic("E0001")
	@Feature("Feature:Login")
	@Story("Stroy: User registration")
	@Severity(SeverityLevel.CRITICAL)
	@Step("The User enters credentials")
    @And("^The User enters credentials$")
    public void the_user_enters_credentials() throws Throwable {
		login = new Login_Screen(driver);
		login.getuser_tab().sendKeys(getUsername());
		login.getpwd_tab().sendKeys(getPassword());
		login.getcon_button().click();
    }
	
	@Test
	@Description("Verify user login")
	@Epic("E0001")
	@Feature("Feature:Login")
	@Story("Stroy: User registration")
	@Severity(SeverityLevel.CRITICAL)
	@Step("User successfully log in to the Pickx app")
    @Then("^User successfully log in to the Pickx app$")
    public void user_successfully_login_to_pickx_app() throws Throwable {
		home = new Home_Screen(driver);
		Assert.assertTrue(home.getHome_button().isDisplayed());
    }
    
}
