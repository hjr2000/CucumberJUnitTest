package com.example;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.Before;

public class MyStepdefs {

    @Before
    public void before() {
        System.out.println("-------------BEFORE STUFF!------------------");
    }

    @Given("I have a precondition")
    public void iHaveAPrecondition() {
        System.out.println("++++++++++Precondition");
    }

    @Then("the correct result is found")
    public void theCorrectResultIsFound() {
        System.out.println("++++++++++Correct result found");
    }
}
