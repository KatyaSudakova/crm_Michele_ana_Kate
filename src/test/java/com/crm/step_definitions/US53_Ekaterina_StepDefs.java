package com.crm.step_definitions;

import com.crm.pages.US53_Ekaterina_HomePage;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US53_Ekaterina_StepDefs {

    US53_Ekaterina_HomePage us53_homePage = new US53_Ekaterina_HomePage();

    @Then("user should to click to MORE tab")
    public void userShouldToClickToMORETab() {
        us53_homePage.tabMORE.click();
    }

    @Then("verify the user view all options under the MORE tab")
    public void verifyTheUserViewAllOptionsUnderTheMORETab(List<String> expectedOpt) {

        Select moreTab = new Select(us53_homePage.tabMORE); // actual all the options
        List<WebElement> actOPt_WebElement = moreTab.getOptions();
        List<String> actualOpt_String = new ArrayList<>();
        for (WebElement each : actOPt_WebElement) {
            actualOpt_String.add(each.getText());
        }
        Assert.assertEquals(expectedOpt, actualOpt_String);




    }


    //        Select optionsMoreTab = new Select(us53_homePage.tabMORE);
//        String actual = optionsMoreTab.getFirstSelectedOption().getText();
//        String expected = "File";
//        Assert.assertEquals(expected, actual);

        /*
        List<WebElement> options = driver.findElements(By.linkText("//span[@id=\"feed-add-post-form-link-text\"]"));

        String actualOp = "";
        for ( WebElement element : options ) {
            actualOp = element.getText();
        }

        List<String> expectedResult = Arrays.asList("File", "Appreciation", "Announcement","Workflow");


        Assert.assertEquals(expectedResult.toString(), actualOp);

         */



        /*
        List<WebElement> allOptions = ;
        int sizeOpt = allOptions.size();
        String actualResult =""; // 4 options text
        for(int i =0; i < sizeOpt ; i++){
            actualResult = allOptions.get(i).getText();
        }


        List<String> expectedResult = Arrays.asList("File", "Appreciation", "Announcement","Workflow");

        Assert.assertEquals(expectedResult.toString(), actualResult);

         */




    




    }

