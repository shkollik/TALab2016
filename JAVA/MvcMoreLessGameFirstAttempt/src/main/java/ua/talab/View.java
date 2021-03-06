package ua.talab;

/**
 * Created by Vladyslav_Shkola on 9/15/2016.
 */
public class View {
    public static final String PROGRAM_GREETING = "Pick number from 0 to 100 (do not include boundary values of that range)";
    public static final String CONGRATULATIONS = "You won ! Congrats!!!";
    public static final String LIST_OF_TRIES = "All your tries: ";
    public static final String DUPLICATES = "You've already picked that number!";
    public static final String WRONG_INPUT_INT_DATA = "Nice try! But the targetNumber is in range of ";
    public static final String TRY = " Try again ";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printMessageInTheSameLine(String message) {
        System.out.print(message);
    }

    public void printMessageAndInt(String message, int value1, int value2) {
        System.out.println(message + value1 + " - " + value2);
    }
}
