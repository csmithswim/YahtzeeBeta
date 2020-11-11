package com.csmithswim;

import java.util.ArrayList;

public class Dice {

    public ArrayList<Integer> roll = new ArrayList<Integer>();

    public void rollDice(int numberOfDice){

        for (int i = 0; i <= numberOfDice; i++){

            double rand = Math.random()*numberOfDice;
            int iRand;
            iRand = (int)rand;
            roll.add(iRand);
        }

        System.out.println(roll);
    }

}
