package talab;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import talab.utils.ExcelUtils;

import java.lang.reflect.Method;

/**
 * Created by Vladyslav_Shkola on 10/31/2016.
 */
public class TestBasicOperations extends Configuration {

    @Test(dataProvider = "getDataFromExcelLong")
    public void testAddLong(long firstNumber, long secondNumber, long expectedResult) {
        long result = calculator.sum(firstNumber, secondNumber);
        Assert.assertEquals(result, expectedResult);
    }

    @Test(dataProvider = "getDataFromExcelLong", expectedExceptions = Exception.class)
    public void testAddLongOverflow(long firstNumber, long secondNumber) {
        calculator.sum(firstNumber, secondNumber);

    }

    @Test(dataProvider = "getDataFromExcel")
    public void testAddDouble(double firstNumber, double secondNumber, double expectedResult) {
        double result = calculator.sum(firstNumber, secondNumber);
        Assert.assertEquals(result, expectedResult);
    }

    @Test(dataProvider = "getDataFromExcel", expectedExceptions = Exception.class)
    public void testAddDoubleOverflow(double firstNumber, double secondNumber) {
        calculator.sum(firstNumber, secondNumber);
    }

    @Test(dataProvider = "getDataFromExcelLong")
    public void testSubLong(long firstNumber, long secondNumber, long expectedResult) {
        long result = calculator.sub(firstNumber, secondNumber);
        Assert.assertEquals(result, expectedResult);
    }

    @Test(dataProvider = "getDataFromExcelLong", expectedExceptions = Exception.class)
    public void testSubLongOverflow(long firstNumber, long secondNumber) {
        calculator.sub(firstNumber, secondNumber);

    }

    @Test(dataProvider = "getDataFromExcel")
    public void testSubDouble(double firstNumber, double secondNumber, double expectedResult) {
        double result = calculator.sub(firstNumber, secondNumber);
        Assert.assertEquals(result, expectedResult);
    }

    @Test(dataProvider = "getDataFromExcel", expectedExceptions = Exception.class)
    public void testSubDoubleOverflow(double firstNumber, double secondNumber) {
        calculator.sub(firstNumber, secondNumber);
    }

    @Test(dataProvider = "getDataFromExcelLong")
    public void testMultLong(long firstNumber, long secondNumber, long expectedResult) {
        long result = calculator.mult(firstNumber, secondNumber);
        Assert.assertEquals(result, expectedResult);
    }

    @Test(dataProvider = "getDataFromExcelLong", expectedExceptions = Exception.class)
    public void testMultLongOverflow(long firstNumber, long secondNumber) {
        calculator.mult(firstNumber, secondNumber);

    }

    @Test(dataProvider = "getDataFromExcel")
    public void testMultDouble(double firstNumber, double secondNumber, double expectedResult) {
        double result = calculator.mult(firstNumber, secondNumber);
        Assert.assertEquals(result, expectedResult);
    }

    @Test(dataProvider = "getDataFromExcel", expectedExceptions = Exception.class)
    public void testMultDoubleOverflow(double firstNumber, double secondNumber) {
        calculator.mult(firstNumber, secondNumber);
    }


    @Test(dataProvider = "getDataFromExcelLong")
    public void testDivLong(long firstNumber, long secondNumber, long expectedResult) {
        long result = calculator.div(firstNumber, secondNumber);
        Assert.assertEquals(result, expectedResult);
    }

    @Test(dataProvider = "getDataFromExcelLong", expectedExceptions = NumberFormatException.class)
    public void testDivByZeroLong(long firstNumber, long secondNumber) {
        calculator.div(firstNumber, secondNumber);
    }

    //
//    @Test(dataProvider = "getDataFromExcelLong", expectedExceptions = Exception.class)
//    public void testDivLongOverflow(long firstNumber, long secondNumber){
//        calculator.div(firstNumber, secondNumber);
//
    @Test(dataProvider = "getDataFromExcel")
    public void testDivDouble(double firstNumber, double secondNumber, double expectedResult) {
        double result = calculator.div(firstNumber, secondNumber);
        Assert.assertEquals(result, expectedResult);
    }

    @Test(dataProvider = "getDataFromExcel", expectedExceptions = NumberFormatException.class)
    public void testDivByZeroDouble(double firstNumber, double secondNumber) {
        calculator.div(firstNumber, secondNumber);
    }

    @Test(dataProvider = "getDataFromExcel", expectedExceptions = Exception.class)
    public void testDivDoubleOverflow(double firstNumber, double secondNumber) {
        calculator.div(firstNumber, secondNumber);
    }




}

















