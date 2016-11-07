package ua.talab.Facade;

/**
 * Created by Shkolik on 25.09.2016.
 */
public class DVDRom {
    private boolean data = false;
    public boolean hasData(){
        return data;
    }

    void load(){
        data = true;
    }

    void unload(){
        data = false;
    }




}
