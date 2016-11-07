package ua.talab.Decorator;

/**
 * Created by Shkolik on 24.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        PrinterInterface printer = new Printer("Hey");
        printer.print();

        System.out.println();

        PrinterInterface printer2 = new QuotesDecorator(new Printer("Hey"));
        printer2.print();

        System.out.println();

        PrinterInterface printer3 = new QuotesDecorator(new LeftBracketDecorator(new RightBracketDecorator(new Printer("Hey"))));
        printer3.print();


    }
}
