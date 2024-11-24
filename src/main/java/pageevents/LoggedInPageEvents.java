package pageevents;

import org.testng.Assert;
import utils.ElementHelper;

public class LoggedInPageEvents {

    ElementHelper element = new ElementHelper();

    public void verifyIfLoaded(String type, String path) {

        Assert.assertTrue(element.isVisible(type, path), "LoggedIn Page Title was not displayed");

    }

    public void clickOnLogoutButton(String type, String path) {
        element.getWebElement(type, path).click();
    }


}
