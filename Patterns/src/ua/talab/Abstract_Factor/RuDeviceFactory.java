package ua.talab.Abstract_Factor;

/**
 * Created by Shkolik on 25.09.2016.
 */
public class RuDeviceFactory implements DeviceFactory{
    @Override
    public Mouse getMouse() {
        return new RuMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new RuKeyboard();
    }

    @Override
    public Touchpad getTouchpad() {
        return new RuTouchpad();
    }
}
