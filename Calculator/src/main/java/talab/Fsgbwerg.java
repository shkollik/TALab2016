package talab;

/**
 * Created by Vladyslav_Shkola on 10/31/2016.
 */
public class Fsgbwerg {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(Double.MIN_VALUE);
        System.out.println(calculator.sum(Long.MAX_VALUE, 1));
        System.out.println(calculator.isPositive(-50));
        System.out.println(calculator.isNegative(0));

        System.out.println(calculator.sin(1));
    }
}
