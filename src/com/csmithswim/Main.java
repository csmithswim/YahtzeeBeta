package com.csmithswim;
import java.util.Scanner;
import javax.swing.JOptionPane;

//implement do/while loop to exit only when input = 'quit' or totalScore != 0;
public class Main {

    public static void main(String[] args) {
        boolean play = true;
        while (play){
            Dice dice1 = new Dice();
            dice1.introMessage();
            Scanner scan = new Scanner(System.in);
            String firstRoll = scan.next();
            if (firstRoll.equals("start")) {
                dice1.rollAllDice();
                String secondRoll = scan.next();
                if (secondRoll.equals("keep")) {
                    String nextLine = scan.nextLine();
                    String diceToRemove = scan.nextLine();
                    dice1.keepSelectedDice(diceToRemove);
                    String firstTurn = scan.nextLine();
                    if (firstTurn.equals("roll")){
                        dice1.rollSelectedDice();
                        String secondTurn = scan.nextLine();
                        if (secondTurn.equals("roll")){
                            dice1.rollSelectedDice();
                        }
                        else if (secondTurn.equals("keep")){
                            String thirdTurn = scan.nextLine();
                            dice1.keepSelectedDice(thirdTurn);
                            String fourthTurn = scan.nextLine();
                            if(fourthTurn.equals("roll")) {
                                dice1.rollSelectedDice();
                                String fifthTurn = scan.nextLine();
                                dice1.keepSelectedDice(fifthTurn);
                                play=false;
                            }
                        }
                    }
                }
                else if (secondRoll.equals("roll")) {
                    dice1.rollAllDice();
                    String thirdRoll = scan.next();
                    if (thirdRoll.equals("roll")){
                        dice1.rollAllDice();
                        play=false;
                    }
                }
            }
        }
    }
}



