package com.sampleFramework.step_definitions;

import java.util.concurrent.TimeUnit;
import com.sampleFramework.utilities.ConfigurationReader;
import com.sampleFramework.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks {
	
	@Before
	public void setUp() {
		//  a logic that should apply to every scenario
		String url = ConfigurationReader.getProperty("url");
		Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Driver.getDriver().get(url);
		Driver.getDriver().manage().window().maximize();
	}
	
	@After
	public void tearDown(Scenario scenario) {
		
		Driver.closeDriver();
	
	}
	
	
}
