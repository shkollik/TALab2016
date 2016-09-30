package ua.talab.Builder;

/**
 * Created by Shkolik on 25.09.2016.
 */
public class SubaruBuilder extends CarBuilderII{

    @Override
    void buildMake() {
        car.setMake("Subaru");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.Manual);

    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(250);

    }
}
