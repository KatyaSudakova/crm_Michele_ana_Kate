package com.crm.step_definitions;

import com.crm.pages.CompanyPage;
import com.crm.pages.LoginPage;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US14_CompanyPage_StepDefs {

    LoginPage loginPage = new LoginPage();
    CompanyPage companyPage = new CompanyPage();

    @Given("the user is on the homepage")
    public void the_user_is_on_the_homepage() {
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("hr_username"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("hr_password"));
        loginPage.submit.click();
        String titleActual = Driver.getDriver().getTitle();
        String titleExpected = "Portal";
        Assert.assertTrue(titleActual.contains(titleExpected));
    }

    @When("the user clicks the Company module")
    public void the_user_clicks_the_company_module() {
        companyPage.CompanyLink.click();
    }
    @Then("the user can see the following {int} options")
    public void the_user_can_see_the_following_options(Integer int1, List<String> companyMenu) {
        Assert.assertTrue(int1 == 7);
        //Assert.assertTrue(companyPage.OfficialInformation.isDisplayed());

        List<WebElement> links = new ArrayList<>();

        links.add(companyPage.OfficialInformation);
        links.add(companyPage.OurLife);
        links.add(companyPage.AboutCompany);
        links.add(companyPage.PhotoGallery);
        links.add(companyPage.Video);
        links.add(companyPage.Career);
        links.add(companyPage.BusinessNews);


        for (int i = 0; i < int1; i++) {
            Assert.assertEquals( companyMenu.get(i), links.get(i).getText() );
            System.out.println(links.get(i).getText()+" is displayed as expected");
        }

    }
}
