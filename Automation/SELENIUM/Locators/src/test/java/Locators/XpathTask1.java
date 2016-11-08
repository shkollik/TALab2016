package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import utils.Driver;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Vladyslav_Shkola on 11/7/2016.
 */
public class XpathTask1 {
    private static final String URL = "http://docs.seleniumhq.org/download";
    private static final String SECOND_H3_LINK = "//div[@id='mainContent']/h3[2]";
    private static final String EXPECTED_STRING = "Server";
    private static final String FIRST_TABLE = "//*[@id='mainContent']/table[1]";
    private static final String SECOND_TABLE = "//*[@id='mainContent']/table[2]";
    private static final String STRING_FOR_SEARCH = "RUBY";
    private boolean tableContainsRuby = false;

    @BeforeClass
    public void setUp(){
        Driver.getDriver();
    }

    @AfterClass
    public void tearDown(){
        Driver.getDriver().quit();
    }

    @Test
    public void testSecondH3ContainsServerString(){
        Driver.getDriver().get(URL);
        String actualString = Driver.getDriver().findElement(By.xpath(SECOND_H3_LINK)).getText();
        Assert.assertTrue(actualString.contains(EXPECTED_STRING));
    }

    @Test
    public void testFirstTableContainsRuby(){
        Driver.getDriver().get(URL);
        Assert.assertTrue(tableContainsStringRuby(getTableRows(FIRST_TABLE)));
    }

    @Test
    public void testSecondTableContainsRuby(){
        Driver.getDriver().get(URL);
        Assert.assertFalse(tableContainsStringRuby(getTableRows(SECOND_TABLE)));
    }

    private List<WebElement> getTableRows(String tablePath){
        WebElement table = Driver.getDriver().findElement(By.xpath(tablePath));
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        return rows;
    }

    private boolean tableContainsStringRuby(List<WebElement> rows){
        for(WebElement element : rows){
            if(element.getText().toLowerCase().contains(STRING_FOR_SEARCH.toLowerCase())){
                tableContainsRuby = true;
            }
        }
        return tableContainsRuby;
    }



}
