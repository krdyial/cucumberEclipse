package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) // Without that we can not run. 
@CucumberOptions(
		//Where is the path of the feature folder
		features = "src\\test\\resources\\features",
		glue = "src\\test\\java\\stepdefinitions", //path of step definitions
		tags = "@wip",
		dryRun = false
)
public class Runner {
	//To run the feature files
	// This runner class is also used to configure and control the framework
	

}
