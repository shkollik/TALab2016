package ua.epam;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int [] array = {4, 5, 3, 4, 4};
        System.out.println(Arrays.toString(getIndexes(array, 4)));



    }

    public static int [] getIndexes(int [] array, int number){
        int [] result = new int [array.length];
        int j = 0;
        for(int i=0; i<array.length; i++){
            if (array[i]==number){
                result[j++] = i;
            }


        }
        result=Arrays.copyOf(result, j);

        return result;
    }
}
