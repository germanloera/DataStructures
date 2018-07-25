package com.ger.datastructures.Sorting;

import com.ger.datastructures.Main;

public class SelectionSort {

    public static void Sort(int[] Array) {
        int smalestIndex = 0;


        for (int SortedIndex = 0; SortedIndex < Array.length; SortedIndex++) {
            for (int i = SortedIndex; i < Array.length; i++) {

                if (Array[smalestIndex] > Array[i]) {
                    smalestIndex = i;
                }
            }

            BubbleSort.swap(Array, SortedIndex, smalestIndex);
            smalestIndex = SortedIndex + 1;

        }
        Main.printArray("Selection", Array);

    }


}
