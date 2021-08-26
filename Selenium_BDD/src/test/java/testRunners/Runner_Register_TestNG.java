package testRunners;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.CucumberOptions;

@CucumberOptions(features=".//Features/Register.feature",
				glue="stepDefinitions",
				tags= {"@Smoketest","@Regressiontest"})
public class Runner_Register_TestNG extends AbstractTestNGCucumberTests {

}
