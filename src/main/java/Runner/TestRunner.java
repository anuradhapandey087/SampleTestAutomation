package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions

        //Move Code with InBuild Driver

(
features=	"/Users/ANKIT/eclipse-workspace/TestAutomation/src/main/java/Feature/login.feature",	
glue= {"StepDef"},
tags= {"@TestLogin"},
dryRun=false
)

public class TestRunner {

}
