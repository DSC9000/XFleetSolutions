package com.XFleetSolutions.step_definitions;

import com.XFleetSolutions.pages.BasePage;
import com.XFleetSolutions.pages.Dashboard_page;
import com.XFleetSolutions.pages.Login_page;
import com.XFleetSolutions.utilities.BrowserUtils;
import com.XFleetSolutions.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Odom_Filter_StepDefs extends Login_page {
    Dashboard_page dashPage=new Dashboard_page();
    @Given("user selects the vehicle option from Fleet tab")
    public void user_selects_the_vehicle_option_from_fleet_tab() {

       navigateToModule("Fleet","Vehicles");

    }

    @And("user enables Filters  button")
    public void user_Enables_Filters_Button() {
        if(!dashPage.enableFiltersButton.isSelected()){
            dashPage.enableFiltersButton.click();
        }
        Assert .assertTrue(dashPage.manageFilterBtn.isDisplayed());
    }

    @And("user enters : Last Odometer in searchBox")
    public void userEntersLastOdometerInSearchBox() {
        dashPage.manageFilterBtn.click();
        dashPage.searchBox.sendKeys("Last Odometer");
        dashPage.lastOdometerChkbox.click();

    }

    @Then("user should see Last Odometer button on page")
    public void userShouldSeeLastOdometerButtonOnPage() {
        Assert.assertTrue(dashPage.lastOdometerDropButton.isDisplayed());
        dashPage.manageFilterBtn.click();
    }

    @Then("user should see all options")
    public void userShouldSeeAllOptions(List<String> expectedOptions) {
        System.out.println(expectedOptions);
        dashPage.manageFilterBtn.click();
        dashPage.lastOdometerDropButton.click();

       Actions actions =new Actions(Driver.getDriver());
       actions.moveToElement(dashPage.optionEnabler).click().perform();
       actions.moveToElement(dashPage.allOptions).perform();










    }
}
