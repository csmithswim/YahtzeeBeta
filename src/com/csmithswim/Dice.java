package com.csmithswim;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Dice {
    int counter = 2;
    ArrayList<Integer> currentRoll = new ArrayList<Integer>();

    public void removeSelectedDice(String diceToBeRemoved){
        String[] splitDice = diceToBeRemoved.split("");
        System.out.println(Arrays.toString(splitDice));

       for (String dice : splitDice) {

           currentRoll.remove(Integer.parseInt(dice));
           System.out.println(currentRoll);

       }
                System.out.println(currentRoll);
    }

    public void rollSelectedDice(int numberOfDice){

    }

    public void rollAllDice() {
        ArrayList<Integer> roll = new ArrayList<Integer>();
        for (int i = 0; i <= 4; i++) {
            double rand = Math.random() * 5;
            int iRand;
            iRand = (int) rand;
            roll.add(iRand);
        }
        System.out.println(roll + "\n--------------\n 0  1  2  3  4");
        System.out.println("You have " + Integer.toString(counter) + " throws left.");
        counter--;
        currentRoll = roll;
    }
}
