package talab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Shkolik on 05.11.2016.
 */
public class FirstTest {
    private WebDriver driver;
    private static final String DRIVER_PATH = "src\\test\\resources\\chromedriver.exe";
    private static final String URL = "https://github.com/login";
    private static final String LOGIN_PATH = "login_field";
    private static final String LOGIN = "shkollik";
    private static final String PASS_PATH = "password";
    private static final String PASS = "Vados307";
    private static final String SIGN_IN_BUTOON_PATH = "//div[@class='auth-form-body mt-3']/input[@name='commit']";

    String ACCOUNT_ICON_PATH = "//a[@class='header-nav-link name tooltipped tooltipped-sw js-menu-target']";
    String LOGINED_AS_PATH = "//div[@class='dropdown-header header-nav-current-user css-truncate']/strong[@class='css-truncate-target']";

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", DRIVER_PATH);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterClass
    public void clearDown(){
        driver.close();
    }

    @Test
    public void stupidTest(){
        driver.get(URL);
        driver.findElement(By.id(LOGIN_PATH)).clear();
        driver.findElement(By.id(LOGIN_PATH)).sendKeys(LOGIN);

        driver.findElement(By.id(PASS_PATH)).clear();
        driver.findElement(By.id(PASS_PATH)).sendKeys(PASS);

        driver.findElement(By.xpath(SIGN_IN_BUTOON_PATH)).click();

        driver.findElement(By.xpath(ACCOUNT_ICON_PATH)).click();
        String loginedAs = driver.findElement(By.xpath(LOGINED_AS_PATH)).getText();
        System.out.println(loginedAs);

        Assert.assertEquals(loginedAs, LOGIN, "Incorrect credentials");

    }

}
