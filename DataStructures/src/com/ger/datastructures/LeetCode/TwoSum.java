package com.ger.datastructures.LeetCode;

import com.ger.datastructures.Main;

public class TwoSum {

//
//    Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//    You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//    Example:
//
//    Given nums = [2, 7, 11, 15], target = 9,
//    Because nums[0] + nums[1] = 2 + 7 = 9,
//            return [0, 1].

    // https://leetcode.com/problems/two-sum/description/


    // O (n log n)
    public static int[] twoSum(int[] nums, int target) {
        int[] positions = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int val = target - nums[i];

            for (int j = i + 1; j < nums.length; j++) {

                if (val == nums[j]) {
                    positions[0] = i;
                    positions[1] = j;
                    return positions;
                }

            }


        }

        Main.p("Not found");

        return null;
    }


    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int[] result = twoSum(nums, 6);
        
        for(int n : result) {
            Main.p(n);
        }

    }

}
