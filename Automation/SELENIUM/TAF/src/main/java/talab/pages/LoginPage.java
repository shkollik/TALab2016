package talab.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import talab.utils.Driver;
import talab.utils.Utils;

import java.util.concurrent.TimeUnit;

/**
 * Created by Shkolik on 06.11.2016.
 */
public class LoginPage {

    private static final String DRIVER_PATH = "src\\test\\resources\\chromedriver.exe";
    private static final String URL_LOGIN = "https://github.com/login";

    public String loginName;

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "login_field")
    private WebElement loginField;

    @FindBy(id = "password")
    private WebElement passField;

    @FindBy(xpath = "//div[@class='auth-form-body mt-3']/input[@name='commit']")
    private WebElement signInButton;

    @FindBy(xpath = "//a[@class='header-nav-link name tooltipped tooltipped-sw js-menu-target']")
    private WebElement accountIcon;

    @FindBy(xpath = "//div[@class='dropdown-header header-nav-current-user css-truncate']/strong[@class='css-truncate-target']")
    private WebElement actualLogin;

    @FindBy(xpath = "//body")
    private WebElement body;

public void openPage(){
    Driver.driver.get(URL_LOGIN);
}


    public void logIn(String name, String pass) {
        loginField.clear();

        loginField.sendKeys(name);

        passField.clear();
        passField.sendKeys(pass);

        signInButton.click();
    }

    public String getLoggedInUserName() {
        accountIcon.click();

        loginName = actualLogin.getText();
        System.out.println(loginName);

        body.click();

        return loginName;
    }


}
