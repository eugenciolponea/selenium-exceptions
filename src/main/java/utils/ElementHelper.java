package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static basetest.BasePage.driver;

public class ElementHelper {

    public List<WebElement> getWebElements(String identifierType, String identifierValue) {

        switch (identifierType) {
            case "XPATH": {
                return driver.findElements(By.xpath(identifierValue));
            }

            case "CSS": {
                return driver.findElements(By.cssSelector(identifierValue));
            }

            case "NAME": {
                return driver.findElements(By.name(identifierValue));
            }

            case "ID": {
                return driver.findElements(By.id(identifierValue));
            }

            default: {
                return null;
            }

        }
    }

    public WebElement getWebElement(String identifierType, String identifierValue) {

        switch (identifierType) {
            case "XPATH": {
                return driver.findElement(By.xpath(identifierValue));
            }

            case "CSS": {
                return driver.findElement(By.cssSelector(identifierValue));
            }

            case "NAME": {
                return driver.findElement(By.name(identifierValue));
            }

            case "ID": {
                return driver.findElement(By.id(identifierValue));
            }

            default: {
                return null;
            }

        }
    }

    public boolean isVisible(String identifierType, String identifierValue) {

        switch (identifierType) {
            case "XPATH": {
                return driver.findElement(By.xpath(identifierValue)).isDisplayed();
            }

            case "CSS": {
                return driver.findElement(By.cssSelector(identifierValue)).isDisplayed();
            }

            case "NAME": {
                return driver.findElement(By.name(identifierValue)).isDisplayed();
            }

            case "ID": {
                return driver.findElement(By.id(identifierValue)).isDisplayed();
            }

            default: {
                return false;
            }

        }

    }

    public WebElement elementToBeVisible(String identifierType, String identifierValue, int duration) {

        switch (identifierType) {
            case "XPATH": {
                return new WebDriverWait(driver, Duration.ofSeconds(duration)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(identifierValue)));
            }

            case "CSS": {
                return new WebDriverWait(driver, Duration.ofSeconds(duration)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(identifierValue)));
            }

            case "NAME": {
                return new WebDriverWait(driver, Duration.ofSeconds(duration)).until(ExpectedConditions.presenceOfElementLocated(By.name(identifierValue)));
            }

            case "ID": {
                return new WebDriverWait(driver, Duration.ofSeconds(duration)).until(ExpectedConditions.presenceOfElementLocated(By.id(identifierValue)));
            }

            default: {
                return null;
            }

        }


    }
}
