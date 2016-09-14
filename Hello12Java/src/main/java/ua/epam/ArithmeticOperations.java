package ua.epam;

/**
 * Created by Vladyslav_Shkola on 9/13/2016.
 */
public class ArithmeticOperations {
    public double add (double value1, double value2){
        return value1 + value2;
    }

    public double deduct (double value1, double value2){
        return value1 - value2;
    }

    public double mult (double value1, double value2){
        return value1 * value2;
    }

    public double div (double value1, double value2){
        if (value2 == 0) throw new ArithmeticException();
        return value1 / value2;
    }
}
