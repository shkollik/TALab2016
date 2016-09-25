package ua.epam.Abstract_Factor;

/**
 * Created by Shkolik on 25.09.2016.
 */
public class EnKeyboard implements Keyboard {
    @Override
    public void print() {
        System.out.println("Print String");
    }

    @Override
    public void println() {
        System.out.println("Print String and new line");
    }
}
