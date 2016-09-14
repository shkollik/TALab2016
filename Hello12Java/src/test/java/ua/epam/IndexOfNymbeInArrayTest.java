package ua.epam;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Vladyslav_Shkola on 9/14/2016.
 */
public class IndexOfNymbeInArrayTest {
    int [] arr1 = {};
    int [] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 12, 11, 2, 2, 3, 3, 3, 3, 3, 3, 3};
    int [] arr3 = {4};
    int number = 4;

    int [] resEmptyArray = {};
    int [] resOneElement = {0};
    int [] resBigArray = {3};
   

    static IndexOfNymbeInArray a;

    @BeforeClass
    public static void initialize(){
        a = new IndexOfNymbeInArray();;
    }


    @Test
    public void testEmptyArray() throws Exception {
        int [] res  = a.getIndexes(arr1, number);

        Assert.assertArrayEquals(res, resEmptyArray);

    }

    @Test
    public void testBigArray() throws Exception {
        int [] res = a.getIndexes(arr2, number);

        Assert.assertArrayEquals(res, resBigArray);

    }

    @Test
    public void testArrayOfOneElement() throws Exception {
        int [] res = a.getIndexes(arr3, number);

        Assert.assertArrayEquals(res, resOneElement);

    }

}