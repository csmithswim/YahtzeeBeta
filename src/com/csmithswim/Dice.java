package com.csmithswim;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Dice {
    int counter = 3;
    ArrayList<Integer> currentRoll = new ArrayList<Integer>();
    ArrayList<Integer> diceKept = new ArrayList<Integer>();

    public void keepSelectedDice(String diceToBeRemoved){
        String[] splitDice = diceToBeRemoved.split("");

            for (String dice : splitDice) {
                diceKept.add(currentRoll.remove(Integer.parseInt(dice)));
                currentRoll.add(Integer.parseInt(dice),Integer.parseInt(dice));
            }

    currentRoll = diceKept;
        System.out.println(currentRoll);
        System.out.println(diceKept);

        System.out.println("\nThese are the dice you have kept:\n\n"+diceKept+".");

    }

    public void rollSelectedDice(){
//        System.out.println(currentRoll.size());
//        System.out.println(currentRoll);

        ArrayList<Integer> roll = new ArrayList<Integer>();
        for (int i = 0; i <= 4-currentRoll.size(); i++) {
            double rand = Math.ceil(Math.random() * 6);
            int iRand;
            iRand = (int) rand;
            roll.add(iRand);
        }
        System.out.println("\nThese are the dice you have put aside:\n"+currentRoll);
        System.out.println("\n   Dice \n"+roll);
        System.out.println("--------------\n 0  1  2  3  4");
        System.out.println("\nYou have " +(counter-1) + " roll(s) left.\n");
        counter--;
        currentRoll = roll;
    }

    public void rollAllDice() {
        ArrayList<Integer> roll = new ArrayList<Integer>();
        for (int i = 0; i <= 4; i++) {
            double rand = Math.ceil(Math.random() * 6);
            int iRand;
            iRand = (int) rand;
            roll.add(iRand);
        }
        System.out.println("\n\n    Dice    \n"+roll + "\n--------------\n 0  1  2  3  4");
        System.out.println("\nYou have " + (counter-1) + " rolls left.");
        counter--;
        currentRoll = roll;
    }
}
