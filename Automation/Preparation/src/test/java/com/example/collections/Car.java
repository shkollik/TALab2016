package com.example.collections;

import org.junit.Test;

/**
 * Created by Shkolik on 12.12.2016.
 */
public class Car {
    private String name;
    private String color;



    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }





    //    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Car car = (Car) o;
//
//        if (!name.equals(car.name)) return false;
//        return color.equals(car.color);
//
//    }
//
//    @Override
//    public int hashCode() {
//        int result = name.hashCode();
//        result = 31 * result + color.hashCode();
//        return result;
//    }
}
