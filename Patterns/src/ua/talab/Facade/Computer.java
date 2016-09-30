package ua.talab.Facade;

/**
 * Created by Shkolik on 25.09.2016.
 */
public class Computer {
    Power power = new Power();
    DVDRom dvd = new DVDRom();
    HDD hdd = new HDD();

    void copy(){
        power.on();
        dvd.load();
        hdd.copyFromDVV(dvd);
    }
}
