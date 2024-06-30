package com.ajio;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

import com.ajio.locators.Listt;
import com.facebook.basefunctions.BaseClass;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioSortShirtsByList {
	public static BaseClass base = BaseClass.getInstance();
	public static Listt locators;
	public static Actions action;
	public static List<WebElement> options;
	public static Select select;
	public static boolean flag = true;
	
	
	@Given("Launch the Ajio website {string}")
	public void launch_the_ajio_website(String url) {
		locators = new Listt(BaseClass.driver);
	}

	@And("Navigate to Mens section and click on Shirts")
	public void navigate_to_mens_section_and_click_on_shirts() {
		base.goToElement(locators.getNewAccount());
		base.button(locators.getName());
//		WebElement moveToMenCategory = BaseClass.driver.findElement(By.xpath("//span[text()='MEN']"));
//		action.moveToElement(moveToMenCategory).build().perform();
//		WebElement shirts = BaseClass.driver.findElement(By.xpath("//a[text()='Shirts']"));
//		shirts.click();
	}

	@When("User clicks on sort dropdown and select option in a dropdown with one dim list")
	public void user_clicks_on_sort_dropdown_and_select_option_in_a_dropdown_with_one_dim_list(DataTable dataTable) {
		List<String> list = dataTable.asList();
//		List<List<String>> lists = dataTable.asLists(String.class);
//		for(List<String> i : lists) {
//			System.out.println(i);
//		}
		String sortValue = list.get(2);
		WebElement dropdown = BaseClass.driver.findElement(By.xpath("//select[@id='sortBy']"));
		 select = new Select(dropdown);
		 List<WebElement> options = select.getOptions();
		 for(WebElement option : options) {
			 String text = option.getText();
			 if(text.contains(sortValue)) {
				 select.selectByVisibleText(text);
			 }
		 }
	}

	@Then("Validate the outcome")
	public void validate_the_outcome() {
//		try{
//			List<WebElement> prices = driver.findElements(By.xpath("//span[@class='price  ']"));
//			Thread.sleep(10000);
//		 for(int i=0;i<prices.size()-1;i++) {
//		    	String previous = prices.get(i).getText().replaceAll(",","").replaceAll("₹", "");
//		    	String next = prices.get(i+1).getText().replaceAll(",","").replaceAll("₹", "");
//		    	int firstValue = Integer.parseInt(previous);
//		    	int secondValue = Integer.parseInt(next);
//		    	if(firstValue < secondValue) {
//		    		System.out.println(firstValue);
//		    	}
//		    	else {
//		    		flag = false;
//		    		break;
//		    	}
//		 }
//		if(flag = true) 
//			System.out.println("Values are sorted in ascending order");
//	    else
//	    	System.out.println("sort option not working properly");
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
	}
}
