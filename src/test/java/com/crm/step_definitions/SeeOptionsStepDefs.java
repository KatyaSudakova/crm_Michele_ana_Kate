package com.crm.step_definitions;

import com.crm.pages.LoginPage;
import com.crm.pages.SeeOptionPage_Taras;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class SeeOptionsStepDefs {

  LoginPage loginPage =new LoginPage();

    @Given("ser logged in with username as {string} and password as {string}")
    public void ser_logged_in_with_username_as_and_password_as(String username, String password ) {
        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);

    }
    @When("user clicks the user profile")
    public void user_clicks_the_user_profile() {
      Driver MyDriverManager = null;
      WebDriver driver = MyDriverManager.getDriver();
      WebElement loginButton = driver.findElement(By.id("user-block"));
      ((WebElement) loginButton).click();
    }

  @Then("the user see  options")
  public void the_user_see_options() {

    SeeOptionPage_Taras seeOptionPageTaras = null;
    assert seeOptionPageTaras.MyProfile.isDisplayed();
    assert seeOptionPageTaras.EditProfileSettingOption.isDisplayed();
    assert seeOptionPageTaras.ThemesOption.isDisplayed();
    assert seeOptionPageTaras.ConfigureNotificationsOption.isDisplayed();
    assert seeOptionPageTaras.LogOutOption.isDisplayed();

  }




}
