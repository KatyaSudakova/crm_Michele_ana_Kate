package com.crm.step_definitions;

import com.crm.pages.LoginPage;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US01_Login_StepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("the user is on the login page of the app")
    public void the_user_is_on_the_login_page_of_the_app() {
        String urlActual = Driver.getDriver().getCurrentUrl();
        String urlExpected = ConfigurationReader.getProperty("url");
        Assert.assertEquals(urlExpected,urlActual);

    }
    @When("the user inputs username {string} and passcode {string}")
    public void the_user_inputs_username_and_passcode(String string, String string2) {
        loginPage.userName.sendKeys(string);
        loginPage.password.sendKeys(string2);
    }
    @When("the user clicks the login button")
    public void the_user_clicks_the_login_button() {
        loginPage.submit.click();
    }
    @Then("verify the user is at the home page")
    public void verify_the_user_is_at_the_home_page() {
        String titleActual = Driver.getDriver().getTitle();
        String titleExpected = "Portal";
        Assert.assertTrue(titleActual.contains(titleExpected));
    }
}
