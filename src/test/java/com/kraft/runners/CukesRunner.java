package com.kraft.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/kraft/step_definitions",
        dryRun = false,
        tags = "@wip"

                )



public class CukesRunner {
}
