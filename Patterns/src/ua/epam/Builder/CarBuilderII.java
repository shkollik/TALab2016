package ua.epam.Builder;

/**
 * Created by Shkolik on 25.09.2016.
 */
abstract class CarBuilderII {
    Car car;

    void createCar(){
        car = new Car();
    }

    abstract void buildMake();
    abstract void buildTransmission();
    abstract void buildMaxSpeed();

    Car getCar(){
        return car;
    }


}
