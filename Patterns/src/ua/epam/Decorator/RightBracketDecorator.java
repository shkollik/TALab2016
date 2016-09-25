package ua.epam.Decorator;

/**
 * Created by Shkolik on 25.09.2016.
 */
public class RightBracketDecorator extends Decorator{

    public RightBracketDecorator(PrinterInterface component) {
        super(component);
    }

    public void print() {
        super.print();
        System.out.print("]");
    }

}
