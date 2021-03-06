package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/ColorBackground.feature", glue = {
		"stepDefinitions" }, monochrome = true, plugin = { "pretty", "junit:target/JUnitReports/report.xml",
				"json:target/JSONReports/report.json", "html:target/HtmlReports" })
public class TestRunner {
}
