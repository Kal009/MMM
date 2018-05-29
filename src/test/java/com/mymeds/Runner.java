package com.mymeds;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-html-report","json:target/cucumebr.json","pretty:target/cucumber-pretty.txt"},
        features = "."
)
public class Runner {
}
