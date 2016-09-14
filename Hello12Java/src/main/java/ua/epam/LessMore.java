package ua.epam;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Vladyslav_Shkola on 9/13/2016.
 */
public class LessMore {
    public void rand(int min, int max) {
        Random dice = new Random();
        int number = dice.nextInt(max); // target number
//        System.out.println("The target number is close to "+ (number -5) + " But dont look at it. Try to guess  without help ");

        int [] guessArray = new int [max];
        int j = 0;
        System.out.println("Pick number from 0 to 100");

        for(int counter = 0; counter < max; counter++){
            Scanner sc = new Scanner(System.in);
            String stringCustomerInput;
            if ((stringCustomerInput = sc.nextLine()).length() > 0){
                int customerInput = Integer.parseInt(stringCustomerInput);
                guessArray[j++] = customerInput;



                if(customerInput == number){
                    System.out.println("You won ! Congrats!!!");
                    System.out.println("Your previous tries: " + Arrays.toString(Arrays.copyOf(guessArray, j)));
                    break;
                }

                if (customerInput < min || customerInput > max){
                    adviceToPlayer(guessArray, j, min, max);
                    continue;
                }

                if (customerInput < number){
                    min = guessArray[counter]+1;
                    adviceToPlayer(guessArray, j, min, max);
                }

                if (customerInput > number){
                    max=guessArray[counter]-1;
                    adviceToPlayer(guessArray, j, min, max);
                }

            }
            else{
                System.out.println("Only numbers please");
            }

        }
    }

    private static void adviceToPlayer(int [] array, int j, int min, int max){
        System.out.println("Nice try! But the number is in range between " + min + " and " + max + " Try again");
        System.out.println("Your previous tries:");
        for (int i=0; i<j; i++){
            System.out.print(array[i] + " ");
        }
    }
}
