package ua.talab.State;

/**
 * Created by Shkolik on 25.09.2016.
 */
public class Weekend implements Activity {
    private int count = 0;
    @Override
    public void doSomething(Human context) {
        if (count < 3){
            System.out.println("relax");
            count++;
        }
        else{
            context.setState(new Work());
        }

    }
}
