package com.ger.datastructures.Sorting;

import com.ger.datastructures.Main;

public class BubbleSort {

    public static void Sort(int[] array){
        for (int LastUnsortedIndex = array.length -1;
             LastUnsortedIndex > 0 ;
             LastUnsortedIndex--){

            for (int i =0 ; i< LastUnsortedIndex; i++){
                if (array[i] > array[i + 1]) {
                    swap(array, i, i+1);
                }
            }
        }

        Main.printArray("BubbleSort", array);
    }



    public static void swap(int[] array, int i, int j){

        if(i == j){
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;




    }




}
