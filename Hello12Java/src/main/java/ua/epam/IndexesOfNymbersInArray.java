package ua.epam;

import java.util.Arrays;

/**
 * Created by Vladyslav_Shkola on 9/14/2016.
 */
public class IndexesOfNymbersInArray {
    public int [] getIndexes(int [] array, int number) throws Exception{
        if (!checkIfAtLeastOneMatch(array, number)){
            int [] emptyArray = {};
            return emptyArray;
        }

        else{
            int [] result = new int [array.length];
            int j = 0;
            for(int i=0; i<array.length; i++){
                if (array[i]==number){
                    result[j++] = i;
                }


            }
            result= Arrays.copyOf(result, j);

            return result;

        }

    }

    private boolean checkIfAtLeastOneMatch(int[] array, int number) {
        boolean isMatched = false;
        for (int k = 0; k < array.length; k++){
            if (array[k] == number){
                isMatched = true;
                break;
            }
        }

        return isMatched;
    }
}
