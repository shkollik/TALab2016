package steps;

import base.BaseUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import pages.LoginPage;

/**
 * Created by Shkolik on 23.11.2016.
 */
public class LoginSeleniumStep extends BaseUtil{
    public BaseUtil base;

    public static final String URL = "http://executeautomation.com/demosite/Login.html";
    //public static final String URL = "http://fcdnipro.com";

    public static final String HEADER_TEXT = "Execute Automation Selenium Test Site";


    public LoginSeleniumStep(BaseUtil base) {
        this.base = base;
    }

    @Given("^I go to the login page$")
    public void iGoToTheLoginPage() throws Throwable {
        base.driver.get(URL);
    }

    @When("^I signs in with credentials: ([^\"]*) and ([^\"]*)$")
    public void iEnterCredentials(String login, String pass) throws Throwable {
        LoginPage loginPage = new LoginPage(base.driver);
        loginPage.login(login, pass);

    }

    @And("^I click button login$")
    public void iClickButtonLogin() throws Throwable {
        LoginPage loginPage = new LoginPage(base.driver);

        loginPage.clickLogin();
    }

    @Then("^I should get to the userform page$")
    public void iShouldGetToTheUserformPage() throws Throwable {
        LoginPage loginPage = new LoginPage(base.driver);

        Assert.assertTrue(loginPage.header.getText().toLowerCase().
                equals(HEADER_TEXT.toLowerCase()));
    }
}
