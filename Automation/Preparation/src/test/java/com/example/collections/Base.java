package com.example.collections;

import javafx.scene.effect.SepiaTone;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Shkolik on 12.12.2016.
 */
public class Base {
    static ArrayList<String> list = new ArrayList<String>();

    public static void main(String[] args) {
        list.add("ewfef");
        list.add("sdfsdf");
        list.add("wecwecwec");

        Iterator<String> iter = list.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        Set cars = new LinkedHashSet();
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Audi");
        Iterator<String> iterator = cars.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Car car1 = new Car();
        Car car2= new Car();
        car1.setName("A");
        car1.setColor("B");
        car2.setName("A");
        car2.setColor("B");
        System.out.println(car1.equals(car2));

        Set<HashSet> set = new HashSet<>();








    }

}
