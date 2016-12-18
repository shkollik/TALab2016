package com.example.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

import static java.lang.Math.addExact;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by Shkolik on 18.12.2016.
 */
@RunWith(Parameterized.class)
public class Main {
    @Parameterized.Parameter
    public Integer a;

    @Parameterized.Parameter(1)
    public Integer b;

    @Parameterized.Parameter(2)
    public Integer c;

//    @Parameterized.Parameters(name = "{index}: testAdd({0} + {1}) ={2}")
//    public static Object [] [] testData(){
//        return new Object[][]{
//                {2,2,4}, {4,4,8}
//        };
//    }

    @Parameterized.Parameters(name = "{index}: testAdd({0} + {1}) ={2}")
    public static Collection<Object[]> testData2(){
        return Arrays.asList(new Object[][]{
                {2,2,4},
                {4,4,8}
        });
    }

    @Test
    public void testAdd() throws Exception {
        assertThat(addExact(a, b), is(equalTo(c)));
    }
}
