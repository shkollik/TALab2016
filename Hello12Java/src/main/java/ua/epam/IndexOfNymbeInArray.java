package ua.epam;

import java.util.Arrays;

/**
 * Created by Vladyslav_Shkola on 9/14/2016.
 */
public class IndexOfNymbeInArray {
    public int [] getIndexes(int [] array, int number){
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
