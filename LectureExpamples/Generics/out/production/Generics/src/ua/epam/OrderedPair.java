package ua.epam;

import java.util.Comparator;

/**
 * Created by Vladyslav_Shkola on 9/27/2016.
 */
public class OrderedPair<T extends Comparable<T>> {
    private T first;
    private T second;

    public OrderedPair() {
    }

    public OrderedPair(T first, T second) {
        set(first, second);

    }

    public void set(T first, T second) {
        if(first == null || second == null){
            this.first = first;
            this.second = second;
            return;
        }
        if(first.compareTo(second) < 0){
            this.first = first;
            this.second = second;
        }
        else{
            this.second = first;
            this.first = second;
        }
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void setFirst(T first) {
        //this.first = first;
        set(first, this.second);
    }

    public void setSecond(T second) {
       // this.second = second;
        set(this.first, second);
    }
}
