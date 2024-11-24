package pageevents;

import utils.ElementHelper;

public class HomePageEvents {

    ElementHelper element = new ElementHelper();

    public void clickOnMenuItem (String type, String path) {
        element.getWebElement(type, path).click();
    }


}
