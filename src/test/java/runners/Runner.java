package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {"html:target/cucumber-reports.html",
                    "json:target/json-reports/cucumber.json",
                    "junit:target/xml-report/cucumber.xml"
            },
            features = {"src/test/resources/features"},
            glue = {"stepdefinitions"},
            tags ="@ae",                   //"@regression and @smoke"

            dryRun = false


    )
    public class Runner {
        public Runner() {
        }
}
