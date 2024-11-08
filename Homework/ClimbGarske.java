/* ClimbGarske.java
 *
 * This program simulates a person climbing a mountain. It generates random
 * variables for the steps taken and how much you fall till it reaches the top
 * There is a 50% chance that they either fall or climb up the moutnain each
 * time.
 * SELF GRADE at bottom
 */

import java.util.*;
public class ClimbGarske {
    //no code here
}

class RockClimb {

    public static final int MAX_HEIGHT = 30;  //max height of a mountain

    //main function
    public static void main(String [] args) {
        description();
        execute();
    }

    /* Executes the main workflow of the program */
    public static void execute() {
        boolean b = true;
        Scanner kb = new Scanner (System.in);
        while(b) {
            climbUp();
            String user = yesNoAnswer(kb);
            if(user.equalsIgnoreCase("no"))
                b = false;
        }
    }

    /* This method asks the user to enter yes/no answer.
    as long as the user is not entering a valid answer,
    the program must loop */
    public static String yesNoAnswer(Scanner kb) {

        String user = "";
        // while not equal to yes or no
        while(!user.equalsIgnoreCase("yes") && !user.equalsIgnoreCase("no"))
        {
            //prompt the user to see if they want to climb upanother mountain
            System.out.print("Do you want to climb the mountian agin? (yes/no): ");
            user = kb.nextLine();
        }
        return user;
    }

    /* this method asks the height of the rock that a person will climb
    Data validation must be done to ensure that the highet is a positive integer
    while loop and do- while loop must be used. */
    public static int getHeight() {
        //create a scnner object
        //declare a variable of type int to hold the height of the mountain
        Scanner kb = new Scanner(System.in);
        int h = 0;

        do {
            //prompt the user to enter the heigh
            System.out.print("Enter the height of the mountian (0-"+MAX_HEIGHT+"): ");
            while(!kb.hasNextInt()) {
                System.out.print("Invalid input enter a valid integer: ");
                kb.next();
            }
            h = kb.nextInt();

            //if h is less than 0 fail and retry
            if (h < 0)
                System.out.println("Height cannot be a negative number: ");
            //if h is greater than 30 fail and retry
            if (h > MAX_HEIGHT)
                System.out.println("Height cannot be greater than "+MAX_HEIGHT);

        } while(h < 0 || h > MAX_HEIGHT);

        System.out.println("You are about to climb a mountain with the height " + h + ". Ready? Get set, go!");
        return h;
    }

    /* This is responsible for the climbing up
    and down section increminting and updating
    the height till it reaches the top. */
    public static void climbUp() {
        int distance = 0;  // Distance that the user has climbed so far
        int slip = 0;      // Number of times the user slipped down

        // Call the method getHeight and store the result in a variable named h
        int h = getHeight();

        int left = h;      // The height that is left to climb

        // Create a Random object
        Random rand = new Random();

        do {
            int r = 0;
            int steps = 0;

            // Generate a random number between 0 and 1 inclusive and store it in r
            r = rand.nextInt(0, 2);

            // If r is equal to 0
            if (r == 0) {
                // Generate a random number between 1 and 5 inclusive for steps
                steps = rand.nextInt(1, 6);

                // If h - distance is less than steps
                if (h - distance < steps) {
                    steps = h - distance;
                }

                // Update total distance climbed
                distance += steps;
                left = h - distance; // Recalculate steps left

                System.out.println("You climbed up " + steps + " steps.");

                if (left > 0) {
                    System.out.println("You are " + left + " steps away from the top of the mountain.");
                } else {
                    System.out.println("*************CONGRATULATIONS****************");
                    System.out.println("You reached the top of the mountain!");
                    System.out.println("While climbing, you slipped " + slip + " times.");
                    System.out.println("*********************************************\n");
                }
            } else {
                // Slipping down
                if (distance > 0) { // make sure climed steps before slipping

                    // make rand rum
                    int down = rand.nextInt(1, 6);

                    System.out.println("Sorry, you slipped down " + down + " step(s).");

                    // if d > slip update total distance climbed
                    if (distance > down) {
                        distance -= down;
                        slip += down;
                    } else {
                        distance = 0;
                    }

                    // Update the remaining steps
                    left = h - distance;

                    // Ensure remaining steps do not exceed mountain height
                    if (left > h)
                        left = h;

                    System.out.println("You are " + left + " steps away from the top of the mountain.");
                }
            }
        } while (distance < h); // Continue until the user reaches the top
    }

    /*
    This method displays a description for the program.
    create your own description. Do not use the provided one
    */
    public static void description()
    {
        System.out.println("""
            =======================================================================
            | This is a simple game where you will climb up a mountain. You can   |
            | enter the height of the mountain and you might fall down or climb up|
            | fate will decide how long it takes you!                             |
            =======================================================================
            """);
    }
}


/*==============================SELF GRADE===================================*/
/*
Name: Aidan Garske
Date: 11/8/24
I gave myself a 100% because...
- Extra feature abs value 15 pts
- Properly named my Class as 'ClimbGarske'            5pts
- Proper indentation followed                         5pts
- Descriptive well-placed comments                    5pts
- Program builds and runs                             50pts
- Follows requirements.                               30pts
- Self-grade                                          5pts
total:                                                105pts
percent:                                              100%
Testimony: I have done all the coding myself without getting help from any
resources: Aidan Garske
*/
/*===========================================================================*/