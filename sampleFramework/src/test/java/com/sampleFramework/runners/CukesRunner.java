package com.sampleFramework.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class) 
@CucumberOptions(
		tags= "@test1",
		features = "classpath:features",
		glue = "com/sampleFramework/step_definitions",
		dryRun = false,
		plugin = {
				"json:target/cucumber.json",
				"pretty",
				"html:target/html",
				"junit:target/cucumber.xml"
				
		}
		
		)


public class CukesRunner {

}
