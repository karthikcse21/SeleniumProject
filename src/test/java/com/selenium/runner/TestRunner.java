package com.selenium.runner;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.example.util.ExtentReportManager;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "Feature", // Path to the feature files
    glue = {"com.selenium.stepdef"}, // Path to the step definition files
    tags = "@TooltipOnMouseover",
    plugin = {"pretty", "html:target/cucumber-reports.html"}, // Plugins for report generation
    monochrome = true // Display the console output in a readable format
)
public class TestRunner {
	 @BeforeClass
	    public static void setup() {
	        ExtentReportManager.getInstance();
	    }

	    @AfterClass
	    public static void teardown() {
	        ExtentReportManager.flush();
	    }
}