package ua.epam.Decorator;

/**
 * Created by Shkolik on 25.09.2016.
 */
public class LeftBracketDecorator extends Decorator{

    public LeftBracketDecorator(PrinterInterface component){
        super(component);
    }

    public void print(){
        System.out.print("[");
        super.print();
    }
}
