package talab;

import org.testng.Assert;
import org.testng.annotations.Test;
import talab.utils.DataProviders;

/**
 * Created by Vladyslav_Shkola on 10/31/2016.
 */
public class TestBasicOperations extends BaseTest {

    @Test(dataProvider = "getDataFromExcelLong", dataProviderClass = DataProviders.class, groups = {"smoke"}, priority = 1)
    public void testAddLong(long firstNumber, long secondNumber, long expectedResult) {
        long result = calculator.sum(firstNumber, secondNumber);
        Assert.assertEquals(result, expectedResult);
    }

    @Test(dataProvider = "getDataFromExcelLong", dataProviderClass = DataProviders.class, expectedExceptions = Exception.class, groups = {"exception"}, priority = 6)
    public void testAddLongOverflow(long firstNumber, long secondNumber) {
        calculator.sum(firstNumber, secondNumber);

    }

    @Test(dataProvider = "getDataFromExcel", dataProviderClass = DataProviders.class, groups = {"smoke"}, priority = 1)
    public void testAddDouble(double firstNumber, double secondNumber, double expectedResult) {
        double result = calculator.sum(firstNumber, secondNumber);
        Assert.assertEquals(result, expectedResult);
    }

    @Test(dataProvider = "getDataFromExcel", dataProviderClass = DataProviders.class, expectedExceptions = Exception.class, groups = {"exception"}, priority = 6)
    public void testAddDoubleOverflow(double firstNumber, double secondNumber) {
        calculator.sum(firstNumber, secondNumber);
    }

    @Test(dataProvider = "getDataFromExcelLong", dataProviderClass = DataProviders.class, groups = {"smoke"}, priority = 1)
    public void testSubLong(long firstNumber, long secondNumber, long expectedResult) {
        long result = calculator.sub(firstNumber, secondNumber);
        Assert.assertEquals(result, expectedResult);
    }

    @Test(dataProvider = "getDataFromExcelLong", dataProviderClass = DataProviders.class, expectedExceptions = Exception.class, groups = {"exception"}, priority = 6)
    public void testSubLongOverflow(long firstNumber, long secondNumber) {
        calculator.sub(firstNumber, secondNumber);

    }

    @Test(dataProvider = "getDataFromExcel", dataProviderClass = DataProviders.class, groups = {"smoke"}, priority = 1)
    public void testSubDouble(double firstNumber, double secondNumber, double expectedResult) {
        double result = calculator.sub(firstNumber, secondNumber);
        Assert.assertEquals(result, expectedResult);
    }

    @Test(dataProvider = "getDataFromExcel", dataProviderClass = DataProviders.class, expectedExceptions = Exception.class, groups = {"exception"}, priority = 6)
    public void testSubDoubleOverflow(double firstNumber, double secondNumber) {
        calculator.sub(firstNumber, secondNumber);
    }

    @Test(dataProvider = "getDataFromExcelLong", dataProviderClass = DataProviders.class, groups = {"func"}, priority = 2)
    public void testMultLong(long firstNumber, long secondNumber, long expectedResult) {
        long result = calculator.mult(firstNumber, secondNumber);
        Assert.assertEquals(result, expectedResult);
    }

    @Test(dataProvider = "getDataFromExcelLong", dataProviderClass = DataProviders.class, expectedExceptions = Exception.class, groups = {"exception"}, priority = 6)
    public void testMultLongOverflow(long firstNumber, long secondNumber) {
        calculator.mult(firstNumber, secondNumber);

    }

    @Test(dataProvider = "getDataFromExcel", dataProviderClass = DataProviders.class, groups = {"func"}, priority = 2)
    public void testMultDouble(double firstNumber, double secondNumber, double expectedResult) {
        double result = calculator.mult(firstNumber, secondNumber);
        Assert.assertEquals(result, expectedResult);
    }

    @Test(dataProvider = "getDataFromExcel", dataProviderClass = DataProviders.class, expectedExceptions = Exception.class, groups = {"exception"}, priority = 6)
    public void testMultDoubleOverflow(double firstNumber, double secondNumber) {
        calculator.mult(firstNumber, secondNumber);
    }


    @Test(dataProvider = "getDataFromExcelLong", dataProviderClass = DataProviders.class, groups = {"func"}, priority = 2)
    public void testDivLong(long firstNumber, long secondNumber, long expectedResult) {
        long result = calculator.div(firstNumber, secondNumber);
        Assert.assertEquals(result, expectedResult);
    }

    @Test(dataProvider = "getDataFromExcelLong", dataProviderClass = DataProviders.class, expectedExceptions = NumberFormatException.class, groups = {"exception"}, priority = 6)
    public void testDivByZeroLong(long firstNumber, long secondNumber) {
        calculator.div(firstNumber, secondNumber);
    }

    @Test(dataProvider = "getDataFromExcel", dataProviderClass = DataProviders.class, groups = {"func"}, priority = 2)
    public void testDivDouble(double firstNumber, double secondNumber, double expectedResult) {
        double result = calculator.div(firstNumber, secondNumber);
        Assert.assertEquals(result, expectedResult);
    }

    @Test(dataProvider = "getDataFromExcel", dataProviderClass = DataProviders.class, expectedExceptions = NumberFormatException.class, groups = {"exception"}, priority = 6)
    public void testDivByZeroDouble(double firstNumber, double secondNumber) {
        calculator.div(firstNumber, secondNumber);
    }

    @Test(dataProvider = "getDataFromExcel", dataProviderClass = DataProviders.class, expectedExceptions = Exception.class, groups = {"func"}, priority = 2)
    public void testDivDoubleOverflow(double firstNumber, double secondNumber) {
        calculator.div(firstNumber, secondNumber);
    }

}

















