package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

    @Given("Initialize")
    public void initialize() {
       System.out.println("Initialized");

    }
    @When("LogIN")
    public void log_in() {
        System.out.println("Logged In");

    }
    @Then("Validate")
    public void validate() {
        System.out.println("Validated");

    }

}
