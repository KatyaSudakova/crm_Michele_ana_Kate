package com.crm.step_definitions;

import com.crm.pages.US02_Douglas_LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US02_Douglas_StepDefs {

    US02_Douglas_LoginPage US02LoginPage = new US02_Douglas_LoginPage();
    @Then("verify there is a {string} message displayed")
    public void verify_there_is_a_message_displayed(String expectedMessage) {
        String actualMessage = US02LoginPage.loginFeatureMessage.getText();
        Assert.assertEquals(expectedMessage,actualMessage);

    }
    @Then("verify the check box is clickable")
    public void verify_the_check_box_is_clickable() {
        US02LoginPage.loginFeatureCheckbox.click();
        Assert.assertTrue(US02LoginPage.loginFeatureCheckbox.isSelected());
    }
}
