package locators;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.w3c.css.sac.ConditionFactory;
import utils.Driver;

import java.util.List;

import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static java.util.concurrent.TimeUnit.SECONDS;
import static sun.security.krb5.internal.KDCOptions.with;

/**
 * Created by Vladyslav_Shkola on 11/8/2016.
 */
public class XpathTask2 {
    private static final String URL = "http://demos.telerik.com/aspnet-ajax/dropdownlist/examples/overview/defaultcs.aspx";
    private static final String ARROW = "//span[@class='t-font-icon t-i-arrow-down']";
    private static final String DROPDOWNLIST = "//*[@id='ctl00_ContentPlaceholder1_RadDropDownProducts_DropDown']//li[@class='rddlItem']";
    private static final String BUTTON_GET_DETAILS = "//button[@id='ctl00_ContentPlaceholder1_GetDetails']";
    private static final int PRODUCT_NUMBER = 3;
    private static final String PRODUCT_DESCRIPTION_PATH = "//div[@class='order-summary']//dt[contains(text(), 'Product name')]/following-sibling::*[1]";
    private static final String PRODUCT_NAME = "Chef Anton's Cajun Seasoning";
    private static final String STRING_TO_SEARCH = "To test the behavior";
    private static final String BODY_TAG = "body";
    private WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @BeforeClass
    public void setUp(){
        Driver.getDriver();
    }

    @AfterClass
    public void tearDown(){
        Driver.getDriver().quit();
    }

    @Test
    public void testProductDetailsContainsProductDescription() throws InterruptedException {
        pickProduct(PRODUCT_NUMBER);

        Assert.assertTrue(wait.until((ExpectedConditions.textToBePresentInElementLocated(By.xpath(PRODUCT_DESCRIPTION_PATH), PRODUCT_NAME))));
    }

    @Test
    public void testProductDetailsContainsSpecifiedString() throws InterruptedException {
        pickProduct(PRODUCT_NUMBER);
        wait.until((ExpectedConditions.textToBePresentInElementLocated(By.xpath(PRODUCT_DESCRIPTION_PATH), PRODUCT_NAME)));

        Assert.assertFalse(Driver.getDriver().findElement(By.xpath(PRODUCT_DESCRIPTION_PATH)).getText().
                                                            toLowerCase().contains(STRING_TO_SEARCH.toLowerCase()));

    }

    @Test
    public void testPageContainsSpecifiedString() throws InterruptedException {
        Driver.getDriver().get(URL);
        Assert.assertTrue(Driver.getDriver().findElement(By.tagName(BODY_TAG)).getText().
                toLowerCase().contains(STRING_TO_SEARCH.toLowerCase()));

    }

    private void pickProduct(int number){
        Driver.getDriver().get(URL);
        Driver.getDriver().findElement(By.xpath(ARROW)).click();
        List<WebElement> dropDownList = Driver.getDriver().findElements(By.xpath(DROPDOWNLIST));
        dropDownList.get(number).click();
        WebElement button = Driver.getDriver().findElement(By.xpath(BUTTON_GET_DETAILS));
        button.sendKeys(Keys.ENTER);
    }

//    ExpectedCondition<Boolean> expectation = new
//            ExpectedCondition<Boolean>() {
//                public Boolean apply(WebDriver driver) {
//                    return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");
//                }
//            };
//
//    ExpectedCondition<Boolean> expectation2 = new
//            ExpectedCondition<Boolean>() {
//                public Boolean apply(WebDriver driver) {
//                    return ((JavascriptExecutor) driver).executeScript("return jQuery.active").toString().equals(0);
//                }
//            };


}
