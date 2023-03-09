package com.crm.step_definitions;

import com.crm.pages.LoginPage_Douglas;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US02_LoginFeatures_StepDefs {

    LoginPage_Douglas US02LoginPage = new LoginPage_Douglas();
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
