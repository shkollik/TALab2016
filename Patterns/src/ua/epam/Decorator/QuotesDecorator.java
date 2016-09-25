package ua.epam.Decorator;

/**
 * Created by Shkolik on 25.09.2016.
 */
public class QuotesDecorator extends Decorator{

    public QuotesDecorator(PrinterInterface component){
        super(component);
    }

    public void print(){
        System.out.print("\"");
        super.print();
        System.out.print("\"");
    }
}
