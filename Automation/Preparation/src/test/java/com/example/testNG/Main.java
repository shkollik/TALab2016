package com.example.testNG;

import com.example.collections.Base;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by Shkolik on 17.12.2016.
 */
public class Main {

    @Test(dataProvider = "testData")
    public void firstTest(int a, int b){
        assertThat("a=2*b", a, is(equalTo(b/2)));

    }

    @DataProvider
    public Object [] [] testData(){
        return new Object[][]{
                {3, 6}, {4,8}
        };
    }
}
