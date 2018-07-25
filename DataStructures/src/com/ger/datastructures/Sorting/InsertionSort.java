package com.ger.datastructures.Sorting;

import com.ger.datastructures.Main;

public class InsertionSort {

    public static void Sort(int[] Array){

        for(int LastUnsortedIndex = 1; LastUnsortedIndex < Array.length; LastUnsortedIndex ++ ){

            for(int i = 1; i < Array.length; i++){
                if (Array[i-1] > Array[i]){
                    BubbleSort.swap(Array, i, i-1);
                }

            }


        }

        Main.printArray("Insertion", Array);



    }



}
