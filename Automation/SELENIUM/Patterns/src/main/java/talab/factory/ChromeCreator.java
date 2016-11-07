package talab.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import talab.singleton.utils.SetDriverPath;

import static talab.singleton.utils.SetDriverPath.setFireFoxDriver;

/**
 * Created by Vladyslav_Shkola on 10/18/2016.
 */
public class ChromeCreator extends WebDriverCreator{

    WebDriver factoryMethod() throws Exception {
        setFireFoxDriver();
        driver = new FirefoxDriver();
        return driver;
    }
}
