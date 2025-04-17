package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "html:reports/cucumber.html",
                "json:reports/cucumber.json",
                "junit:target/cucumber-reports/api-test-report.xml",
                "timeline:target/cucumber-reports/timeline",
                "rerun:target/cucumber-reports/rerun.txt"},

        glue = {"stepDef"},
        features = {"src/test/java/features"},
        tags = "@api",
        monochrome = true
)
public class ApiRunner {

}
