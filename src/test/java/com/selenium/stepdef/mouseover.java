package com.selenium.stepdef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import com.example.util.ExtentReportManager;
import com.selenium.function.funclass;;


public class mouseover extends funclass
{
	funclass fun = new funclass();
	
	 @Before
	    public void beforeScenario(io.cucumber.java.Scenario scenario) {
	        ExtentReportManager.createTest(scenario.getName(), scenario.getId());
	    }
	
	@Given("the user Navigate to the webpage")
	public void the_user_navigate_to_the_webpage() {
	   
		fun.URL();
	}

	@And("Hover over the target element")
	public void hover_over_the_target_element() {
		fun.movetologin();
	}

	@Then("Verify that the tooltip is displayed")
	public void verify_that_the_tooltip_is_displayed() {
	   fun.verifytooltip();
	   
	}
	@After
    public void afterScenario(io.cucumber.java.Scenario scenario) {
        if (scenario.isFailed()) {
            ExtentReportManager.getTest().fail("Scenario failed");
        } else {
            ExtentReportManager.getTest().pass("Scenario passed");
        }
        fun.quit();
	}
   }
