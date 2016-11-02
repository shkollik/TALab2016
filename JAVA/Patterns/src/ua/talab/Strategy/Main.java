package ua.talab.Strategy;

/**
 * Created by Shkolik on 25.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        StrategyClient c = new StrategyClient();
        int [] arr = {1, 3, 2, 1};

        c.setStrategy(new BubbleSort());
        c.executeStrategy(arr);

        c.setStrategy(new SelectionSort());
        c.executeStrategy(arr);

    }
}
