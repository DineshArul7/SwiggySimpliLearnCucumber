package stepDefinitions;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class CucumberHooks {
    Base base=new Base();
    @Before
    public void beforeScenario(Scenario scenario){
        System.out.println("This will run before the Scenario");
        base.initializeDriver();
        base.initializeLogger(scenario.getName());
    }

    @After
    public void afterScenario(){
        System.out.println("This will run after the Scenario");
        base.tearDownDriver();
    }
}
