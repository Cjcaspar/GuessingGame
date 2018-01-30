package com.company;


import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        game();
        //Starts game
        playAgain();
        //collects user input to determine if they want to play again
    }

    private static void game() {
        //Method that starts the game
        int difficulty = getDifficulty();

        int numGuess = -1;
        Random rand = new Random();
        //Initialize random method

        Scanner scanner = new Scanner(System.in);
        //Initialize scanner class

        if (difficulty == 1) {
            numGuess = 10;
        } else if (difficulty == 2) {
            numGuess = 7;
        } else if (difficulty == 3) {
            numGuess = 5;
        }
        //If statement that sets number of guesses allowed based on input from the user.

        int n = rand.nextInt(100) + 1;
        //randomly generate a number between 1 and 100

        MessageUtils.instructions(numGuess);


        for (int i = 0; i < numGuess; i++) {
            int guess = -1;

            while (guess < 1 || guess > 100) {
                MessageUtils.guessNumber(i);
                String guessString = scanner.nextLine();

                try {
                    guess = Integer.parseInt(guessString);
                    if (guess < 1 || guess > 100) {
                        MessageUtils.invalidInput();
                    }
                } catch (Exception e) {
                    MessageUtils.invalidInput();
                }
            }
            //While loop takes user input, to guess the random number. Try catch will stop program from crashing in the case of an exception

            if (n == guess) {
                MessageUtils.equals(i);
                break;
            } else if (n > guess) {
                MessageUtils.lower();
            } else if (n < guess) {
                MessageUtils.higher();
            }
            if (i == (numGuess - 1)) {
                MessageUtils.wrong(n);
            }
            //if statement compares guess to the randomly generated number. Then outputs to user based on comparison.
        }
    }

    private static void playAgain() {
        //Method will collect user input to determine if they want to play again.
        boolean playAgain = true;
        while (playAgain) {
            Scanner scanner = new Scanner(System.in);

            MessageUtils.playAgain();
            //output instructions asking user if they want to play again.
            String playString = scanner.nextLine();
            //Collects user input
            char play = 'a';
            //initializing variable

            while (play != 'y' && play != 'n') {
                try {
                    play = playString.charAt(0);
                } catch (Exception e) {
                    MessageUtils.close();
                }
            }
            //converts user input to y or n. will catch if input is not y or n.

            if (play == 'y') {
                game();
            }
            else {
                playAgain = false;
            }
        }
    }

    private static  int getDifficulty() {
        //Method collects user input
        Scanner scanner = new Scanner(System.in);


        //Output to user for instructions on selecting difficulty

        int difficulty = -1;
        //initiating difficulty

        do {
            MessageUtils.selectDifficulty();
            String difficultyString = scanner.nextLine();
            try {
                difficulty = Integer.parseInt(difficultyString);

            } catch (Exception e){
                MessageUtils.difficultyError();
            }
        }
        while (difficulty != 1 && difficulty != 2 && difficulty != 3);
        //while loop ensures input is valid, and sets input to variable difficulty.

        return difficulty;

    }
}


//1. Allow user input of a number (guess)
//2. Tell the user if their guess is too high or too low.
//4. Allow 5 chances, if the number isn't guessed, tell them what it is.
//4. If the number is guessed, congratulate them.
//5. Allow the user to play again if they would like.
