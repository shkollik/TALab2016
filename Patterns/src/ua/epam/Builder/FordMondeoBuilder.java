package ua.epam.Builder;

/**
 * Created by Shkolik on 25.09.2016.
 */
public class FordMondeoBuilder extends CarBuilderII{

    @Override
    void buildMake() {
        car.setMake("Ford Mondeo");

    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.Auto);

    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(200);

    }
}
