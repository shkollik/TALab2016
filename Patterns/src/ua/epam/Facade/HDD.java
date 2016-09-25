package ua.epam.Facade;

/**
 * Created by Shkolik on 25.09.2016.
 */
public class HDD {
    void copyFromDVV(DVDRom dvd){
        if(dvd.hasData()) {
            System.out.println("Copy starts");
        }
        else{
            System.out.println("Insert disc!");
        }
    }
}
