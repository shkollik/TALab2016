package ua.epam.Factory;

/**
 * Created by Shkolik on 25.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        WatchMaker maker = new DigitalWatchMaker();
        maker.createWatch().showTime();

        WatchMaker maker2 = new RomeWatchMaker();
        maker2.createWatch().showTime();


    }


}
