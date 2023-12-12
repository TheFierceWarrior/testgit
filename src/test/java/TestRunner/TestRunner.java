package TestRunner;


import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@Test
@CucumberOptions(
    features = { 
        "src/test/resources/features" 
    },
    glue = {
        "StepDefinitions"
    },
    tags = "@tag1",
    plugin = {"pretty","html:target/cucumber-reports.html"},
    monochrome = true, // remove unwanted words
    dryRun = false // check if every steps have step definition
)
public class TestRunner extends AbstractTestNGCucumberTests {
}