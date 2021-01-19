package com.qa.testrunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/java/com/qa/features"},
		glue={"com.qa.stepdefinations"},
				plugin = {
						"summary",
						"pretty",
						"json:target/cucumber-reports/cucumber.json"}		
		)
public class Testrunner extends AbstractTestNGCucumberTests {

}
