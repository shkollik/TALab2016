package ua.talab.Abstract_Factor;

/**
 * Created by Shkolik on 25.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        DeviceFactory factory = getFactoryByCountry("EN");
        Mouse m = factory.getMouse();
        Keyboard k = factory.getKeyboard();
        Touchpad t = factory.getTouchpad();

        m.click();
        m.dbclick();
        m.scroll(12);

        k.print();
        k.println();

        t.track(12, 17);
    }

    private static DeviceFactory getFactoryByCountry(String lang){
        switch(lang){
            case "EN":{
                return new EnDeviceFactory();
            }
            case "RU":{
                return new RuDeviceFactory();
            }

            default:{
                throw new RuntimeException("Unsupported country" + lang);
            }
        }
    }
}
