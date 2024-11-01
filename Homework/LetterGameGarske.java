/* LetterGame.java
 *
 * This is a simple game that involves the users input and
 * random varaibles. It creates a random number between 10-100
 * or a random letter between A and Z depending on wha the user
 * chooses
 */

import java.util.*;
public class LetterGameGarske
{
   //no code here
}


class LetterGame {
    /* DONE
    main function carries out intro
    to the game and calls the main function. */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        introduction();
        funGame(console);
    }

    /* DONE
    main function that carries out the
    letterGuess and numberGuess functions
    and also deals with the yes or no while
    loop. instead of asking how many times
    they want to play ask when they want to
    end the game. */
    public static void funGame(Scanner console) {
        int numGames = 0;   //total number of the games the user played
        int totGuesses = 0;  //total guesses made by the user in all the games played
        int max = 0;   //hold the maximum number of guesses in each game

        //declare a string varibale and initialized to "YES"
        String again = "YES";

        //while again is equals to "YES " same person playing
        while ("YES".equals(again)) {
            int guesses = 0;

            System.out.print("Do you want to guess numbers or letters. Enter letter or number? ");
            String choice = console.next();
            if (choice.equalsIgnoreCase("letter")) {
                guesses = letterGuess(console);  //starts the letter game
            }
            else if (choice.equalsIgnoreCase("number")) {
                guesses = numberGuess(console);  // starts the number game
            }

            //call the method funGame and store the result in an int varibale called guesses

            //set max to guesses
            if (guesses > max) {
                max = guesses;
            }

            //set totGuesses = totGuesses + guesses
            totGuesses = totGuesses + guesses;

            //increment numGames
            numGames++;

            //call the method playAgain and store the result in the variable again
            again = playAgain(console);

            System.out.println();
        } //end while loop
    }


    /* DONE
    This method ask the user to enter
    YES or NO answer until the user
    enters the correct answer */
    public static String playAgain(Scanner console) {
        String response = "";

        /* Ask user till get "YES" or "NO" */
        System.out.print("Do you want to play again(YES/NO)? ");
        while (!"YES".equals(response) && !"NO".equals(response)) {
            response = console.nextLine().toUpperCase();
        }

        return response;
    }

    /* DONE
    This method will generated a random
    letter between A and Z and asks the user
    to make the guess. Must keep track of the
    number of the guesses that the user made. */
    public static int letterGuess(Scanner console) {
        // Create a Random object
        Random rand = new Random();

        int min = 65;
        int max = 91;

        // Create random # betweem 65 and 91(90)
        int num = rand.nextInt(min, max);

        // change num to char
        char pick = (char)num;

        char guess =' ';    // holds the user's guess
        int letterGuesses = 0;   //holds the total guesses the user made in one round of the game
        boolean done = false;  //signals the end of the loop, meaning the user made the correct guess
        System.out.println("I am thinking of a letter betweem A and Z... Guess what it is!");
        //while (!done)
        while (!done) {
            //increment numGuesses
            letterGuesses++;

            //call the method userRespond and store the result in the variable guess
            guess = userRespondLetter(console);

            //if guess is equal to pick
            if (guess == pick) {
                //set done to true
                done = true;
                //display a message "You got it"
                System.out.println("You got it!");
            }
            //else if guess is less  than pick
            else if (guess < pick)
            {
                //display higher
                System.out.println("Higher...");
            }
            // else
            else
            {
                //display lower
                System.out.println("Lower...");
            }
        }

        // print the amount of guesses needed to get right.
        System.out.println("You got it right in " + letterGuesses + " guesses");
        System.out.println();
        return letterGuesses;
    }

    /* DONE
    method must be implemented by you. The code is similar
    to the letterGuess method. Must use the same logic and
    formating */
    public static int numberGuess(Scanner console) {
        // Create a Random object
        Random rand = new Random();

        int min = 10;
        int max = 101;

        // Create random # betweem 10 and 101(100)
        int num = rand.nextInt(min, max);

        // Make pick num
        int pick = num;

        int guess = 0;    // holds the user's guess
        int numGuesses = 0;   //holds the total guesses the user made in one round of the game
        boolean done = false;  //signals the end of the loop, meaning the user made the correct guess
        System.out.println("I am thinking of a number between 10 and 100... Guess what it is!");
        //while (!done)
        while (!done) {
            //increment numGuesses
            numGuesses++;

            //call the method userRespond and store
            // the result in the variable guess
            guess = userRespondNumber(console);

            //if guess is equal to pick
            if (guess == pick) {
                //set done to true
                done = true;
                //display a message "You got it"
                System.out.println("You got it!");
            }
            //else if guess is less  than pick
            else if (guess < pick)
            {
                //display higher
                System.out.println("Higher...");
            }
            // else
            else
            {
                //display lower
                System.out.println("Lower...");
            }
        }

        // print the amount of guesses needed to get right.
        System.out.println("You got it right in " + numGuesses + " guesses");
        System.out.println();
        return numGuesses;
    }

    /* DONE
    This method gets the user's respond. The user must enter a letter
    between 'A' and 'Z' the method will keep asking until the user
    enters a valid input between 'A' and Z a while loop must be used. */
    public static char userRespondLetter(Scanner kb) {
        char guess = ' ';
        boolean firstTry = true;
        System.out.print("Guess a letter between A-Z: ");

        // 1. Declare a variable of type String and get the user's input
        String input = kb.nextLine().toUpperCase();

        // 2. Declare a variable of type char called guess and
        // store the first letter of the user's response in it.
        // Must use charAt() method.
        //check make sure length is not 0
        if (input.length() != 0) {
            guess = input.charAt(0);
        }

        // While the length of the user's guess is not equal to
        // 1 or the first letter of user's guess is less than 'A'
        // or greater than 'Z'
        while (input.length() != 1 || guess < 'A' || guess > 'Z' || guess == ' ') {
            // Invalid input, prompt the user
            if (!firstTry) {
                System.out.println("Invalid Character. Please enter a letter between A-Z.");
                System.out.print("Guess a letter between A-Z: ");
            }
            // after the first try set to false so empty char can be recognized
            firstTry = false;

            // Reset the variable guess to the new response
            input = kb.nextLine().toUpperCase();

            // Reset the variable guess to the first letter
            // of the user's response
            if (input.length() != 0) {
                guess = input.charAt(0);
            }
        }

        // Return the variable guess
        return guess;
    }

    /* DONE
    This method asks the user to enter a number between the min and max
    as long as the input is not between min and max, keep asking the user
    to enter a valid input. This is similar to the userRespondLetter.
    refer to the sample output and for the prompts. This method must be
    created by you and must generated a very similar output. */
    public static int userRespondNumber(Scanner console) {
        int guess = 0;

        System.out.print("Guess a number between 10-100: ");

        if (console.hasNextInt()) {
            guess = console.nextInt();
        }
        // While the guess is not 10-100 and isnt a number keep going
        while (guess < 10 || guess > 100) {
            System.out.println("Invalid number. Please enter a number between 10-100.");

            //prompt the user
            System.out.print("Guess a number between 10-100: ");

            //reset the varibale guess to the new respond
            if (console.hasNextInt()) {
                guess = console.nextInt();
            }
            console.nextLine();
        }

        return guess;
    }

    /* DONE
    This method described the game being played.
    Cretae your own description and not the provided description*/
    public static void introduction() {
        System.out.println("""
            =======================================================================
            | Hello, I am the computer. I want to play a guessing game with you.  |
            | I will either think of a letter between A and Z or a number between |
            | 10 and 100. Your job is to correctly guess the letter or number that|
            |        I am thinking of. Sounds good? Lets start!                   |
            =======================================================================
            """);
    }

}