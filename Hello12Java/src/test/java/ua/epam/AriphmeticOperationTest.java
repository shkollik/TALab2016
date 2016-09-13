package ua.epam;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Vladyslav_Shkola on 9/13/2016.
 */
public class AriphmeticOperationTest {
    AriphmeticOperation a;

    @BeforeClass
    public void runT(){
        a = new AriphmeticOperation();
    }
    @Test
    public void testAdd() throws Exception {
        double result = a.add(2, 2);
        Assert.assertTrue(result == 4);

    }

    @Test
    public void testDeduct() throws Exception {
        double result = a.deduct(2, 2);
        Assert.assertFalse(result == 2);
    }

    @Test
    public void testMult() throws Exception {
        double result = a.mult(2, 2);
        Assert.assertEquals(result, 4.0, 1e-15);
    }

    @Test
    public void testDiv() throws Exception {
        double result = a.div(2, 2);
        Assert.assertEquals(result, 1.0, 1e-15);
    }

}