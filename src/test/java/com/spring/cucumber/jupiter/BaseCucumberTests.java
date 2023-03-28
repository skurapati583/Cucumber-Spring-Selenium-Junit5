package com.spring.cucumber.jupiter;

import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
import org.springframework.test.annotation.DirtiesContext;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("com/spring/cucumber/jupiter/features")
public class BaseCucumberTests {

}
