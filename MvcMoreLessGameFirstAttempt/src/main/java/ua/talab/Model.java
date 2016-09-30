package ua.talab;

/**
 * Created by Vladyslav_Shkola on 9/15/2016.
 */
public class Model {
    private int minBarrier;
    private int maxBarrier;
    private int secretValue;

    public Model() {
        minBarrier = 0;
        maxBarrier = 100;
        secretValue = randomize(getMinBarrier(), getMaxBarrier());
    }

    public int randomize(int min, int max) {
        int res = (min + 1) + (int) (Math.random() * (max - min - 1));
        return res;
    }

    public void modifyRange(int customerInput, int minBarrier, int maxBarrier, int secretValue) {
        if (customerInput > minBarrier && customerInput < maxBarrier) {
            if (customerInput > secretValue) {
                this.maxBarrier = customerInput - 1;
            } else if (customerInput < secretValue) {
                this.minBarrier = customerInput + 1;
            }
        }
    }

    public int getMinBarrier() {
        return minBarrier;
    }

    public int getMaxBarrier() {
        return maxBarrier;
    }

    public int getSecretValue() {
        return secretValue;
    }
}
