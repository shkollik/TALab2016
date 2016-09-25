package ua.epam.State;

/**
 * Created by Shkolik on 25.09.2016.
 */
public class Human {
    private Activity state;
    public void setState(Activity s){
        this.state = s;
    }

    public void doSomething(){
        state.doSomething(this);
    }
}
