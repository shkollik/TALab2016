package talab;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import talab.Calculator;
import talab.utils.ExcelUtils;

import java.lang.reflect.Method;

/**
 * Created by Vladyslav_Shkola on 10/31/2016.
 */
public class BaseTest {
    protected Calculator calculator;

    @BeforeClass(alwaysRun = true)
    public void setUp(){
        calculator = new Calculator();
    }
}
