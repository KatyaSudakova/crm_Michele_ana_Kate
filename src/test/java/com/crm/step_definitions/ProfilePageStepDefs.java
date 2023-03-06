package com.crm.step_definitions;

import com.crm.pages.LoginPage;
import com.crm.pages.ProfilePage;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfilePageStepDefs {



    @When("the user clicks the user profile")
    public void the_user_clicks_the_user_profile() {
        LoginPage loginpage = new LoginPage();
        loginpage.userBlock.click();
        loginpage.myProfileOption.click();

    }
    @Then("the user sees these options- General Drive Tasks Calendar Conversations")
    public void the_user_sees_these_options_general_drive_tasks_calendar_conversations() {
     ProfilePage profilePage = new ProfilePage();
     profilePage.menuItem_General.isDisplayed();
     profilePage.menuItem_Drive.isDisplayed();
     profilePage.menuItem_Tasks.isDisplayed();
     profilePage.menuItem_Calendar.isDisplayed();
     profilePage.menuItem_Conversations.isDisplayed();
    }

}
