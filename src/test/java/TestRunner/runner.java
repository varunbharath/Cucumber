package TestRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features={"src\\test\\java\\FeatureFile\\"},
        dryRun=false,

        glue = {"LoginSteps","Hooks"},

        monochrome = true,
        plugin = {"pretty",
                "html:report/Cucumber-results.html",
                "json:report/Cucumber/result.json",
                "junit:report/Cucumber/result.xml"})




        public class runner extends AbstractTestNGCucumberTests  {
}
