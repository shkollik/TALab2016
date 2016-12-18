package com.example.waits;

import com.example.Page;
import com.example.waits.BaseTest;
import com.google.common.base.Function;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.openqa.selenium.By.xpath;

/**
 * Created by Shkolik on 11.12.2016.
 */
public class GoogleTest extends BaseTest {
    @Test
    public void checkSelenide(){
        driver.get("http://google.com");
        driver.findElement(By.name("q")).sendKeys("Selenide", Keys.ENTER);
        System.out.println(driver.findElement(xpath("//div[@class='srg']/div[@class='g'][position()=2]//h3/a")).getText());

        new WebDriverWait(driver, 3).until(ExpectedConditions.
                textToBePresentInElementLocated(xpath("//div[@class='srg']/div[@class='g'][position()=2]//h3/a"), "Selenide"));

        Assert.assertEquals("Selenide",
                driver.findElement(xpath("//div[@class='srg']/div[@class='g'][position()=2]//h3/a")).getText());

        driver.findElement(xpath("//div[@class='srg']/div[@class='g'][position()=2]"))
                .findElement(xpath(".//h3/a")).click();

        new WebDriverWait(driver, 3).until(ExpectedConditions.urlToBe("http://selenide.org/ru/index.html"));

        Assert.assertEquals("http://selenide.org/ru/index.html", driver.getCurrentUrl());

        new WebDriverWait(driver, 5).until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver){
                return driver.findElement(By.xpath("eergrer"));
            }
        });

        Wait<WebDriver> wait = new FluentWait(driver)
                .withTimeout(10, SECONDS)
                .pollingEvery(1, TimeUnit.MILLISECONDS)
                .ignoring(NoSuchElementException.class, NoSuchSessionException.class);

        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath("rvvr"));
            }


        });

        Page page = new Page(driver);

        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeSelected(new Page(driver).results.get(0)));

       // new WebDriverWait(driver, 5).until(CustomCondtitions.nthElementToBaSelected());
//        new WebDriverWait(driver, 4).until(new ExpectedCondition<Boolean>() {
//            public Boolean apply(WebDriver input) {
//                boolean ok = false;
//                if(driver.findElement(By.xpath("ffff")).isDisplayed() && driver.findElement(By.xpath("ffff")).isEnabled()){
//                    ok = true;
//
//
//        });






    }
}
