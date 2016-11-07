package talab.factory;

import org.openqa.selenium.WebDriver;

/**
 * Created by Vladyslav_Shkola on 10/18/2016.
 */
public abstract class WebDriverCreator {
    protected WebDriver driver;

    abstract WebDriver factoryMethod() throws Exception;

}
