package com.ger.datastructures.BootCamp;

import com.ger.datastructures.Main;

public class ReverseInt {

    public static void main(String[] Args){

        Main.p( ""+ reverseInt(-1575));

    }


    public static int reverseInt(int value){
        return ~value;

    }

}
