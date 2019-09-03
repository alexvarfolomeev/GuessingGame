package com.packages;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String playAgain = "";
        int counter = 0;
        do {
            int theNumber = (int) (Math.random() * 100 + 1);
            System.out.println(theNumber);
            int guess = 0;
            while (guess != theNumber) {
                System.out.println("Guess a number between 1 and 100.");
                guess = scan.nextInt();
                System.out.println("You entered " + guess + ".");
                if (guess < theNumber) {
                    System.out.println(guess + " is too low. Try again");
                } else if (guess > theNumber) {
                    System.out.println(guess + " is too high. Try again");
                } else {
                    System.out.println(guess + " is correct. You win!");
                }
                counter = counter + 1;
                System.out.println("You made " + counter + " attempts. Nice try!");
            }
            System.out.println("Would you like to play again (y / n)?");
            playAgain = scan.next();
        } while (playAgain.equalsIgnoreCase("y"));

          System.out.println("Thank you for playing!Goodbye!");
          scan.close();
        }

        }