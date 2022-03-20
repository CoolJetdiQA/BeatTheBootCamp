package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(		
		plugin = {	"pretty", "json:target/JSON_Reports/Cucumber.json",
					"junit:target/Cucumber_Reports/Cucumber.xml",
					"html:target/HTML_Reports/index.html"},
		dryRun = false,
		features = {"features/ikeahome.feature"},
		glue = {"stepdefinitions"},
		monochrome = true
		) 

// Similar to TestNG XML file
public class CuckesRunner {

}
