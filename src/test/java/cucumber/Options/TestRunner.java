package cucumber.Options;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/createApi.feature",
        plugin = {"json:target/jsonReports/cucumber-reports.json", "html:target/cucumber-reports/cucumber-report.html"},
        glue = {"stepDefinations"})
public class TestRunner
{

}

