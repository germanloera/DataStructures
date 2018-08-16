package com.ger.datastructures.LeetCode;

import com.ger.datastructures.Main;

public class HammingDistance {

//
// The Hamming distance between two integers is the number of positions at
// which the corresponding bits are different.
//
//    Given two integers x and y, calculate the Hamming distance.
//
//            Note:
//            0 ≤ x, y < 231.
//
//    Example:
//
//    Input: x = 1, y = 4
//
//    Output: 2
//
//    Explanation:
//            1   (0 0 0 1)
//            4   (0 1 0 0)
//                   ↑   ↑
//
//    The above arrows point to positions where the corresponding bits are different.



//    149/149 test cases passed.
//            Status:Accepted
//    Runtime:10 ms
//
//    public static int hammingDistance(int x, int y) {
//        int z = x ^ y;
//
//        String binary = Integer.toBinaryString(z);
//        binary = binary.replace("0", "");
//        return binary.length();
//    }


    public static int hammingDistance(int x, int y) {
        int z = x ^ y ;
int count = 0;
        String binary = Integer.toBinaryString(z);
       for(int i = 0; i < binary.length(); i++){
          count += binary.charAt(i) - '0';
       }



        return count;
    }

    public static void main(String[] args) {

        Main.p(hammingDistance(93, 73));//"Germán Raúl Loera Velasco"));

    }
}
