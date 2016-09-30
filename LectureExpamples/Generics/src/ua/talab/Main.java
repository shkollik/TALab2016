package ua.talab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<?> list = new ArrayList<>(Arrays.asList(3, 3.5, 5L));
//        list.add(3);
//        list.add(3.5);
//        list.add(5L);
//        list.add("three");
//        list.add('a');
        double sum = 0 ;
        for(Object obj : list){
            Number i = (Number) obj; // Integer.valueOf()
            System.out.println(i);
            sum += i.doubleValue();
        }

        System.out.println("sum = " + sum);
    }
}
