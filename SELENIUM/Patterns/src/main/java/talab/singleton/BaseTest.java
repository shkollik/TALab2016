package talab.singleton;

import org.junit.AfterClass;
import org.junit.BeforeClass;

/**
 * Created by Vladyslav_Shkola on 10/19/2016.
 */
public class BaseTest {
    @BeforeClass
    public static void  setup() throws Exception {
        Driver.initialize(DriverPick.Chrome);
    }

    @AfterClass
    public static void tearDown(){
        Driver.quit();
    }
}
