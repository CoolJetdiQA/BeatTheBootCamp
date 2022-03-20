package stepdefinitions;

import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utilities.BaseClass;
import utilities.CommonMethods;

public class GoogleStepDef extends CommonMethods {

	@Given("Background is running before scenario")
	public void background_is_running_before_scenario() {
		System.out.println("THIS BACKGROUND IS RUNNING...");
	}

	@When("I want to search {string}")
	public void i_want_to_search(String string) {
		System.err.println("I searched " + string);
	}

	@When("results text is displayed with {string}")
	public void results_text_is_displayed_with(String string) {
		System.err.println("result is displayed as " + string);
	}

	@Given("number is {double}")
	public void number_is(Double double1) {
		System.err.println("My number is " + double1);
	}

	@Given("^I have a (.*) cars.$")
	public void i_have_a_two_cars(String car) {
		System.out.println("running i have " + car + " cars");
	}

	@Given("the following animals")
	public void the_following_animals(List<String> names) {
		System.out.println(names.size());
	}


	@When("Poker has {string} card")
	public void poker_has_card(String name) {
		System.out.println("poker " + name);
	}

	@Given("^I won (.*) dollars$")
	public void i_won_one_dollar_dollars(String lotto) {
		System.out.println("my lotto winning is " + lotto);
	}

}
