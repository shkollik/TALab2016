package ua.epam;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Vladyslav_Shkola on 9/13/2016.
 */
public class AriphmeticOperationTest {
    @Test
    public void testAdd() throws Exception {
        AriphmeticOperation a = new AriphmeticOperation();
        double result = a.add(2,2);
        Assert.assertTrue(result == 4);

    }

    @Test
    public void testDeduct() throws Exception {
        AriphmeticOperation a = new AriphmeticOperation();
        double result = a.deduct(2, 2);
        Assert.assertFalse(result == 2);
    }

    @Test
    public void testMult() throws Exception {
        AriphmeticOperation a = new AriphmeticOperation();
        double result = a.mult(2, 2);
        if(result != 4) Assert.fail();
    }

    @Test
    public void testDiv() throws Exception {
        AriphmeticOperation a = new AriphmeticOperation();
        double result = a.div(2, 2);
        if(result != 1) Assert.fail();
    }

}