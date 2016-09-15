package ua.epam;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Vladyslav_Shkola on 9/13/2016.
 */
public class MoreLessGame {
    public void rand(int min, int max) {
        int targetNumber = random(min, max);
        //System.out.println("The targetNumber is "+ targetNumber + " But dont look at it. Try to guess  without help ");

        int[] guessArray = new int[max];
        int numberOfAttempts = 0;
        System.out.println("Pick number from 0 to 100 (do not include boundary values of that range) ");

        for (int counter = 0; counter < guessArray.length; counter++) {
            Scanner sc = new Scanner(System.in);
            int customerInput = sc.nextInt();
            guessArray[numberOfAttempts++] = customerInput;

            if (customerInput == targetNumber) {
                System.out.println("You won ! Congrats!!!");
                System.out.println("All your tries: " + Arrays.toString(Arrays.copyOf(guessArray, numberOfAttempts)));
                break;
            }

            if (areThereAnyDuplicates(guessArray, customerInput, numberOfAttempts)) {
                System.out.println("You've already picked that number!");
                adviceToPlayer(guessArray, numberOfAttempts, min, max);
                continue;
            }

            if (customerInput < min || customerInput > max) {
                adviceToPlayer(guessArray, numberOfAttempts, min, max);
                continue;
            }

            if (customerInput < targetNumber) {
                min = guessArray[counter] + 1;
                adviceToPlayer(guessArray, numberOfAttempts, min, max);
            }

            if (customerInput > targetNumber) {
                max = guessArray[counter] - 1;
                adviceToPlayer(guessArray, numberOfAttempts, min, max);
            }


        }
    }

    private void adviceToPlayer(int[] array, int numberOfAttempts, int min, int max) {
        System.out.println("Nice try! But the targetNumber is in range between " + min + " and " + max);
        System.out.print("So, at the moment all your previous tries: ");
        for (int i = 0; i < numberOfAttempts; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" Try again");
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

    public int random(int min, int max){
        int res = (min + 1) + (int)(Math.random() * (max - min -1));
        return  res;
    }
}
