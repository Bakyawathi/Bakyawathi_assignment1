package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//feature file location and glue = test script package name
@CucumberOptions(features = {"src/test/java/features/Login.feature"},glue = {"stepDefinition"})
public class CucumberRunner extends AbstractTestNGCucumberTests{

}
