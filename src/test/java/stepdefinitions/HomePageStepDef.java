package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.CommonMethods;


public class HomePageStepDef {
	
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
		System.out.println("Step: User is on home page");
	}

	@When("User navigates to Shop page")
	public void user_navigates_to_shop_page() {
		System.out.println("Step: User navigates to shop page");
	}

	@And("searches for an item")
	public void searches_for_an_item() {
		System.out.println("Step: User searches for an item");
	}

	@Then("result count should be displayed with number")
	public void result_count_should_be_displayed_with_number() {
		System.out.println("Step: Result number is displayed.");
	}
	
	@When("User navigates searchPage using big yellow button")
	public void user_navigates_searchPage_using_big_yellow_button() {
		System.out.println("Step: User search page using yellow button.");
	}
	
	@Given("Go to this url")
	public void goToThisUrl(){
		//BaseClass.getDriver().get(url);
		System.out.println();
	}
	
	@When("User navigates searchPage using big yello button")
	public void user_navigates_search_page_using_big_yello_button() {
		System.out.println("Step: user navigates searchpage using big yellow button.");
	}
	@When("searchs for an item")
	public void searchs_for_an_item() {
		System.out.println("Step: search an item.");
	} 
	@Then("results count should be displayed with number")
	public void results_count_should_be_displayed_with_number() {
		System.out.println("Step: results count should be displayed with number.");
	}
	@Then("user enter username {string} and password {string}")
	public void user_enter_username_and_password(String string, String string2) {
		System.out.println("my username: " + string);
		System.out.println("my password: " + string2);
	}
	@Then("I have added wait {int}")
	public void i_have_added_wait(Integer int1) {
	   System.out.println("I have added wait integer: " + int1);
	}

}
