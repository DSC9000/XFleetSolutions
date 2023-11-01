package com.XFleetSolutions.step_definitions;

import io.cucumber.java.en.Then;

import java.util.List;

public class DataTable_StepDefs {
    @Then("user should see below list")
    public void user_should_see_below_list(List<String>each) {
        for (String eachWord:each
             ) {
            System.out.println(eachWord);
        }
    }

}
