package steps;

import base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Shkolik on 23.11.2016.
 */
public class Hook extends BaseUtil{

    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void initializeTest(){
        System.out.println("Opening the browser");
        System.setProperty("webdriver.chrome.driver", "src\\test\\java\\resources\\drivers\\chromedriver.exe");
        base.driver = new ChromeDriver();
        base.driver.manage().window().maximize();
    }

    @After
    public void tearDownTest(Scenario scenario){
        if(scenario.isFailed()){
            //Take screenshot
            base.driver.quit();
        }
    }
}
