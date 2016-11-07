package talab.steps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static talab.utils.Utils.getRandomName;

/**
 * Created by Shkolik on 05.11.2016.
 */
public class Steps {
    private WebDriver driver;

    private static final String DRIVER_PATH = "src\\test\\resources\\chromedriver.exe";
    private static final String URL_LOGIN = "https://github.com/login";

    private static final String LOGIN_PATH = "login_field";
    private static final String PASS_PATH = "password";
    private static final String SIGN_IN_BUTOON_PATH = "//div[@class='auth-form-body mt-3']/input[@name='commit']";
    private static final String ACCOUNT_ICON_PATH = "//a[@class='header-nav-link name tooltipped tooltipped-sw js-menu-target']";
    private static final String LOGINED_AS_PATH = "//div[@class='dropdown-header header-nav-current-user css-truncate']/strong[@class='css-truncate-target']";

    private static final String NEW_REP_PATH = "New repository";
    private static final String REP_NAME_PATH = "repository_name";
    private static final String REP_DESCRIPTION_PATH = "repository_description";
    private static final String README_CHECK = "repository_auto_init";
    private static final int NUMBER_OF_SYMBOLS_FOR_LOGIN = 5;
    public String REPO_NAME;
    private static final int NUMBER_OF_SYMBOLS_FOR_DESCRRIPTION = 10;
    private static final String CREATE_REPO_PATH = ".//div[@class='with-permission-fields']/button[@type='submit']";
    private static final String BODY_PATH = "//body";
    private static final String JUST_CREATED_REPO_NAME = "//div[@class='container repohead-details-container']//strong[@itemprop='name']/a";


    public void inItBrowser(){
        System.setProperty("webdriver.chrome.driver", DRIVER_PATH);
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void closeBrowser(){
        this.driver.close();
    }

    public void login(String login, String password){
        driver.get(URL_LOGIN);
        driver.findElement(By.id(LOGIN_PATH)).clear();
        driver.findElement(By.id(LOGIN_PATH)).sendKeys(login);

        driver.findElement(By.id(PASS_PATH)).clear();
        driver.findElement(By.id(PASS_PATH)).sendKeys(password);

        driver.findElement(By.xpath(SIGN_IN_BUTOON_PATH)).click();
    }

    public String getLoggedInUserName(){
        WebElement element =  driver.findElement(By.xpath(ACCOUNT_ICON_PATH));
        element.click();
        String login = driver.findElement(By.xpath(LOGINED_AS_PATH)).getText();

        driver.findElement(By.xpath(BODY_PATH)).click();
        driver.navigate().refresh();
        return login;
    }


    public void createRepo(){
        driver.findElement(By.linkText(NEW_REP_PATH)).click();
        REPO_NAME = getRandomName(NUMBER_OF_SYMBOLS_FOR_LOGIN);
        driver.findElement(By.id(REP_NAME_PATH)).sendKeys(REPO_NAME);
        driver.findElement(By.id(REP_DESCRIPTION_PATH)).sendKeys(getRandomName(NUMBER_OF_SYMBOLS_FOR_DESCRRIPTION));
        driver.findElement(By.id(README_CHECK)).click();
        driver.findElement(By.xpath(CREATE_REPO_PATH)).click();
    }

    public String getJustCreatedRepoName(){
        return driver.findElement(By.xpath(JUST_CREATED_REPO_NAME)).getText();
    }
}
