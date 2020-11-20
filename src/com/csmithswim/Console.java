package com.csmithswim;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Console {
    static Scanner scanner = new Scanner(System.in);

    static public void welcome(){
        System.out.println("Welcome To Career Dev's Yahtzee. \nThis is your first roll:");}
    //Display and creates scanner object to take one number
    static public int getChoice(){
        System.out.println("Pick a die 1-5 to re-roll: ");
        int choice = scanner.nextInt();
        return choice - 1;
    }
    //Always do logic, then validation and then sanitization
    static public List<Integer> getChoices(){
        System.out.println("Pick any die 1-5 to re-roll: ");
        String choice = scanner.nextLine();
        String splitChoice[] = choice.split("");
        List<Integer> choices = new ArrayList<>();
        for (var i : splitChoice) {
            int userInput = Integer.parseInt(i)-1;
            choices.add(userInput);
        }
        return choices;
    }
}


