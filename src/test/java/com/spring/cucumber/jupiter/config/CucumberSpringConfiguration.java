package com.spring.cucumber.jupiter.config;

import com.spring.cucumber.jupiter.Application;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

@SpringBootTest(classes = Application.class)
@CucumberContextConfiguration
@DirtiesContext
public class CucumberSpringConfiguration {

}
