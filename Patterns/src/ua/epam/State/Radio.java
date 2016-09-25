package ua.epam.State;

/**
 * Created by Shkolik on 25.09.2016.
 */
public class Radio {
    Station station;

    void setStation(Station st){
        station = st;
    }

    void nextStation(){
        if(station instanceof Radio7){
            setStation(new Radio7());
        }
        else if(station instanceof Radio8){
            setStation(new Radio8());
        }
        else if(station instanceof Radio9){
            setStation(new Radio9());
        }
    }

    void play(){
        station.play();
    }

}
