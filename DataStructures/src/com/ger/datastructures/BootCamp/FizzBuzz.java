package com.ger.datastructures.BootCamp;

import com.ger.datastructures.Main;

public class FizzBuzz {

    public static void main(String[] args) {

        FizzBuzz(100);
    }


    // O(n)
    public static void FizzBuzz(int n) {

        if (n == 0) {
            return;
        }

        FizzBuzz(n - 1);

        int mod5 = n % 5;
        int mod3 = n % 3;
        Object result =
                (mod5 + mod3) == 0 ? "FizzBuzz"
                : mod5 == 0 ? "Buzz"
                : mod3 == 0 ? "Fizz"
                : n;
        Main.p(result);

    }


}
