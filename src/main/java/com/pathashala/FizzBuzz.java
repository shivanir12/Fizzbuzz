package com.pathashala;

public class FizzBuzz {

    public static int value;
    public FizzBuzz(int i) {
        value=i;
    }

    public static String multiple() {
        if(value==3)
            return "fizz";
        else if(value==5)
            return "buzz";
        return null;
    }
}
