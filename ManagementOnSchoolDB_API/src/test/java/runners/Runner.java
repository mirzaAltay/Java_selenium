package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        tags = "@DBNegative",
        glue = "stepdefinitions",
        features = "./src/test/resources/",
        dryRun = false
)

public class Runner {


}