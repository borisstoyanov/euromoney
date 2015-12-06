package com.euromoney.bdd.steps_def;


import org.junit.Assert;

import com.euromoney.browser.Browser;
import com.euromoney.page_objects.web_site.EuromoneyHomePage;
import com.euromoney.page_objects.web_site.EuromoneyManagementTeamPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ManagementTeamFeatureSteps {
	EuromoneyManagementTeamPage managementTeam;
	EuromoneyHomePage homePage;

	@Before
	public void setUp() {
		Browser.init();
		Browser.instance.manage().window().maximize();
	}

	@Given("^I am on the ManagementTeamPage$")
	public void i_am_on_the_ManagementTeamPage(){
		homePage = EuromoneyHomePage.goTo();
		managementTeam = homePage.goToManagementPage();
	}

	@Then("^ManagementTeamPage is displayed correctly$")
	public void managementteampage_is_displayed_correctly(){
		Assert.assertTrue(EuromoneyManagementTeamPage.isAt());
	}

	@Then("^URLs of the following person is displayed: \"([^\"]*)\"$")
	public void urls_of_the_following_person_is_displayed(String person) {
	    Assert.assertTrue(managementTeam.isImageURLContaining(person));
	}

	@After
	public void tearDown() {
		Browser.quit();
	}
}
