package com.spring.cucumber.jupiter.config;

import com.spring.cucumber.jupiter.Application;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Application.class)
@CucumberContextConfiguration
public class CucumberSpringConfiguration {

}
