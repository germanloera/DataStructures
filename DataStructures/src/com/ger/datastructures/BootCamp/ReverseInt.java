package com.ger.datastructures.BootCamp;

import com.ger.datastructures.Main;

public class ReverseInt {

    public static void main(String[] Args){

       Main.p( ""+ reverseInt(-1575));


    }


    public static int reverseInt(int value){
        int result = 0;
     int pow = 0;
        while (value != 0 ){
            result += (value % 10) * Math.pow(10, pow );
            value /= 10;
            pow ++;
        }


return result;
    }

}
