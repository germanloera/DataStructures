package com.ger.datastructures;

import com.ger.datastructures.Sorting.BubbleSort;
import com.ger.datastructures.Sorting.InsertionSort;
import com.ger.datastructures.Sorting.SelectionSort;
import com.ger.datastructures.Sorting.ShellSort;

import java.io.PrintStream;
import java.util.Random;

public class Main {

    public  static void p(Object str) {
        System.out.println(str);
    }
    public static void printArray (String algoritmo, int[] array){

        System.out.print(algoritmo + ": ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println();

    }

    public static void main(String[] args) {
	// write your code here
        int[] array = {10,5,89 ,21,-4,-62 ,8,45, 66, -9,12, 22, 58, -1,-12};

        printArray("Original", array);

        ShellSort.Sort(array, array.length/2);

    }
}
