package com.csmithswim;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    public ArrayList<Integer> finalRoll = new ArrayList<Integer>();
    public ArrayList<Integer> roll = new ArrayList<Integer>();

    int counter = 2;

    public void rollDice(int input){

            for (int i = 0; i <= 4; i++) {
                double rand = Math.random() * 5;
                int iRand;
                iRand = (int) rand;
                roll.add(iRand);
            }
            System.out.println(roll + "\n--------------\n 0  1  2  3  4");
            System.out.println("Enter which dice to keep, otherwise enter 'roll' to re roll\nYou have " + Integer.toString(counter) + " throws left");
            counter--;
    }
}
