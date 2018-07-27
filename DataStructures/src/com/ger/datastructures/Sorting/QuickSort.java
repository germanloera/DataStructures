package com.ger.datastructures.Sorting;

import com.ger.datastructures.Main;

public class QuickSort {

    public static void Sort(int[] Array) {


        QuickSort(Array, 0, Array.length -1);
        Main.printArray("QuickSort", Array);

    }

    public static void QuickSort(int[] Array, int Start, int End) {
        if (Start < End) {
            int p = partition(Array, Start, End);
            QuickSort(Array, Start, p - 1);
            QuickSort(Array, p + 1, End);

        }


    }

    public static int partition(int[] Array, int Start, int End) {
        int pivot = Array[End];
        int i = Start - 1;
        for (int j = Start; j < End; j++) {
            if (Array[j] < pivot) {
                i++;
                BubbleSort.swap(Array, i, j);

            }
        }
        BubbleSort.swap(Array, i + 1, End);
        return i + 1;
    }
}
