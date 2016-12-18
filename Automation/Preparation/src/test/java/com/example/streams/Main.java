package com.example.streams;

import com.example.collections.Car;
import sun.swing.BakedArrayList;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;



/**
 * Created by Shkolik on 13.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        Arrays.asList(4, 2, 4, 4).stream().filter(s -> s > 3).collect((Collectors.toList())).forEach(System.out::println);
        Stream.of("Addddd", "Gddddd", "Assss").filter(s -> s.startsWith("A")).forEach(System.out::println);
        IntStream.range(1, 5).mapToObj(s -> s+1).collect(Collectors.toList()).forEach(System.out::println);
        IntStream.range(1,10).forEach(System.out::print);
        System.out.println();
        Stream.of("c1", "c2", "c3").map(s -> s.substring(1)).mapToInt(Integer::parseInt).forEach(System.out::print);

        List<Car> cars = new ArrayList();

        ArrayList<Car> cars2= new ArrayList();


        Arrays.asList(3,2,1).forEach(System.out::println);

        Collections.synchronizedList(new ArrayList<String>());
       // Collections.unmodifiableList(new ArrayList<String>()).add("wfwef");










    }
}
