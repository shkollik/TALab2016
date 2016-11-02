package talab;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import talab.utils.ExcelUtils;

import java.lang.reflect.Method;

/**
 * Created by Vladyslav_Shkola on 10/31/2016.
 */
public class Configuration {
    Calculator calculator;
    @BeforeSuite
    public void setUp(){
        calculator = new Calculator();
    }

    @DataProvider(name = "getDataFromExcelLong")
    public static Object [] [] getDataLong(Method method){
        String nameSheet = method.getName().toString();
        ExcelUtils readerXLS = new ExcelUtils();
        return readerXLS.parse(nameSheet, "long");
    }

    @DataProvider(name = "getDataFromExcel")
    public static Object [] [] getData(Method method){
        String nameSheet = method.getName().toString();
        ExcelUtils readerXLS = new ExcelUtils();
        return readerXLS.parse(nameSheet, "double");
    }

    @DataProvider(name = "getDataFromExcelString")
    public static Object [] [] getDataString(Method method){
        String nameSheet = method.getName().toString();
        ExcelUtils readerXLS = new ExcelUtils();
        return readerXLS.parse(nameSheet, "string");
    }

}
