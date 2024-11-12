/* QuizGarske.java
 *
 * This app generates random numbers to complete the random scores, numbers,
 * and operations. The user has to solve the problem based on the given operation
 * in this case I added 5 new ones on top of the 5 preexisting ones sop there is
 * 10 that can be chosen.
 * - SELF GRADE AT BOTTOM
 */

import java.util.*;
public class QuizGarske {
    // no code here
}

class Quiz {
    public static void main(String[] args) {
        makeExam();
    }

    /* DONE
    This method declares 3 arrays to hold questions, answers and the points for each question.
    calls the method populate to fill in the three arrays with math questions, answers and points
    */
    public static void makeExam() {
        Scanner kb = new Scanner(System.in);
        Random rand = new Random();
        int size = rand.nextInt(10- 5+ 1 ) + 5; //randomly select the number of the questions for the quiz
        //declare an array of String named questions to hold each test question, with the length of the variable size

        String[] questions = new String[size];

        //declare an array of int called answers to hold the correct answer for each questions that is in the array questions
        int[] answers = new int[size];

        //declare an array of int called points that holds the pints for each quiz question.
        int[] points= new int[size];

        // Random  rand = new Random();

        boolean repeat = true;
        /*the code in the given while cannot be changed*/
        while(repeat)
        {

        populate(questions,answers,points);  //initializes the three arrays with questions, answers and points

        int[]  score = takeExam(answers,points, questions) ;  // score will hold the points earned for each peoblem
        System.out.println("Here are the scores for each question: ");
        System.out.println(Arrays.toString(score));
        int total = total(score);
        System.out.println("Total points earned: " + total);
        System.out.println("\n\nDo you want to take the again!!!!");
        String user = yesNoAnswer(kb);
        repeat = user.equalsIgnoreCase("yes");

        }
    }

    /* DONE
    This method accepts an array of integers and
    returns the sum of all the numbers stored in the array */
    public static int total(int[] scores) {
        //declare an int called total , set it to zero
        int total = 0;

        //for i = 0 to the length of the array)
        for (int i = 0; i < scores.length; i++) {
            total += scores[i];
        }
        //return total;
        return total;
    }

    /* DONE
    This method asks the user to enter yes/no answer.
    as long as the user is not entering a valid answer,
    the program must loop */
    public static String yesNoAnswer(Scanner kb) {

        String user = "";
        // while not equal to yes or no
        while (!user.equalsIgnoreCase("yes") && !user.equalsIgnoreCase("no")) {
            //prompt the user to see if they want to climb upanother mountain
            System.out.print("Do waqnt to take quiz agin? (yes/no): ");
            user = kb.nextLine();
        }
        return user;
    }

    /* DONE
    This method choose an operation and returns it
    a random number must be generated to use as an index for the string "*%/+-^"
    for example if the random number is 1 then % will be selected. s.charAt(index) should be used
    Extra feature(15) : must add 5 different operations from the math class:
    These methods are  ceil, max, min, absolute value, log
    These extra operations must be added to the array in the givemn method below
    'c' for "ceil"
    'm' for "max"
    'n' for "min"
    'a' for "abs"
    'l' for "log"
    */
    public static char getOp(Random rand) {
        String[] s = {"*", "%", "/", "+", "-", "^", "c", "m", "n", "a", "l"};
        //generate a random number and store it in a variable called index in the range of 0-4 inclusive
        int index = rand.nextInt(s.length);

        //return the char at the given index in string s
        return s[index].charAt(0);
    }

    /* DONE
    this method select a random number for out simple expression (num operation num ) and returns it
    this method fills an array of int with the size 100 with random numbers 1-50
    once the array is filled with random numbers, we select a number from the array randonmly; */
    public static int getNum() {
        int size = 100;
        Random rand = new Random();
        //declare an array of int called nums with size 100
        int[] nums = new int[size];

        //initialize the array with 100 randon numbers between 1-50 by using a for loop

        //for i = 0 to i less than the lenght of the array you declared: nums.length
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rand.nextInt(1, 51);
        }

        //declare an int variable called index and set it to a random number 0-100
        //which will be the index of the array. 100 is not a valid index
        int index = rand.nextInt(nums.length);

        //return  the value stored in the array at index
        return nums[index];
    }

    /* DONE
    This method generates math expressions randomly, the operations used are /+ * % -  plus the extra one you must add
    each math expression will be stored in the array called quiz, the correct answer for each expression will be stored
    in the array answe, and the points for each question will be stored in the array points.
    max and min are used to generate a random number between min and max for each number.
    Valid operations are stored in the array operation. a random number between 0 and 3 must be generated
    to pick a random operation
    and assign points for each question in the array values
    This method has to be modified based on the aded extra operations.
    some of the added operations are uniary thefore only one opernad is needed */
    public static void populate(String[] quiz, int[] answer,  int[] points) {
        Random rand = new Random();
        for(int i =  0; i < quiz.length; i++) {
            //dexlare an int called num1 and set it to getNum()
            int num1 = getNum();

            //declare an int called num2 and set it to getNum()
            int num2 = getNum();

            // get the random operator
            char op = getOp(rand);

            //declare a variable of type String and set it to getOp(rand)
            //if operand is log ceil or floor we only need one operand,
            String expression = "";
            if (op == 'c' || op == 'l' || op == 'a') {
                expression = num1 + " " + op; // if expression is not binary
            } else {
                expression = num1 + " " + op + " " + num2; // if binary
            }
            // store user answer in answer array
            quiz[i] = expression;

            // calculate the actual answer...
            int correctAnswer;
            if (op == 'c' || op == 'l' || op == 'a') {
                correctAnswer = evaluate(num1, 0, String.valueOf(op)); // if expression is not binary
            } else {
                correctAnswer = evaluate(num1, num2, String.valueOf(op)); // if binary
            }
            // store the correct answer
            answer[i] = correctAnswer;

            // set the earned points from 1 to 10
            int earnedPoints = rand.nextInt(1, 11);
            points[i] = earnedPoints; // set points in array
        }
    }

    /* DONE
    this method gets two numbers and an operator and returns the result
    do not change anything in this method. The order of the parameters should not be changed
    Cannot use switch statments. codes using cse/switch will get no points
    Extra feature 15 points:
    The code in the following method must be modified to include the 5 extra operations you added in the method getOp */
    public static int evaluate(int num1, int num2, String op) {
        if(op.equalsIgnoreCase("*")) {
            return num1 * num2;
        } else if (op.equalsIgnoreCase("/")) {
            if (num2 != 0)
                return num1 / num2;
        } else if (op.equalsIgnoreCase("-")) {
            return num1 - num2;
        } else if (op.equalsIgnoreCase("+")) {
            return num1 + num2;
        } else if (op.equalsIgnoreCase("%")) {
            return num1 % num2;
        } else if (op.equalsIgnoreCase("c")) {
            // Unary operation: ceil
            return (int) Math.ceil(num1);
        } else if (op.equalsIgnoreCase("l")) {
            // Unary operation: log (base e)
            return (int) Math.log(num1);
        } else if (op.equalsIgnoreCase("a")) {
            // Unary operation: absolute value (num1 only)
            return Math.abs(num1);
        } else if (op.equalsIgnoreCase("m")) {
            // Unary operation: max(num1, num2)
            return Math.max(num1, num2);
        } else if (op.equalsIgnoreCase("n")) {
            // Unary operation: min(num1, num2)
            return Math.min(num1, num2);
        }
        return 0; // Default case
    }

    /* DONE
    this method gets the three arrays containg the questions, the correct answers and the points for each question
    this method displays one question at a time for the user to answer, verifies the user's answer
    by comparing it to the proper index in the answers array
    if the person's answer is correct then the points will be stored in an array.
    this method returns an array
    Do not change the return or the list of the parameters in this method */
    public static int[] takeExam(int[] answers, int[] values, String[] questions) {

        info();
        int[]  scores = new int[answers.length]; //this arrays holds the points for each question the user answers it correctly
        Scanner kb = new Scanner(System.in);

        for (int  i = 0; i < answers.length; i++) {
            //3. display the question in the questions array at the index i
            System.out.println("Question " + (i + 1) + ": " + questions[i]);

            //4. declare an int variable called ans to store the user's answer
            //call the method getAnswer to get the user's response)
            int ans = getAnswer(kb);

            //if ans is equal to the answers[i]
            if (ans == answers[i]) {
                //set scores at index i to values at index i
                scores[i] = values[i];
                //display the message correct
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect...");
            }
        }
        //return the array scores
        return scores;
    }

    /* DONE
    Extra feature 5 points: This method prompts the user to enter the answer.
    The data type for the asnwer is a double. as long as the  user
    is not entering a double keep propmting the user. hasNextDouble method must be used
    Confused here it says double but your outline code returns an int im assuming its an int. */
    public static int getAnswer(Scanner kb) {
        System.out.print("Enter your answer: ");
        while (!kb.hasNextInt()) {
            System.out.print("Invalid input. Please enter an integer: ");
            kb.next();
        }
        return kb.nextInt();
    }

    /*Must display information about this app. It has to be your own creation  and not a copy of the given info*/
    public static void info() {
        System.out.println("""
            =======================================================================
            | This app gives you random practice problems with the operations...  |
            | +, -, /, *, %, ceil, max, min, absolute value, and log              |
            | for the unary values:                                               |
            | 'c' for ceil - find the nearest whole number                        |
            | 'm' for max - find the max of the two numbers                       |
            | 'n' for min - find the max of the two numbers                       |
            | 'a' for abs - find the absolute value of a nummber                  |
            | 'l' for log - Calculates the natural logarithm (base e) of a number |
            | You will be asked math questions and points will be rewarded.       |
            | Lets take the quiz!                                                 |
            =======================================================================
            """);
    }
}

/*==============================SELF GRADE===================================*/
/*
Name: Aidan Garske
Date: 11/12/24
I gave myself a 100% because...
- Extra feature abs value 35 pts
- Properly named my Class as 'QuizGarske'             5pts
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