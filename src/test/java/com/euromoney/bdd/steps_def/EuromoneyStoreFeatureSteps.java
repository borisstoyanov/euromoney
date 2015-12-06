package com.euromoney.bdd.steps_def;

import org.testng.Assert;

import com.euromoney.page_objects.store.EuromoneyBookDetails;
import com.euromoney.page_objects.store.EuromoneyShoppingCart;
import com.euromoney.page_objects.store.EuromoneyStore;
import com.euromoney.page_objects.web_site.EuromoneyHomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EuromoneyStoreFeatureSteps {
	
	EuromoneyHomePage homePage;
	EuromoneyStore store;
	EuromoneyBookDetails bookDetails;
	EuromoneyShoppingCart shoppingCart;

	@Given("^I am on the EuromoneyPage$")
	public void i_am_on_the_EuromoneyPage(){
		homePage = EuromoneyHomePage.goTo();
	}

	@Given("^I navigate to EuromoneyStore$")
	public void i_navigate_to_EuromoneyStore() {
		store = homePage.goToStore();
	}

	@Given("^I click on ViewMoreDetails on the BookOfMonth$")
	public void i_click_on_ViewMoreDetails_on_the_BookOfMonth() throws InterruptedException {
		bookDetails = store.viewBookOfMonth();
	}

	@When("^I get to the BookDetailsPage$")
	public void i_get_to_the_BookDetailsPage() {
		Assert.assertTrue(bookDetails.isAt());
	}

	@When("^I add the book$")
	public void i_add_the_book(){
		shoppingCart = bookDetails.addToCart();
	}

	@When("^I go to ShoppingCart$")
	public void i_go_to_ShoppingCart(){
		Assert.assertTrue(shoppingCart.isAt());
	}

	@Then("^the book should be added$")
	public void the_book_should_be_added() {
		Assert.assertTrue(shoppingCart.bookOfMonthIsAdded());
	}
	
	@Then("^the price is displatyed in GBP$")
	public void the_price_is_displatyed_in_GBP() {
		Assert.assertTrue(shoppingCart.priceIsInGBP());
	}

	@Then("^the price is displatyed is: \"([^\"]*)\"$")
	public void the_price_is_displatyed_is(String currency) {
	}

}
