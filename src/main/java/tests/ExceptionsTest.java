package tests;

import basetest.BasePage;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.testng.annotations.Test;
import pageevents.ExceptionsPageEvents;
import pageevents.HomePageEvents;
import pageevents.PracticePageEvents;
import pageobject.ExceptionPageObject;
import pageobject.HomePageObject;
import pageobject.PracticePageObject;

public class ExceptionsTest extends BasePage {

    HomePageEvents homePage = new HomePageEvents();
    PracticePageEvents practicePage = new PracticePageEvents();
    ExceptionsPageEvents exceptionsPage = new ExceptionsPageEvents();

    @Test(expectedExceptions = NoSuchElementException.class)
    public void noSuchElementException() {
        //Click on "Practice Button" from the Menu Bar
        homePage.clickOnMenuItem("XPATH", HomePageObject.practiceLink);

        //Verify if "Practice" page is open
        practicePage.verifyIfLoaded("XPATH", PracticePageObject.practicePageTitle);

        //Click on "Test Exception" link
        practicePage.clickOnTestLoginLink("XPATH", PracticePageObject.exceptionsLink);

        //Verify if exception page is displayed
        exceptionsPage.verifyIfLoaded("XPATH", ExceptionPageObject.title);

        //Click on Add button
        exceptionsPage.clickOnButton("XPATH", ExceptionPageObject.addButton);

        //Verify if Row 2 is visible
        exceptionsPage.verifyIfLoaded("XPATH", ExceptionPageObject.inputFieldRow2);
    }

    @Test(expectedExceptions = ElementNotInteractableException.class)
    public void elementNotInteractableException() {
        //Click on "Practice Button" from the Menu Bar
        homePage.clickOnMenuItem("XPATH", HomePageObject.practiceLink);

        //Verify if "Practice" page is open
        practicePage.verifyIfLoaded("XPATH", PracticePageObject.practicePageTitle);

        //Click on "Test Exception" link
        practicePage.clickOnTestLoginLink("XPATH", PracticePageObject.exceptionsLink);

        //Verify if exception page is displayed
        exceptionsPage.verifyIfLoaded("XPATH", ExceptionPageObject.title);

        //Click on Add button
        exceptionsPage.clickOnButton("XPATH", ExceptionPageObject.addButton);

        //Wait for element to be visible
        exceptionsPage.waitForElementToBeVisible("XPATH", ExceptionPageObject.inputFieldRow2, 15);

       //Add text to Row 2(second input field)
        exceptionsPage.addText("XPATH", ExceptionPageObject.inputFieldRow2, "Burger");

        //Click on Save button
        exceptionsPage.clickOnButton("NAME", "Save");

    }

    @Test(expectedExceptions = TimeoutException.class)
    public void timeoutException() {
        //Click on "Practice Button" from the Menu Bar
        homePage.clickOnMenuItem("XPATH", HomePageObject.practiceLink);

        //Verify if "Practice" page is open
        practicePage.verifyIfLoaded("XPATH", PracticePageObject.practicePageTitle);

        //Click on "Test Exception" link
        practicePage.clickOnTestLoginLink("XPATH", PracticePageObject.exceptionsLink);

        //Verify if exception page is displayed
        exceptionsPage.verifyIfLoaded("XPATH", ExceptionPageObject.title);

        //Click on Add button
        exceptionsPage.clickOnButton("XPATH", ExceptionPageObject.addButton);

        //Verify timeout
        exceptionsPage.waitForElementToBeVisible("XPATH",  ExceptionPageObject.inputFieldRow2, 2);
    }

    /*
    @Test(expectedExceptions = StaleElementReferenceException.class)
    public void staleElementReferenceException() {
        //Click on "Practice Button" from the Menu Bar
        homePage.clickOnMenuItem("XPATH", HomePageObject.practiceLink);

        //Verify if "Practice" page is open
        practicePage.verifyIfLoaded("XPATH", PracticePageObject.practicePageTitle);

        //Click on "Test Exception" link
        practicePage.clickOnTestLoginLink("XPATH", PracticePageObject.exceptionsLink);

        //Verify if exception page is displayed
        exceptionsPage.verifyIfLoaded("XPATH", ExceptionPageObject.instructions);

        //Click on Add button
        exceptionsPage.clickOnButton("XPATH", ExceptionPageObject.addButton);
        exceptionsPage.waitForElementToBeVisible("XPATH", ExceptionPageObject.inputFieldRow2, 15);

        //Verify if instructions visible
        exceptionsPage.verifyIfLoaded("XPATH", ExceptionPageObject.instructions);
    }

     */
}
