package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
//import com.cucumber.listener.ExtentCucumberFormatter;


@RunWith(Cucumber.class)
@CucumberOptions(
        features={"src/test/resources/features"},
        tags ={"@testing"},
        glue= {"stepdefinition"},
        dryRun = false,
        plugin =
                { "pretty","json:target/cucumber-reports/AutoumationReport/priscillareports.json",
//              { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",

//                {   "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "json:target/cucumber-report.json",
//                              {"pretty", "html:target/cucumber", "json:target/cucumber.json", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",

                  "html:target/cucumber-reports/reports.html",

        },

        monochrome = true)
public class TestRunner {}
