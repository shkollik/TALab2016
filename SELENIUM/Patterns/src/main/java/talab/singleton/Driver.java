package talab.singleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import talab.singleton.utils.SetDriver;

import java.util.concurrent.TimeUnit;

import static talab.singleton.utils.SetDriver.setChromeDriver;
import static talab.singleton.utils.SetDriver.setFireFoxDriver;

/**
 * Created by Vladyslav_Shkola on 10/18/2016.
 */
public class Driver {
    public static WebDriver driver = null;

    private Driver() {
    }

    public static void initialize(DriverPick pick) throws Exception {
        if(driver == null){
            if(pick == DriverPick.FireFox) {
                setFireFoxDriver();
                driver = new FirefoxDriver();
            }
            else if(pick == DriverPick.Chrome){
                setChromeDriver();
                driver = new ChromeDriver();
            }
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public static void quit(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }
}
