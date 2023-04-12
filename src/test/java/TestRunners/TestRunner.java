package TestRunners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/org/example/featues",
        glue = {"stepDefinitions"},
        dryRun = false,
        monochrome = true,
        publish = true,
        plugin ={ "html:target/site/cucumber-pretty.html","json:target/jsonReports/cucumber-report.json"})

public class TestRunner {


}
