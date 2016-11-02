package ua.talab.Builder;

/**
 * Created by Shkolik on 25.09.2016.
 */
public class Director {
    CarBuilderII builder;
    void setBuilder(CarBuilderII builder){
        this.builder = builder;
    }

    Car buildCar(){
        builder.createCar();
        builder.buildMake();
        builder.buildTransmission();
        builder.buildMaxSpeed();
        Car car = builder.getCar();
        return car;
    }
}
