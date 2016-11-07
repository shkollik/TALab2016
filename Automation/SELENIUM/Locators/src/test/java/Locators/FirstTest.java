package Locators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;

/**
 * Created by Vladyslav_Shkola on 11/4/2016.
 */
public class FirstTest {
    private WebDriver driver;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src\\test\\java\\resources\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void testAddItemToBasket(){
        driver.get("http://screwfix.com");
        driver.findElement(By.id("firstLevelCat_0")).click();
        driver.findElement(By.id("sub_category_local_nav_link_1")).click();
        driver.findElement(By.id("sub_category_local_nav_link_1")).click();
        driver.findElement(By.id("product_description_1")).click();
        driver.findElement(By.id("product_add_to_trolley_image")).click();
        driver.findElement(By.linkText("Checkout Now")).click();

        //driver.findElement(By.linkText("Remove")).click();

        Assert.assertTrue(isPresent(By.id("delivery_tab_content")));


    }

    public boolean isPresent(By by){
        return !(driver.findElements(by).size()==0);
    }

    @AfterClass
    public void clearDown(){
        driver.quit();
    }


}
