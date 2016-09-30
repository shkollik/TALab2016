package ua.talab.Builder;

/**
 * Created by Shkolik on 25.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        Car car = new CarBuilder()
                .buildMake("Mercedes")
                .buildTransmisson(Transmission.Manual)
                .buildMaxSpeed(220)
                .build();

        System.out.println(car);

        Director director = new Director();
        director.setBuilder(new SubaruBuilder());

        Car car3 = director.buildCar();
        System.out.println(car3);

    }
}
