package com.crm.step_definitions;

import com.crm.pages.US51_HomePage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US51_StepDef {

    US51_HomePage us51HomePage = new US51_HomePage();

    @Then("verify the users see desktops options")
    public void verifyTheUsersSeeDesktopsOptions() {
        Assert.assertTrue(us51HomePage.macOs.isDisplayed());
        Assert.assertTrue(us51HomePage.windows.isDisplayed());
        Assert.assertTrue(us51HomePage.linux.isDisplayed());
    }
}