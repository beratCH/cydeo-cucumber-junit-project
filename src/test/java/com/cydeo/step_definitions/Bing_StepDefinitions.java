package com.cydeo.step_definitions;

import com.cydeo.pages.BingSearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class Bing_StepDefinitions {

    BingSearchPage bingSearchPage = new BingSearchPage();

    @Given("user is on the Bing search page")
    public void user_is_on_the_bing_search_page() {
        Driver.getDriver().get("https://www.bing.com");


    }

    @When("user searches for orange in the Bing search box")
    public void user_searches_for_orange_in_the_bing_search_box() {
        bingSearchPage.bingSearchBox.sendKeys("orange" + Keys.ENTER);


    }

    @Then("user should see orange in the title")
    public void user_should_see_orange_in_the_title() {
        BrowserUtils.verifyTitle("orange - Search");

    }

    @When("user searches for {string} in the Bing search box")
    public void userSearchesForInTheBingSearchBox(String searchKey) {
        bingSearchPage.bingSearchBox.click();
        bingSearchPage.bingSearchBox.sendKeys(searchKey + Keys.ENTER);
    }

    @Then("user should see {string} in the title")
    public void userShouldSeeInTheTitle(String expectedTitle) {
        BrowserUtils.verifyTitle(expectedTitle);
    }
}
