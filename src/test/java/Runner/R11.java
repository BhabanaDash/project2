package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features="Features",
glue="Step_Definations",
tags="@SanityTest or @E2ETest",
//plugin="usage",
plugin= {"pretty","html:target/cucumberReports","json:target/cucumberReports.json","junit:target/cucumberReports.xml"},
//plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
monochrome=true,
dryRun=false

)

public class R11 {

}
