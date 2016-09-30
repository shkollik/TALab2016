package ua.talab.Decorator;

/**
 * Created by Shkolik on 25.09.2016.
 */
public class Printer implements PrinterInterface {
    String value;

    public Printer(String value){
        this.value = value;
    }

    public void print(){
        System.out.print(value);
    }
}
