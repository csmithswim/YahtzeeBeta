package com.csmithswim;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Die {
    private int sides = 6;
    private int value = 1;

    public Die() {
        sides = 6;
        value = 1;
    }

    public void roll(Random rand) {
        value = rand.nextInt(sides) + 1;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString(){

       return ""+value;
    }

}












