package com.ger.datastructures.LeetCode;

import com.ger.datastructures.Main;

import java.util.LinkedList;

public class AddTwoNumbers {

//    You are given two non-empty linked lists representing two non-negative integers.
// The digits are stored in reverse order and each of their nodes contain a single digit.
// Add the two numbers and return it as a linked list.
//
//    You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//
//            Example:
//
//    Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//    Output: 7 -> 0 -> 8
//    Explanation: 342 + 465 = 807.
//

    public static void AddTwoNumbers(LinkedList<Integer> n1, LinkedList<Integer> n2) {
        Main.p("" + getNumber(n1));
        Main.p("" + getNumber(n2));
    }

    public static int getNumber(LinkedList<Integer> n) {
        int result = 0;
        int pow = 0;

        for (Integer number : n) {
            result = result + number * (int) Math.pow(10, pow);
            pow++;

        }

        return result;
    }


    public static void main(String[] args) {

//        LinkedList<Integer> n1 = new LinkedList<>();
//        n1.add(2);
//        n1.add(4);
//        n1.add(3);
//
//
//        LinkedList<Integer> n2 = new LinkedList<>();
//        n2.add(5);
//        n2.add(6);
//        n2.add(4);
//
//        AddTwoNumbers(n1, n2);

        Main.p(356  );


    }


}
