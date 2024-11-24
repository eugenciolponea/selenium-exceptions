package pageevents;

import org.testng.Assert;
import utils.ElementHelper;

public class PracticePageEvents {

    ElementHelper element = new ElementHelper();

    public void verifyIfLoaded(String type, String path) {

        Assert.assertTrue(element.isVisible(type, path), "Practice Page Title was not displayed");

    }

    public void clickOnTestLoginLink(String type, String path) {
        element.getWebElement(type, path).click();
    }
}
