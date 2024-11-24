package basetest;

import exceptions.CustomWebDriverException;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SingleDriver {

    private static SingleDriver singleDriver = null;

    private WebDriver driver;

    private SingleDriver() {

    }

    public void generateWebDriver(String browser) {
        if(browser.equalsIgnoreCase("chrome")) {
            try {
                WebDriverManager.chromedriver().clearDriverCache().setup();
                WebDriverManager.chromedriver().clearResolutionCache().setup();
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                //options.addArguments("headless");
                driver = new ChromeDriver(options);
            } catch (CustomWebDriverException e) {
                System.out.println("Custom Exception caught when launching chrome: " + e.getMessage());
            }

        } else if(browser.equalsIgnoreCase("edge")) {

            try {
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
            } catch (CustomWebDriverException e) {
                System.out.println("Custom Exception caught when launching edge: " + e.getMessage());
            }
        } else {
            try {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            }catch (CustomWebDriverException e) {
                System.out.println("Custom Exception caught when launching firefox: " + e.getMessage());
            }

        }
    }

    public static SingleDriver getInstanceOfSingleDriver(String browser) {
        if(singleDriver == null) {
            singleDriver = new SingleDriver();
        }
        singleDriver.generateWebDriver(browser);

        return singleDriver;
    }

    public WebDriver getDriver() {
        return driver;
    }
}
