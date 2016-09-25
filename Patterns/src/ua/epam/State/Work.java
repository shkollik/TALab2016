package ua.epam.State;

/**
 * Created by Shkolik on 25.09.2016.
 */
public class Work implements Activity {
    @Override
    public void doSomething(Human context) {
        System.out.println("Working ...");
        context.setState(new Weekend());
    }
}
