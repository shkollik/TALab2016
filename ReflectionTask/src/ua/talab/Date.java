package ua.talab;

/**
 * Created by Vladyslav_Shkola on 9/23/2016.
 */
public class Date {
    public String dateFormat;

    public Date(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    @Override
    public String toString() {
        return "Date{" +
                "dateFormat='" + dateFormat + '\'' +
                '}';
    }
}
