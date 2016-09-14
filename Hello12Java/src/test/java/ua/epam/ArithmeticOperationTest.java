package ua.epam;

import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

/**
 * Created by Vladyslav_Shkola on 9/13/2016.
 */
public class ArithmeticOperationTest {
    static ArithmeticOperations a;

    @BeforeClass
    public static void runT(){
        a = new ArithmeticOperations();
    }

    @Rule
    public final ExpectedException exp = ExpectedException.none();

    @Rule
    public Timeout time = Timeout.millis(1000);

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

    @Ignore
    @Test
    public void testDiv() throws Exception {
        double result = a.div(2, 2);
        Assert.assertEquals(result, 1.0, 1e-15);
    }

    @Test (expected = ArithmeticException.class)
    public void testDivException() throws Exception {
        a.div(2.0, 0);
    }

    @Test
    public void testDivUsingRule() throws Exception{
        exp.expect(ArithmeticException.class);
        a.div(4.0, 0);
    }

    @Test (timeout = 1000)
    public void testTimeOut(){
        while(true){

        }
    }

}