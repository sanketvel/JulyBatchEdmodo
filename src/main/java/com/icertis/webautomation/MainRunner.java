package com.icertis.webautomation;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                features = "src\\test\\java\\com\\icertis\\webautomation\\features",
                glue = "com\\icertis\\webautomation\\stepDef",
                tags = {"@wip" , "~@skip"},
                plugin = {"pretty","html:target_html/html/cucumber.html","json:target_json/cucumber.json"}
        )
public class MainRunner 
{

}
