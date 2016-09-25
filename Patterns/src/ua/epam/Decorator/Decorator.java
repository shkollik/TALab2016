package ua.epam.Decorator;

/**
 * Created by Shkolik on 25.09.2016.
 */
abstract class Decorator implements PrinterInterface{
    PrinterInterface component;

    public Decorator(PrinterInterface component){
        this.component = component;
    }

    public void print(){
        component.print();
    }



}
