package com.crm.step_definitions;

import com.crm.pages.LogOutPage_Yana;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogOutStepDefs {

    LogOutPage_Yana logOut = new LogOutPage_Yana();

    @When("the user clicks the profile icon")
    public void the_user_clicks_the_profile_icon() {
    logOut. profileIcon.click();
    }
    @Then("the user sees the Log out option")
    public void the_user_sees_the_log_out_option() {
    logOut.LogOutOption.isDisplayed();
    }
    @Then("the user clicks the Log out")
    public void the_user_clicks_the_log_out() {
    logOut.LogOutOption.click();
    }
    @Then("the user can see the Authorization field")
    public void the_user_can_see_the_authorization_field() {
    logOut.LoginPage.isDisplayed();
    }

}
