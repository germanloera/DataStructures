package com.ger.datastructures.BootCamp;

import com.ger.datastructures.Main;

import java.lang.reflect.Array;
import java.util.*;

public class Anagrams {


    public static void solve(String[] anagrams) {
        HashMap<String, List<String>> result = new HashMap<>();

        for (String word : anagrams) {

            Set<String> keys = result.keySet();
            char[] wordSorted = word.toCharArray();
            Arrays.sort(wordSorted);
            boolean added = false;
            if (keys.isEmpty()) {
                result.put(word, new ArrayList());
                continue;
            }

            for (String key : keys) {
                if(key.length() != word.length()){
                    continue;
                }

                char[] keySorted = key.toCharArray();
                Arrays.sort(keySorted);
                boolean equals = Arrays.equals(wordSorted, keySorted);

                if (equals) {
                    result.get(key).add(word);
                    added = true;
                }
            }

            if (!added) {
                result.put(word, new ArrayList());
            }


        }
        Main.p(result);

    }


    public static void main(String[] args) {
        String[] anagrams = {
                "star",
                "elvis",
                "velasco",
                "death",
                "hated",
                "lives",
                "rats",
                "arts",
                "german",
                "listen",
                "silent",
                "resistance",
                "ancestries",
                "margen",
                "raul",
                "protectional",
                "easter",
                "eaters",
                "loera",
                "lactoprotein",
                };

        Anagrams.solve(anagrams);

    }


}
