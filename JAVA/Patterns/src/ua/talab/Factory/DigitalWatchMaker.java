package ua.talab.Factory;

/**
 * Created by Shkolik on 25.09.2016.
 */
public class DigitalWatchMaker implements WatchMaker{

    @Override
    public Watch createWatch() {
        return new DigitalWatch();
    }
}
