package talab.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Vladyslav_Shkola on 10/18/2016.
 */
public class ChromeCreator extends WebDriverCreator{
    private static String pathToChromeDriver = "C:\\Users\\Vladyslav_Shkola\\IdeaProjects\\Patterns\\src\\main\\java\\talab\\resources\\resources.drivers\\chromedriver.exe";

    WebDriver factoryMethod() {
        System.setProperty("webdriver.gecko.driver",  pathToChromeDriver);
        driver = new FirefoxDriver();
        return driver;
    }
}
