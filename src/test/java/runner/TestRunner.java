package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@Csv",
        features = "src/test/resources/features",
        glue = "step",
        plugin = {"pretty", "html:target/cucumber-report.html"}
)
public class TestRunner {
}
