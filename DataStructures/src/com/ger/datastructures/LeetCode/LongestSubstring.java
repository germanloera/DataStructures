package com.ger.datastructures.LeetCode;

import com.ger.datastructures.Main;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {


//    Given a string, find the length of the longest substring without repeating characters.
//
//    Examples:
//
//    Given "abcabcbb", the answer is "abc", which the length is 3.
//    Given "bbbbb", the answer is "b", with the length of 1.
//    Given "pwwkew", the answer is "wke", with the length of 3.
//    Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> elements = new HashSet<>();
        Set<Character> dummy = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            char  next = 0;
            boolean containsCurrent =  dummy.contains( current);
            boolean containsNext = false;
            if( i + 1 < s.length()){
                next = s.charAt(i+1);
                containsNext = dummy.contains( next);
            }


            if(( containsCurrent && containsNext) || (current ==  next) ){
                if(!containsCurrent){
                    dummy.add(current);
                }

                elements = getLonger(elements, dummy);
                dummy = new HashSet<>();
                dummy.add(current);
            }else if( containsCurrent && !containsNext){
                continue;
            }else if( !containsCurrent && containsNext){
                elements = getLonger(elements, dummy);
                dummy = new HashSet<>();
                dummy.add(current);
            }else{
                dummy.add(current);
            }


         }

        elements = getLonger(elements, dummy);

        Main.p(elements);
        return elements.toArray().length;
    }


    public static Set<Character> getLonger(Set<Character> elements, Set<Character> dummy) {

        int elementsLength = elements.toArray().length;
        int dummyLength = dummy.toArray().length;
        if (dummyLength > elementsLength) {
            elements = dummy;
        }
        return elements;


    }

    public static void main(String[] args) {

        String[] values = //{"abcabcbb", "bbbbb", "pwwkew", "dvdf", "anviaj", "cdd"};
                {"ckilbkd"};

        for (String s : values) {

            Main.p(lengthOfLongestSubstring(s));
            Main.p("");
        }
    }


}
