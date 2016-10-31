package talab;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Vladyslav_Shkola on 10/31/2016.
 */
public class TestAdditionalOperations extends Configuration{
    @Test(dataProvider = "getDataFromExcel")
    public void testPow(double value, double degree, double expected){
        double result = calculator.pow(value, degree);
        Assert.assertEquals(result, expected);
    }

    @Test(dataProvider = "getDataFromExcel", expectedExceptions = NumberFormatException.class)
    public void testPowMinusDegreeOfZeroValue(double value, double degree){
        calculator.pow(value, degree);

    }

    @Test(dataProvider = "getDataFromExcel")
    public void testSqrt(double value, double expected){
        double result = calculator.sqrt(value);
        Assert.assertEquals(result, expected);
    }

    @Test(dataProvider = "getDataFromExcel", expectedExceptions = Exception.class)
    public void testSqrtMinusValue(double value, double expected){
        double result = calculator.sqrt(value);
        Assert.assertEquals(result, expected);
    }

    @Test(dataProvider = "getDataFromExcel")
    public void testSin(double value, double expected){
        double result = calculator.sin(value);
        Assert.assertEquals(result, expected);
    }

    @Test(dataProvider = "getDataFromExcel")
    public void testCos(double value, double expected){
        double result = calculator.cos(value);
        Assert.assertEquals(result, expected);
    }

    @Test(dataProvider = "getDataFromExcel")
    public void testTang(double value, double expected){
        double result = calculator.tg(value);
        Assert.assertEquals(result, expected);
    }
    @Test(dataProvider = "getDataFromExcel")
    public void testCoTang(double value, double expected){
        double result = calculator.ctg(value);
        Assert.assertEquals(result, expected);
    }
    @Test(dataProvider = "getDataFromExcel", expectedExceptions = NumberFormatException.class)
    public void testCotangOfZero(double value){
        calculator.ctg(value);
    }

    @Test(dataProvider = "getDataFromExcelString")
    public void testIsPositive(long value, String expected){
        Assert.assertEquals(String.valueOf(calculator.isPositive(value)), expected);
    }

    @Test(dataProvider = "getDataFromExcelString")
    public void testIsNegative(long value, String expected){
        Assert.assertEquals(String.valueOf(calculator.isPositive(value)), expected);
    }


}
