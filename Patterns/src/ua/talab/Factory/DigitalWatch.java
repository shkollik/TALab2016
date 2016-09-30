package ua.talab.Factory;

import java.util.Date;

/**
 * Created by Shkolik on 25.09.2016.
 */
public class DigitalWatch implements Watch {
    @Override
    public void showTime() {
        System.out.println(new Date());
    }
}
