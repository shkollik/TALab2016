package ua.talab.Builder;

/**
 * Created by Shkolik on 25.09.2016.
 */
public class CarBuilder {
    String m = "Default";
    Transmission tr = Transmission.Manual;
    int s = 120;

    CarBuilder buildMake(String m){
        this.m = m;
        return this;
    }

    CarBuilder buildTransmisson(Transmission tr){
        this.tr = tr;
        return this;
    }

    CarBuilder buildMaxSpeed(int s){
        this.s = s;
        return this;
    }

    Car build(){
        Car car = new Car();
        car.setMake(m);
        car.setTransmission(tr);
        car.setMaxSpeed(s);
        return car;
    }


}
