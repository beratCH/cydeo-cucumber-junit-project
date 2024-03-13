package com.cydeo.step_definitions;

import com.cydeo.pages.CydeoWebTableLoginPage;
import com.cydeo.pages.WT_OrderPage;
import com.cydeo.pages.WT_ViewAllOrdersPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class CydeoWebTables_StepDefinitions {

    CydeoWebTableLoginPage cydeoWebTableLoginPage = new CydeoWebTableLoginPage();

    @Given("user is on the login page of Cydeo WebTables")
    public void user_is_on_the_login_page_of_cydeo_web_tables() {
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
    }

    @When("user enters {string} as username")
    public void user_enters_as_username(String username) {
        cydeoWebTableLoginPage.usernameBox.sendKeys(username);
    }

    @And("user enters {string} as a password")
    public void user_enters_as_a_password(String password) {
        cydeoWebTableLoginPage.passwordBox.sendKeys(password);
        cydeoWebTableLoginPage.loginButton.click();
    }

    @Then("user should be able to verify URL as ending with {string}")
    public void user_should_be_able_to_verify_url_as_ending_with_orders(String word) {
        Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(word));

    }

    @When("user enters below credentials")
    public void userEntersBelowCredentials(Map<String, String> credentials) {

        cydeoWebTableLoginPage.usernameBox.sendKeys(credentials.get("username"));
        cydeoWebTableLoginPage.passwordBox.sendKeys(credentials.get("password"));
        cydeoWebTableLoginPage.loginButton.click();
    }

    @Given("user is already logged in to The Web table app")
    public void userIsAlreadyLoggedInToTheWebTableApp() {
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
        cydeoWebTableLoginPage.login();
    }

    WT_OrderPage orderPage = new WT_OrderPage();

    @When("user is on the “Order” page")
    public void userIsOnTheOrderPage() {
        orderPage.orderLink.click();
    }

    @Then("user sees below options under “product” dropdown")
    public void userSeesBelowOptionsUnderProductDropdown(List<String> expectedOptions) {

        List<String> actualOptions = BrowserUtils.dropdownOptions_as_String(orderPage.productDropdown);

        Assert.assertEquals(expectedOptions, actualOptions);


    }


    @Then("user sees Visa as enabled payment option")
    public void userSeesVisaAsEnabledPaymentOption() {
        Assert.assertTrue(orderPage.visaRadioButton.isEnabled());

    }

    @Then("user sees Mastercard as enabled payment option")
    public void userSeesMastercardAsEnabledPaymentOption() {
        Assert.assertTrue(orderPage.mastercardRadioButton.isEnabled());
    }

    @Then("user sees American Express as enabled payment option")
    public void userSeesAmericanExpressAsEnabledPaymentOption() {
        Assert.assertTrue(orderPage.aExpressRadioButton.isEnabled());
    }

    WT_OrderPage wt_orderPage = new WT_OrderPage();


    @And("user enters quantity {string}")
    public void userEntersQuantity(String quantity) {
        wt_orderPage.quantityBox.clear();
        //wt_orderPage.quantityBox.sendKeys(Keys.BACK_SPACE);
        wt_orderPage.quantityBox.sendKeys("2");
    }

    @And("user clicks to calculate button")
    public void userClicksToCalculateButton() {

    }

    @And("user enters customer name {string}")
    public void userEntersCustomerName(String name) {
        wt_orderPage.customerNameBox.sendKeys(name);

    }

    @And("user enters street {string}")
    public void userEntersStreet(String street) {
        wt_orderPage.streetBox.sendKeys(street);
    }

    @And("user enters city {string}")
    public void userEntersCity(String city) {
        wt_orderPage.cityBox.sendKeys(city);
    }

    @And("user enter state {string}")
    public void userEnterState(String state) {
        wt_orderPage.stateBox.sendKeys(state);
    }

    @And("user enters zip {string}")
    public void userEntersZip(String zip) {
        wt_orderPage.zipBox.sendKeys(zip);
    }

    @And("user selects payment option {string}")
    public void userSelectsPaymentOption(String expectedCardType) {
        BrowserUtils.clickRadioButton(orderPage.cardTypes, expectedCardType);
    }

    @And("user enters credit card number {string}")
    public void userEntersCreditCardNumber(String cardNumber) {
        wt_orderPage.creditCardNumberBox.sendKeys(cardNumber);
    }

    @And("user enters expiration date {string}")
    public void userEntersExpirationDate(String exDate) {
        wt_orderPage.cardExBox.sendKeys(exDate);
    }

    @And("user clicks to {string} button")
    public void userClicksToButton(String arg0) {
        wt_orderPage.processOrderButton.click();
    }

    WT_ViewAllOrdersPage viewAllOrdersPage = new WT_ViewAllOrdersPage();

    @Then("user should see {string} in the first row of the web table")
    public void userShouldSeeInTheFirstRowOfTheWebTable(String expectedName) {
      String actualName =   viewAllOrdersPage.newCustomerCell.getText();
      Assert.assertEquals(actualName,expectedName);

    }


}
