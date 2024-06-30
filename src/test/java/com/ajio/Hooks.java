package com.ajio;
import org.junit.Assume;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

import com.facebook.basefunctions.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks{
	
	@Before
	public void method1(Scenario sc) {
		BaseClass.browserLaunch();
		BaseClass.goToUrl("https://www.ajio.com");
		System.out.println(sc.getName()+": "+sc.getStatus());
	}
	
	@After
	public void method2(Scenario sc) {
		System.out.println(sc.getName()+": "+sc.getStatus());
	}
	
	@AfterStep
	public void screenshot(Scenario scenario) {
		final byte[] source= ((TakesScreenshot) BaseClass.driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(source, "image/png", scenario.getName());	
	}

//	@Before(order = 2)
//	public void method3(Scenario sc) {
//		System.out.println(sc.getName()+": "+sc.getStatus());
//	}
	
//	@Before(order = 2)
//	public void method4(Scenario sc) {
//		System.out.println(sc.getName()+": "+sc.getStatus());
//	}
	
//	@BeforeStep
//	public void launchingBrowser(Scenario sc) {}
//	@AfterStep
//	public void closingBrowser(Scenario sc) {}

//	@Before(value  = "@sortlist", order=0)
//	public void method5(Scenario sc) {
//		System.out.println(sc.getName()+": "+sc.getStatus());
//		Assume.assumeTrue(false);
//	}
}
