package runner;



import org.junit.AfterClass;
import org.junit.runner.RunWith;


import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/java/features/registration.feature" }, 
				glue = { "stepDefinitions",
				"utility" }, monochrome = true, plugin = { "pretty",
				
				"json:target/cucumber-reports/AutomationReport.json",
				"json:target/cucumber-reports/cucumber.runtime.formatter.JSONFormatter"
				, "html:target/cucumber-reports/report.html"
				
				
				
				}, 
				dryRun = false)//, tags = "@correct or @incorrect")

public class RunTest  {
	
	
}
