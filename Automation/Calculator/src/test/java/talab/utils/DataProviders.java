package talab.utils;

import java.lang.reflect.Method;
import org.testng.annotations.DataProvider;

/**
 * Created by Vladyslav_Shkola on 11/1/2016.
 */
public class DataProviders {
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
