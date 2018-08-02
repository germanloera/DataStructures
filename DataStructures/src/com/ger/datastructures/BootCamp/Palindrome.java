package com.ger.datastructures.BootCamp;

import com.ger.datastructures.Main;

public class Palindrome {

    public static void main(String[] Args){

        Main.p("Is Palindrome? " + isPalindrome("Anita la gorda lagartona no traga la droga latina"));//"Roma ni se conoce sin oro, ni se conoce sin amor"));

    }

// O( log n)
    public static boolean isPalindrome(String str){
        str = str.toLowerCase().replace(" ", "").replace(",", "");
        int i = 0;
        int middle = str.length()/2;
        do{
            boolean match = str.charAt(i) == str.charAt(str.length() - i - 1);
            if(!match){
                return false;
            }
            i++;
        }while (i <= middle);
        return true;
    }



}
