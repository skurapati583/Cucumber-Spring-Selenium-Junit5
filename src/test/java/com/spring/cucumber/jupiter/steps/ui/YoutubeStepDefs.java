package com.spring.cucumber.jupiter.steps.ui;

import io.cucumber.java8.En;

public class YoutubeStepDefs implements En {
    
    public YoutubeStepDefs() {

        Given("I launch Youtube website", () -> {
            
        });

        When("I search {string} in searchbox", (String searchString) -> {
            
        });

        When("I click on Search button", () -> {
            
        });

        Then("I should see more than {int} results", (Integer number) -> {
            
        });
    }
    
}
