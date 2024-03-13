package com.cydeo.step_definitions;

import com.cydeo.pages.WikipediaSearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Wikipedia_StepDefinitions {
    
    WikipediaSearchPage wikipediaSearchPage = new WikipediaSearchPage();

    @Given("User is on Wikipedia Home page")
    public void user_is_on_wikipedia_home_page() {

        Driver.getDriver().get("https://www.wikipedia.org/");
        
    }
    @Given("User types {string} in the wiki search box")
    public void userTypesInTheWikiSearchBox(String arg0) {
        wikipediaSearchPage.searchBox.click();

        wikipediaSearchPage.searchBox.sendKeys(arg0);
    }
   /* @Given("User types Steve Jobs in the wiki search box")
    public void user_types_steve_jobs_in_the_wiki_search_box() {
        wikipediaSearchPage.searchBox.click();
        
        wikipediaSearchPage.searchBox.sendKeys("Steve Jobs");
       
    }*/

    @Given("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {

        wikipediaSearchPage.submitButton.click();
        
    }

    /*@Then("User sees Steve Jobs is in the wiki title")
    public void user_sees_steve_jobs_is_in_the_wiki_title() {
       
        BrowserUtils.verifyTitleContains("Steve Jobs");
        
    }*/
    @Then("User sees {string} is in the wiki title")
    public void userSeesIsInTheWikiTitle(String arg0) {
        BrowserUtils.verifyTitleContains(arg0);
    }


   /* @Then("User sees Steve Jobs is in the main header")
    public void userSeesSteveJobsIsInTheMainHeader() {
        String actualMainHeader = wikipediaSearchPage.mainHeader.getText();
        Assert.assertEquals(wikipediaSearchPage.mainHeader.getText(),"Steve Jobs");
        
    }*/
   @Then("User sees {string} is in the main header")
   public void userSeesIsInTheMainHeader(String arg0) {
       String actualMainHeader = wikipediaSearchPage.mainHeader.getText();
       Assert.assertEquals(wikipediaSearchPage.mainHeader.getText(),arg0);

   }

   /* @Then("User sees Steve Jobs is in the image header")
    public void userSeesSteveJobsIsInTheImageHeader() {
        Assert.assertEquals(wikipediaSearchPage.imageHeader.getText(),"Steve Jobs");

    }*/
   @Then("User sees {string} is in the image header")
   public void userSeesIsInTheImageHeader(String arg0) {
       Assert.assertEquals(wikipediaSearchPage.imageHeader.getText(),arg0);
   }


}
