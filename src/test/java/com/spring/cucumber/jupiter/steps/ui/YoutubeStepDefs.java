package com.spring.cucumber.jupiter.steps.ui;

import com.spring.cucumber.jupiter.pages.BasePage;
import io.cucumber.java8.En;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class YoutubeStepDefs implements En {

    @Autowired
    public BasePage basePage;

    public YoutubeStepDefs() {

        Given("I launch Youtube website", () -> {
            basePage.launchURL();
        });

        When("I search {string} in searchbox", (String searchString) -> {
            basePage.enterQueryIntoYoutubeSearch(searchString);
        });

        When("I click on Search button", () -> {
            basePage.clickSearchButton();
        });

        Then("I should see more than {int} results", (Integer number) -> {
            basePage.verifySearchResultsCount(number);
        });
    }
    
}
