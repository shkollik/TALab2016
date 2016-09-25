package ua.epam.Strategy;

import java.util.Arrays;

/**
 * Created by Shkolik on 25.09.2016.
 */
public class SelectionSort implements Sorting {
    @Override
    public void sort(int[] arr) {
        System.out.println(("Selection sort"));
        System.out.println("before: \t" + Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;

            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }

        System.out.println("After \t " + Arrays.toString(arr));

    }
}
