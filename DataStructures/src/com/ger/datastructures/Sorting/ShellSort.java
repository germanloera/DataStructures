package com.ger.datastructures.Sorting;

import com.ger.datastructures.Main;

public class ShellSort {

    public static void Sort(int[] Array, int gap) {

        while (gap >= 1) {
            for (int i = gap; i < Array.length; i++) {
                int element = Array[i];
                int j = i;
                while (j >= gap && Array[j - gap] > element) {
                    Array[j] = Array[j - gap];
                    j -= gap;

                }
                Array[j] = element;

            }

        gap = gap / 2;

    }


        Main.printArray("Shell",Array);

}




}
