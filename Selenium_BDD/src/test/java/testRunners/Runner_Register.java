package testRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features=".//Features/Register.feature",
				glue="stepDefinitions",
				tags= "@Smoketest, @Regressiontest")
public class Runner_Register {

}
