package ua.talab;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import ua.epam.Model;

import static org.junit.Assert.*;

/**
 * Created by Vladyslav_Shkola on 9/14/2016.
 */

public class ModelTest {
    static Model model;
    
    private int min = 0;
    private int max = 100;
    private int customerInputThatIsMoreThanSecretValue = 74;
    private int customerInputThatIsLessThanSecretValue = 34;
    private int secretValue = 56;

    @BeforeClass
    public static void initialize(){
        model = new Model();
    }

    @Test
    public void testRandomize() throws Exception {
        int res  = model.randomize(min, max);

       Assert.assertTrue(res > 0 && res < 100);
    }

    @Test
    public void testRangeModificationWhenCustomerInputIsMoreThanSecretValue() throws Exception {
        model.modifyRange(customerInputThatIsMoreThanSecretValue, min, max, secretValue);

        Assert.assertEquals(model.getMaxBarrier(), customerInputThatIsMoreThanSecretValue - 1);

    }

      @Test
    public void testRangeModificationWhenCustomerInputIsLessThanSecretValue() throws Exception {
        model.modifyRange(customerInputThatIsLessThanSecretValue, min, max, secretValue);

        Assert.assertEquals(model.getMinBarrier(), customerInputThatIsLessThanSecretValue + 1);

    }
}
