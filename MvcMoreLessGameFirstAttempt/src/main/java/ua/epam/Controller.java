package ua.epam;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Vladyslav_Shkola on 9/15/2016.
 */
public class Controller {
    Model model;
    View view;
    private int customerInput;    

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void start() {
        view.printMessage(View.PROGRAM_GREETING);

        int[] guessArray = new int[model.getMaxBarrier()];
        int numberOfAttempts = 0;

        for (int i = 0; i < guessArray.length; i++) {
            Scanner sc = new Scanner(System.in);
            customerInput = sc.nextInt();
            guessArray[numberOfAttempts++] = customerInput;

            if (areThereAnyDuplicates(guessArray, customerInput, numberOfAttempts)) {
                view.printMessage(View.DUPLICATES);
                adviceToPlayer(guessArray, numberOfAttempts, model.getMinBarrier(), model.getMaxBarrier());
            } else {
                if (customerInput == model.getSecretValue()) {
                    view.printMessage(View.CONGRATULATIONS);
                    view.printMessage(View.LIST_OF_TRIES + Arrays.toString(Arrays.copyOf(guessArray, numberOfAttempts)));
                    break;
                } else {
                    model.modifyRange(customerInput, model.getMinBarrier(), model.getMaxBarrier(), model.getSecretValue());
                    adviceToPlayer(guessArray, numberOfAttempts, model.getMinBarrier(), model.getMaxBarrier());
                }
            }
        }
    }

    private boolean areThereAnyDuplicates(int[] array, int customerInput, int numberOfCustomerInputs) {
        boolean duplicatesArePresented = false;
        for (int i = 0; i < numberOfCustomerInputs; i++) {
            for (int j = i + 1; j < numberOfCustomerInputs; j++) {
                if (array[i] == array[j] && array[j] == customerInput) {
                    duplicatesArePresented = true;
                    break;
                }
            }
        }

        return duplicatesArePresented;
    }

    private void adviceToPlayer(int[] array, int numberOfAttempts, int min, int max) {
        view.printMessageAndInt(View.WRONG_INPUT_INT_DATA, min, max);
        view.printMessageInTheSameLine(View.LIST_OF_TRIES);

        for (int i = 0; i < numberOfAttempts; i++) {
            view.printMessageInTheSameLine(array[i] + " ");
        }

        view.printMessageInTheSameLine(View.TRY);
    }

}
