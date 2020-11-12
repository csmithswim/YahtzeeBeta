package com.csmithswim;
import java.util.Scanner;
import javax.swing.JOptionPane;

//implement do/while loop to exit only when input = 'quit' or totalScore != 0;
public class Main {

    public static void main(String[] args) {
        boolean play = true;

        while (play == true){
            Game game1 = new Game();
            System.out.println("Welcome To Career Dev's Yahtzee, type 'start' to begin a new game");
            Scanner scan = new Scanner(System.in);
            String firstRoll = scan.next();

            if (firstRoll.equals("start")) {
                game1.rollDice(5);
                String secondRoll = scan.next();
                if (secondRoll.equals("roll")) {
                    game1.rollDice(5);
                    String thirdRoll = scan.next();
                }
                return;
            }
        }
    }

}



//            for (int i = 0; i <= numberOfDice; i++){
//
//            double rand = Math.random()*numberOfDice;
//            int iRand;
//            iRand = (int)rand;
//            roll.add(iRand);
//            }
//
//            System.out.println(roll);
//
//
