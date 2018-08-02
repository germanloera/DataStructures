package com.ger.datastructures.BootCamp;

import com.ger.datastructures.Main;

public class Capitalization {

    public static final int a = (int) 'a';
    public static final int A = (int) 'A';
    public static final int space = a - A;


    public static void main(String[] args) {

        Main.p(toUpperCase("Germán Raúl Loera Velasco"));

    }

    public static String toUpperCase(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int c = (int) str.charAt(i);
            if (c < a) {
                result.append((char) c);
            } else {
                char upperCase = (char) (c - space);
                result.append(upperCase);
            }
        }
        return result.toString();

    }

}
