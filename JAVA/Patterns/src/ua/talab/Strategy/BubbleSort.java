package ua.talab.Strategy;

import java.util.Arrays;

/**
 * Created by Shkolik on 25.09.2016.
 */
public class BubbleSort implements Sorting {
    @Override
    public void sort(int[] arr) {
        System.out.println(("Bubble sort"));
        System.out.println("before: \t" + Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("After \t " + Arrays.toString(arr));
    }
}
