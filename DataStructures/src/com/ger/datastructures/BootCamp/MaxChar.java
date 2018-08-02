package com.ger.datastructures.BootCamp;

import com.ger.datastructures.Main;

import java.util.HashMap;
import java.util.Map;

public class MaxChar {

    public static void main(String[] args) {

        Main.p(MaxChars("German Raul Loera Velasco").toString());

    }

    // O(n)
    public static Map<Character, Integer> MaxChars(String str) {
        str = str.toLowerCase();
        Map<Character, Integer> chars = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            Character c = new Character(str.charAt(i));
            if (chars.containsKey(c)) {
                Integer value = chars.get(c);
                chars.replace(c, ++value);
            } else {
                chars.put(c, 1);
            }
        }


        return chars;
    }


}
