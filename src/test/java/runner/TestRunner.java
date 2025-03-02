package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/feature",
        glue = {"org/stepdefs"},
        plugin = {"pretty","html:target/cucumber.","json:cucumber-json"}
)
public class TestRunner {



}
