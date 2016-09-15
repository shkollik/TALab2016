package ua.epam;

/**
 * Created by Vladyslav_Shkola on 9/15/2016.
 */
public class Model {
    private int minBarrier;
    private int maxBarrier;
    private int secretValue;

    public boolean CheckValue(int customerInput){
        boolean isGuessed = false;
        if(customerInput==secretValue){
            isGuessed = true;
        }
        else if(customerInput > secretValue){
            maxBarrier = customerInput - 1;
            isGuessed = false;
        }
        else if(customerInput < secretValue){
            minBarrier = customerInput + 1;
            isGuessed = false;
        }
        return isGuessed;
    }
}
