package com.tts;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int correctNumber = 7;

        System.out.println("Guess the Number 1-10");
        // Makes input an integer
        int guessedNumber = Integer.parseInt(userInput.nextLine());
        
        if (guessedNumber == correctNumber) {
            System.out.println("Wow, that's correct!");
        } else if (guessedNumber > correctNumber) {
            System.out.println("Nope, too high! Would you like to try again?");
        } else if (guessedNumber < correctNumber)
            System.out.println("Nope, too low! Would you like to try again?");

        // Need to figure out how to loop and exit program if anything other than int is inputted.
        else {
            System.out.println("That's not a number!");
            System.exit(0);
        }
    }
}