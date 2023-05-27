package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin={"html:target\\cucumber-reports.html"},
            features = {"src/test/resources/features"},
            glue = {"stepdefinitions"},
            tags ="@wip",
                    //"@regression and @smoke"
            dryRun = false


    )
    public class Runner {
        public Runner() {
        }
}
