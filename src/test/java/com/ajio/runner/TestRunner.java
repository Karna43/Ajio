package com.ajio.runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\karun\\eclipse-workspace\\Ajio\\src\\test\\resources\\features",
		glue = "com.ajio",
		tags = "@sortlist",
		plugin = {"pretty",
				"html:target/index.html","json:target/reports.json",
				  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		dryRun = false,
		monochrome = true,
		publish = true
		)
public class TestRunner extends AbstractTestNGCucumberTests{

	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
}
