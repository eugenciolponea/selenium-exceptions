package pageevents;

import org.testng.Assert;
import utils.ElementHelper;

public class ExceptionsPageEvents {

    ElementHelper element = new ElementHelper();

    public void verifyIfLoaded(String type, String path) {

        Assert.assertTrue(element.isVisible(type, path), "Exceptions Page Title was not displayed");

    }

    public void clickOnButton(String type, String path) {
        element.getWebElement(type, path).click();
    }

    public void addText(String type, String path, String text) {
        element.getWebElement(type, path).sendKeys(text);
    }


    public void waitForElementToBeVisible(String type, String path, int duration) {
        element.elementToBeVisible(type, path, duration);
    }

}
