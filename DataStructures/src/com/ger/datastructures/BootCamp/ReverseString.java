package com.ger.datastructures.BootCamp;

import com.ger.datastructures.Main;

import java.io.PrintStream;


public class ReverseString {



public static void main(String[] args){

Main.p(reverse("German"));

}


// O(n)
public static String reverse(String str){

    StringBuilder reverseString =  new StringBuilder();
    for(int i = str.length()-1 ; i>= 0; i--){
        reverseString.append(str.charAt(i));

    }
    return reverseString.toString();
}



}
