package com.crm.step_definitions;

import com.crm.pages.LoginPage_Michele;
import com.crm.pages.ProfilePage_Michele1;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfilePageStepDefs {



    @When("the user clicks the user profile")
    public void the_user_clicks_the_user_profile() {
        LoginPage_Michele loginpage = new LoginPage_Michele();
        loginpage.userBlock.click();
        loginpage.myProfileOption.click();

    }
    @Then("the user sees these options- General Drive Tasks Calendar Conversations")
    public void the_user_sees_these_options_general_drive_tasks_calendar_conversations() {
     ProfilePage_Michele1 profilePage = new ProfilePage_Michele1();
     profilePage.menuItem_General.isDisplayed();
     profilePage.menuItem_Drive.isDisplayed();
     profilePage.menuItem_Tasks.isDisplayed();
     profilePage.menuItem_Calendar.isDisplayed();
     profilePage.menuItem_Conversations.isDisplayed();
    }

}
