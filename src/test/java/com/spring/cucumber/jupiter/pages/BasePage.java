package com.spring.cucumber.jupiter.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.util.List;

@Component
public class BasePage {

    @Autowired
    public WebDriver driver;

    @Value("${app.url}")
    public String appURL;

    public void launchURL() {
        driver.get(appURL);
    }

    public void enterQueryIntoYoutubeSearch(String term) {
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input#search")));
        element.sendKeys(term);
    }

    public void clickSearchButton() {
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(By.cssSelector("button#search-icon-legacy")));
        element.click();
    }

    public void verifySearchResultsCount(Integer expectedNumber) {
        List<WebElement> elements = new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("div#contents > ytd-video-renderer")));
        System.out.println("List of elements found actually: " + elements.size());
        assert elements.size() > expectedNumber;
    }
}
