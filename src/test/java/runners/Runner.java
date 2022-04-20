package runners;

import io.cucumber.java.After;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utils.Driver;

@CucumberOptions(
        features = {"src/test/java/features/WishList.feature"},
        glue = {"stepdefs"},
        plugin = {"pretty"},
       // plugin = {"pretty","json:test-output/cucumber-reports.json"},
        //  plugin = {"pretty","html:test-output/cucumber-reports.html"},
        monochrome = false
)

public class Runner extends AbstractTestNGCucumberTests {


}
