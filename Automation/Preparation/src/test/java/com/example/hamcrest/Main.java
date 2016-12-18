package com.example.hamcrest;

import org.hamcrest.Matcher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasSize;


/**
 * Created by Shkolik on 17.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,5,1);
        assertThat(list, is(equalTo(Arrays.asList(3,5,1))));
        assertThat(list, everyItem(greaterThan(0)));
        assertThat(list, hasSize(greaterThan(2)));

    }



}
