package com.XFleetSolutions.step_definitions;

import com.XFleetSolutions.pages.Login_page;
import com.XFleetSolutions.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefs {
Login_page loginPage=new Login_page();
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("Login to app in Before method");
    }

    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
      loginPage.dynamicLogin(userType);

    }



}
