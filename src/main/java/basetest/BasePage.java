package basetest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import utils.Constants;

public class BasePage {

    public static WebDriver driver;

    SingleDriver singleDriver;

    //initializare si deschide pagina
    @BeforeTest
    @Parameters("browser")
    public void init(String browser) {

        singleDriver = SingleDriver.getInstanceOfSingleDriver(browser);
        driver = singleDriver.getDriver();
        driver.manage().window().maximize();
        driver.get(Constants.url);
    }

    //close driver
    @AfterTest
    public void kill() {
        driver.quit();
        singleDriver = null;
    }

}
