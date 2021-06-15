package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import io.cucumber.java.en.*;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;

public class GoogleSearchStepDefinitions {
	GooglePage obj = new GooglePage();
	
	@Given("user is on the google page")
	public void user_is_on_the_google_page() {
	   Driver.getDriver().get(ConfigReader.getProperty("google_url"));
	   try {
			Driver.getDriver().findElement(By.id("L2AGLb")).click();
			} catch (Exception e) {
				e.getMessage();
			}
	}

	@Given("user search for iphone")
	public void user_search_for_iphone() {
	    obj.searchBox.sendKeys("iphone"+Keys.ENTER);
	    //obj.searchBox.submit();
	}

	@Then("verify the result has phone")
	public void verify_the_result_has_phone() {
	   String pageTitle= Driver.getDriver().getTitle().toLowerCase();
	   Assert.assertTrue(pageTitle.contains("iphone"));
	}

	@Given("user search for teapot")
	public void user_search_for_teapot() {
	    obj.searchBox.sendKeys("tea pot"+Keys.ENTER);
	}

	@Then("verify the result has tea pot")
	public void verify_the_result_has_tea_pot() {
	    String pageTitle= Driver.getDriver().getTitle().toLowerCase();
	    Assert.assertTrue(pageTitle.contains("tea pot"));
	}
	@Given("user search for flower")
	public void user_search_for_flower() {
	    obj.searchBox.sendKeys("flower"+Keys.ENTER);
	    
	}

	@Then("verify the result has flower")
	public void verify_the_result_has_flower() {
	    String pageTitle=Driver.getDriver().getTitle().toLowerCase();
	    System.out.println("Flower title:"+pageTitle);
	    Assert.assertTrue(pageTitle.contains("flower"));
	}

}
