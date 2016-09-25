package ua.epam.Strategy;

/**
 * Created by Shkolik on 25.09.2016.
 */
public class StrategyClient {
    Sorting strategy;
    public void setStrategy(Sorting strategy){
        this.strategy = strategy;
    }

    public void executeStrategy(int [] arr){
        strategy.sort(arr);
    }
}
