package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int answer = 1;
        while (answer == 1) {                                //while loop to kick out user unless press 1

            System.out.println("How many dice with how many sides do you want to roll? (enter #d# format)");
            String dieRoll = input.next();
            String[] request = dieRoll.split("d");      //splits two numbers, removes the d

            int diceAmount = Integer.parseInt(request[0]);   //converts dice amount from string to integer
            int total = 0;
            int[] dice = new int[diceAmount];                //turns dice amount into array
            int numSides = Integer.parseInt(request[1]);    //converts number of sides to integer


            for (int i = 0; i < diceAmount; i++) {           //random number generator
                Random rand = new Random();
                dice[i] = rand.nextInt(numSides) + 1;
            }


            String msg = "";                                //dialogue output
            for (int die : dice) {
                msg += "You rolled a " + die + " on a " + numSides + " sided die.\n";
                System.out.println(msg);
                total += die;
            }
                                                            //loop request
            System.out.println("Press '1' to do another or exit program...");
            answer = input.nextInt();

        }

/*
        for(String die : arrayOfStr){

        }


        int numAmount = input.nextInt();


        int[] numDiceArray = new int[numAmount];
        int numSides = input.nextInt();



 */


        /*
        int total = 0;

        for (String a: dieRoll.split("d", 0)) {
            int x = Integer.parseInt(a); //convert string to integer
            int diceAmount = input.nextInt(x);
            int numSides = input.nextInt(x);
            int[] dice = new int [diceAmount];


            System.out.println(diceAmount);
            System.out.println(numSides);
        }


         */

/*

        for(int i = 0; i < 5; i++){
            Random rand = new Random();
            dice[i] = rand.nextInt(numSides) + 1;
        }

        String msg = "";
        for(int die: dice) { //same as code above
            msg += "you rolled a " + die + " on a " + numSides + " sided die.\n";
            System.out.println(msg);
            total += die;
        }


 */

/*
            for(int i = 0; i < diceAmount; i++){
                Random rand = new Random();
                dice[i] = rand.nextInt(numSides) + 1;


            }


 */


        // String[] arrayofstr = str.split("d", dieRoll);

        /*for(String a : arrayofstr)
            System.out.println(a);

         */
    }
}
