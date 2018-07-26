package com.ger.datastructures.Sorting;

import com.ger.datastructures.Main;
import com.sun.corba.se.spi.orbutil.threadpool.Work;
import sun.tools.jconsole.Worker;

public class MergeSort {

    public static void Sort(int[] Array) {
        int[] WorkingArray = new int[Array.length];
        System.arraycopy(Array, 0, WorkingArray, 0, Array.length);
        SplitArray(WorkingArray, 0, Array.length, Array);
        Main.printArray("Merge", Array);

    }


    public static void SplitArray(int[] WorkingArray, int Start, int End, int[] Array) {

        if ((End - Start) < 2) {
            return;
        }


        int Mid = (End + Start) / 2;
        SplitArray(Array, Start, Mid, WorkingArray);
        SplitArray(Array, Mid, End, WorkingArray);
        MergeArray(Array, Start, Mid, End, WorkingArray);

    }


    public static void MergeArray(int[] WorkingArray, int Start, int Mid, int End, int[] Array) {
        int i = Start;
        int j = Mid;
        for (int k = Start; k < End; k++) {
            if (i < Mid && (j >= End || Array[i] <= Array[j])) {
                WorkingArray[k] = Array[i];
                i++;

            } else {
                WorkingArray[k] = Array[j];
                j++;

            }


        }
    }


}
