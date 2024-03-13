package com.cydeo.step_definitions;

import com.cydeo.pages.DigitecSearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Digitec_StepDefinitions {
    DigitecSearchPage digitecSearchPage = new DigitecSearchPage();


    @Given("User is on digitec homepage")
    public void userIsOnDigitecHomepage() {
        Driver.getDriver().get("https://digitec.ch");

    }


    @Then("User sees title is as expected.")
    public void user_sees_title_is_as_expected() {
        String expectedTitle = "digitec.ch – the online shop for all things digital";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @When("User types {string} in the search box")
    public void userTypesInTheSearchBox(String searchKey) {
        digitecSearchPage.searchBoxDigitec.sendKeys(searchKey);
    }


    @When("User clicks search button")
    public void user_clicks_search_button() {
        digitecSearchPage.searchBoxDigitec.sendKeys(Keys.ENTER);
    }


    @Then("User sees {string} is in the title")
    public void user_sees_wooden_spoon_is_in_the_title(String searchKey) {

        BrowserUtils.waitForTitleContains(searchKey);

        BrowserUtils.verifyTitleContains(searchKey);

    }


}