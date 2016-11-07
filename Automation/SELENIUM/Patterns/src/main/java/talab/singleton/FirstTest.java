package talab.singleton;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static talab.singleton.Driver.initialize;
import static talab.singleton.DriverPick.Chrome;


/**
 * Hello world!
 *
 */
public class FirstTest extends BaseTest{
    private static String url = "http://github.com";

    @Test
    public void testSingleton(){
        Driver.driver.navigate().to(url);
        Driver.driver.findElement(By.linkText("Sign up")).sendKeys(Keys.ENTER);

        Assert.assertTrue(Driver.driver.findElement(By.id("user_login")).isDisplayed());
    }
}
