package ua.epam.Abstract_Factor;

/**
 * Created by Shkolik on 25.09.2016.
 */
public interface DeviceFactory {
    Mouse getMouse();
    Keyboard getKeyboard();
    Touchpad getTouchpad();
}
