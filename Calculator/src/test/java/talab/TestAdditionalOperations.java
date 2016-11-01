package talab;

import org.testng.Assert;
import org.testng.annotations.Test;
import talab.utils.DataProviders;

/**
 * Created by Vladyslav_Shkola on 10/31/2016.
 */

public class TestAdditionalOperations extends BaseTest {
    @Test(dataProvider = "getDataFromExcel", dataProviderClass = DataProviders.class, groups = {"func"}, priority = 3)
    public void testPow(double value, double degree, double expected){
        double result = calculator.pow(value, degree);
        Assert.assertEquals(result, expected);
    }

    @Test(dataProvider = "getDataFromExcel", dataProviderClass = DataProviders.class, expectedExceptions = NumberFormatException.class, groups = {"exception"}, priority = 7)
    public void testPowMinusDegreeOfZeroValue(double value, double degree){
        calculator.pow(value, degree);

    }

    @Test(dataProvider = "getDataFromExcel", dataProviderClass = DataProviders.class, groups = {"func"}, priority = 3)
    public void testSqrt(double value, double expected){
        double result = calculator.sqrt(value);
        Assert.assertEquals(result, expected);
    }

    @Test(dataProvider = "getDataFromExcel", dataProviderClass = DataProviders.class, expectedExceptions = Exception.class, groups = {"exception"}, priority = 7)
    public void testSqrtMinusValue(double value){
        calculator.sqrt(value);
    }

    @Test(dataProvider = "getDataFromExcel", dataProviderClass = DataProviders.class, groups = {"trigonometry"}, priority = 4)
    public void testSin(double value, double expected){
        double result = calculator.sin(value);
        Assert.assertEquals(result, expected);
    }

    @Test(dataProvider = "getDataFromExcel", dataProviderClass = DataProviders.class, groups = {"trigonometry"}, priority = 4)
    public void testCos(double value, double expected){
        double result = calculator.cos(value);
        Assert.assertEquals(result, expected);
    }

    @Test(dataProvider = "getDataFromExcel", dataProviderClass = DataProviders.class, groups = {"trigonometry"}, priority = 4)
    public void testTang(double value, double expected){
        double result = calculator.tg(value);
        Assert.assertEquals(result, expected);
    }
    @Test(dataProvider = "getDataFromExcel", dataProviderClass = DataProviders.class, groups = {"trigonometry"}, priority = 4)
    public void testCoTang(double value, double expected){
        double result = calculator.ctg(value);
        Assert.assertEquals(result, expected);
    }
    @Test(dataProvider = "getDataFromExcel", dataProviderClass = DataProviders.class, expectedExceptions = NumberFormatException.class, groups = {"exception"}, priority = 8)
    public void testCotangOfZero(double value){
        calculator.ctg(value);
    }

    @Test(dataProvider = "getDataFromExcelLong", dataProviderClass = DataProviders.class, groups = {"func"}, priority = 5)
    public void testIsPositiveTrue(long value){
        Assert.assertTrue(calculator.isPositive(value));
    }

    @Test(dataProvider = "getDataFromExcelLong", dataProviderClass = DataProviders.class, groups = {"func"}, priority = 5)
    public void testIsPositiveFalse(long value){
        Assert.assertFalse(calculator.isPositive(value));
    }

    @Test(dataProvider = "getDataFromExcelLong", dataProviderClass = DataProviders.class, groups = {"func"}, priority = 5)
    public void testIsNegativeTrue(long value){
        Assert.assertTrue(calculator.isNegative(value));
    }

    @Test(dataProvider = "getDataFromExcelLong", dataProviderClass = DataProviders.class, groups = {"func"}, priority = 5)
    public void testIsNegativeFalse(long value){
        Assert.assertFalse(calculator.isNegative(value));
    }


}
