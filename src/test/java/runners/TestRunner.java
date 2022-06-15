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
        features = "src/test/resources/features",
<<<<<<< HEAD
        glue = "stepDefinitions",
        tags = "@case2",
=======
        glue = "stepDefinations",
        tags = "@wip",
>>>>>>> c9a7a49d0d5e71f63fc1dd624f515c4a8a4f86d2
        dryRun = false
)
public class TestRunner {

}
