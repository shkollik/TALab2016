package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int [] setOfInts = {3, 4, 2, 0, 20};
        BubbleSort(setOfInts);

        for(int i : (swap(2,3))){
            System.out.print(i);
        }


    }

    private static int[] BubbleSort(int[] setOfInts) {
        for(int i= 0; i <setOfInts.length - 1; i++){
            for(int j = 0; j < setOfInts.length - i - 1; j++){
                if(setOfInts[j]>setOfInts[j+1]){
                    int temp = setOfInts[j+1];
                    setOfInts[j+1] = setOfInts[j];
                    setOfInts[j] = temp;
                }
            }
        }
        return setOfInts;
    }

    private static int[] BubbleSort2(int[] setOfInts) {
        for(int i= 0; i <setOfInts.length - 1; i++){
            for(int j = 0; j < setOfInts.length - i - 1; j++){
                if(setOfInts[j]<setOfInts[j+1]){
                    int temp = setOfInts[j+1];
                    setOfInts[j+1] = setOfInts[j];
                    setOfInts[j] = temp;
                }
            }
        }
        return setOfInts;
    }

    private static int[] swap(int a, int b){
        a= a+b;
        b=a-b;
        a=a-b;
        int[] arr = {a, b};
        return arr;

    }





}
