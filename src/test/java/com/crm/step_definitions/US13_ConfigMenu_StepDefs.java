package com.crm.step_definitions;

import com.crm.pages.LoginPage;
import com.crm.pages.MenuPage_Douglas;
import com.crm.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US13_ConfigMenu_StepDefs {

    MenuPage_Douglas menuPage = new MenuPage_Douglas();
    LoginPage loginPage = new LoginPage();

    @Given("the user is logged in with username as {string} and password as {string}")
    public void theUserIsLoggedInWithUsernameAsAndPasswordAs(String username, String password) {
        loginPage.login(username, password);
    }

    @Given("users are on the homepage")
    public void users_are_on_the_homepage() {
        BrowserUtils.sleep(4);
        menuPage.homeButton.click();
    }

    @When("users click the CONFIGURE MENU option")
    public void users_click_the_configure_menu_option() {
        BrowserUtils.sleep(4);
        menuPage.configMenuButton.click();
    }

    @Then("verify the users see below options in menu")
    public void verifyTheUsersSeeBelowOptionsInMenu(List<String> expectedOptions) {
        List<String> actualItemsAsString = new ArrayList<>();
        for (WebElement each : menuPage.configMenuItems){
            actualItemsAsString.add(each.getText());
        }
        actualItemsAsString.add(2,menuPage.removeCurrentButton.getText());
        Assert.assertEquals(expectedOptions, actualItemsAsString);
    }
}
