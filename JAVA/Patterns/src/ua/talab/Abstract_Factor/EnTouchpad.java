package ua.talab.Abstract_Factor;

/**
 * Created by Shkolik on 25.09.2016.
 */
public class EnTouchpad implements Touchpad{
    @Override
    public void track(int deltaX, int deltaY) {
        int s = (int) Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
        System.out.println("Move on " + s + " pixels");
    }
}
