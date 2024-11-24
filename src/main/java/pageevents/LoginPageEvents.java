package pageevents;

import org.testng.Assert;
import utils.ElementHelper;

public class LoginPageEvents {
    ElementHelper element = new ElementHelper();

    public void verifyIfLoaded(String type, String path) {

        Assert.assertTrue(element.isVisible(type, path), "Login Page Title was not displayed");

    }

    public void clickOnSubmitButton(String type, String path) {
        element.getWebElement(type, path).click();
    }

    public void addText(String type, String path, String text) {
        element.getWebElement(type, path).sendKeys(text);
    }

}
