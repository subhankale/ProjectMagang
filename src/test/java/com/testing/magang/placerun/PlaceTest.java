package com.testing.magang.placerun;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/main/resources/features"},
        glue = {"com.testing.magang"},
        plugin = {"pretty", "html:target/report-cucumber-webjc.html", "json:target/cucumber-webjc.json"}
)

public class PlaceTest extends AbstractTestNGCucumberTests {
}
