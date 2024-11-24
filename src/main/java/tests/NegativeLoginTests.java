package tests;

import basetest.BasePage;
import org.testng.annotations.Test;
import pageevents.HomePageEvents;
import pageevents.LoggedInPageEvents;
import pageevents.LoginPageEvents;
import pageevents.PracticePageEvents;
import pageobject.HomePageObject;
import pageobject.LoggedInPageObject;
import pageobject.LoginPageObject;
import pageobject.PracticePageObject;
import utils.Constants;

public class NegativeLoginTests extends BasePage {

    HomePageEvents homePage = new HomePageEvents();
    PracticePageEvents practicePage = new PracticePageEvents();
    LoginPageEvents loginPage = new LoginPageEvents();
    LoggedInPageEvents loggedInPage = new LoggedInPageEvents();

    @Test
    public void incorrectUsernameTest() {

        //Click on "Practice Button" from the Menu Bar
        homePage.clickOnMenuItem("XPATH", HomePageObject.practiceLink);

        //Verify if "Practice" page is open
        practicePage.verifyIfLoaded("XPATH", PracticePageObject.practicePageTitle);

        //Click on "Test Login" link
        practicePage.clickOnTestLoginLink("XPATH", PracticePageObject.loginLink);

        //Verify if Login Page is visible
        loginPage.verifyIfLoaded("XPATH", LoginPageObject.loginPageTitle);

        //Enter login data
        loginPage.addText("XPATH", LoginPageObject.username, Constants.incorrectUsername);
        loginPage.addText("XPATH", LoginPageObject.password, Constants.password);

        //Press Submit button
        loginPage.clickOnSubmitButton("XPATH", LoginPageObject.submitButton);

        //Verify if Error Message is displayed
        loginPage.verifyIfLoaded("XPATH", LoginPageObject.incorrectMessage);
    }

    @Test
    public void incorrectPasswordTest() {

        //Click on "Practice Button" from the Menu Bar
        homePage.clickOnMenuItem("XPATH", HomePageObject.practiceLink);

        //Verify if "Practice" page is open
        practicePage.verifyIfLoaded("XPATH", PracticePageObject.practicePageTitle);

        //Click on "Test Login" link
        practicePage.clickOnTestLoginLink("XPATH", PracticePageObject.loginLink);

        //Verify if Login Page is visible
        loginPage.verifyIfLoaded("XPATH", LoginPageObject.loginPageTitle);

        //Enter login data
        loginPage.addText("XPATH", LoginPageObject.username, Constants.username);
        loginPage.addText("XPATH", LoginPageObject.password, Constants.incorrectPassword);

        //Press Submit button
        loginPage.clickOnSubmitButton("XPATH", LoginPageObject.submitButton);

        //Verify if Error Message is displayed
        loginPage.verifyIfLoaded("XPATH", LoginPageObject.incorrectMessage);
    }
}
