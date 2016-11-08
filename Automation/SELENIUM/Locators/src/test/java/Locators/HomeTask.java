package locators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.Driver;


import java.util.concurrent.TimeUnit;

/**
 * Created by Vladyslav_Shkola on 11/4/2016.
 */
public class HomeTask {
    private static final String URL = "http://screwfix.com";
    private static final String TOOLS_PATH = "firstLevelCat_0";
    private static final String SUB_CATEGORY_NAV_LINK_1 = "sub_category_local_nav_link_1";
    private static final String PRODUCT_DESCRIPTION_1 = "product_description_1";
    private static final String ADD_TO_BASKET = "product_add_to_trolley_image";
    private static final String CHECKOUT = "Checkout Now";
    private static final String BASKET_PATH = "delivery_tab_content";


    @BeforeClass
    public void setUp(){
        Driver.getDriver();
    }

    @Test
    public void testAddItemToBasket(){
        Driver.getDriver().get(URL);
        Driver.getDriver().findElement(By.id(TOOLS_PATH)).click();
        Driver.getDriver().findElement(By.id(SUB_CATEGORY_NAV_LINK_1)).click();
        Driver.getDriver().findElement(By.id(SUB_CATEGORY_NAV_LINK_1)).click();
        Driver.getDriver().findElement(By.id(PRODUCT_DESCRIPTION_1)).click();
        Driver.getDriver().findElement(By.id(ADD_TO_BASKET)).click();
        Driver.getDriver().findElement(By.linkText(CHECKOUT)).click();

        Assert.assertTrue(isPresent(By.id(BASKET_PATH)));


    }

    public boolean isPresent(By by){
        return !(Driver.getDriver().findElements(by).size()==0);
    }

    @AfterClass
    public void clearDown(){
        Driver.getDriver().quit();
    }


}
