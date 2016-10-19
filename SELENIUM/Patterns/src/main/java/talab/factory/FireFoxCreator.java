package talab.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Vladyslav_Shkola on 10/18/2016.
 */
public class FireFoxCreator extends WebDriverCreator{
    private static String pathToGeckoDriver = "C:\\Users\\Vladyslav_Shkola\\IdeaProjects\\Patterns\\src\\main\\java\\talab\\resources\\resources.drivers\\geckodriver.exe";

    WebDriver factoryMethod() {
        System.setProperty("webdriver.gecko.driver",  pathToGeckoDriver);
        driver = new FirefoxDriver();
        return driver;
    }
}
