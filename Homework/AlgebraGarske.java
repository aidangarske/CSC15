/* AlgebraGarske.java */
/*
Name: Aidan Garske
Date: 10/14/24
I gave myself a 100% because...
- Extra feature abs value 30 pts
- Properly named my Class as 'AlgebraGarske'          5pts
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

import java.util.Scanner;

public class AlgebraGarske
{
}

class Operations
{
    /* Failure case */
    public static final int BAD_FUNC_ARG =  -1;

    public static void main(String[] args)
    {
        start();
    }

    /* This must be the last method to implement
    After you have implemented all the methods */
    public static void start()
    {
        double ret;
        int operand1;
        int operator;
        String word1;
        String opWord;
        String word3;
        String opChar;
        Integer operand2 = null;

        dash(40);
        System.out.println("""
            This program evaluates 2 numbers from 0-9
            with the desired operator follow the directions
            below to get started""");
        dash(40);
        System.out.println("");

        Scanner console = new Scanner(System.in);
        System.out.print("How many expressions do you have: ");
        int count = console.nextInt();
        System.out.println("");

        for (int i = 1; i <= count; i++)
        {
            list();

            System.out.println("");
            System.out.print("Operator number => ");
            operator = console.nextInt();
            console.nextLine();

            /* First number */
            System.out.print("Operand #1: ");
            operand1 = console.nextInt();
            console.nextLine();

            /* Validate input for operand1 */
            if ((operand1 < 0 || operand1 > 9) && operator != 7)
            {
                System.err.println("Oops... please enter valid input[0-9]!");
                System.exit(BAD_FUNC_ARG);
            }

            /* Second number */
            if (operator != 7)
            {
                System.out.print("Operand #2: ");
                operand2 = console.nextInt();
                console.nextLine();

                /* Validate input for operand2 */
                if (operand2 < 0 || operand2 > 9)
                {
                    System.err.println("Oops... please enter valid input[0-9]!");
                    System.exit(BAD_FUNC_ARG);
                }
            }

            /* If abs value eval only operand1 */
            if (operator == 7) {
                ret = evaluate(operand1, 0, operator);
            } else {
                ret = evaluate(operand1, operand2, operator);
            }

            /* ----------Number output---------- */
            /* Change the op number to character */
            opChar = intOpToString(operator);

            /* Print the number output */
            System.out.println("");
            dash(25);
            if (operator != 7) {
                System.out.println(operand1 + " " + opChar + " " + operand2 + " is " + ret);
            } else {
                System.out.println("|" + operand1 + "| = " + ret);
            }

            /* ----------Word output---------- */
            /* Convert to word output */
            word1 = numToWord(operand1);
            opWord = OpToWord(operator);
            word3 = (operator != 7) ? numToWord(operand2) : "";

            /* Print the word output */
            if (operator != 7) {
                System.out.println(word1 + " " + opWord + " " + word3 + " is " + ret);
            } else {
                System.out.println("The absolute value of " + operand1 + " is " + ret);
            }
            dash(25);
            System.out.println("");
        }
    }

    /* This method gets two numbers and the
     * operation and returns the result of
     * the expression */
    public static double evaluate(double a, Integer b, int op)
    {
        double ret = 0;

        if (b == null) {
            b = 0; /* default 0 if not used */
        }

        switch (op)
        {
            case 1:
                ret = a + b;
                break;
            case 2:
                ret = a - b;
                break;
            case 3:
                ret = a * b;
                break;
            case 4:
                if (b == 0) {
                    System.err.println("Division by zero is not allowed.");
                    ret = BAD_FUNC_ARG;
                } else {
                    ret = a / b;
                }
                break;
            case 5:
                ret = Math.pow(a, b);
                break;
            case 6:
                if (b == 0) {
                    System.err.println("Modulus by zero is not allowed.");
                    ret = BAD_FUNC_ARG;
                } else {
                    ret = a % b;
                }
                break;
            case 7:
                ret = Math.abs(a);
                break;
            default:
                System.err.println("Enter # from 1-7");
                System.exit(BAD_FUNC_ARG);
        }
        return ret;
    }

    /* This method gets a number 1-9 and returns
     * it in words */
    public static String numToWord(int a)
    {
        switch (a)
        {
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "unknown";
        }
    }

    /* This method gets the operation and returns
     * the name of the operation in words */
    public static String OpToWord(int operator)
    {
        switch (operator)
        {
            case 1:
                return "plus";
            case 2:
                return "minus";
            case 3:
                return "multiplied by";
            case 4:
                return "divided by";
            case 5:
                return "to the power of";
            case 6:
                return "modulus";
            case 7:
                return "absolute value of";
            default:
                return "unknown operation";
        }
    }

    /* Takes the number input and converts to
     * a string operator */
    public static String intOpToString(int op)
    {
        switch (op)
        {
            case 1:
                return "+";
            case 2:
                return "-";
            case 3:
                return "*";
            case 4:
                return "/";
            case 5:
                return "^";
            case 6:
                return "%";
            case 7:
                return "|x|";
            default:
                return "Invalid operation";
        }
    }

    /* Displays dash header string */
    public static void dash(int num)
    {
        for (int i = 1; i <= num; i++)
        {
            System.out.print("-");
        }
        System.out.println();
    }

    /* This method lists all the operations that
     * the user can choose from. It also gives
     * the description of the program */
    public static void list()
    {
        dash(40);
        System.out.println("""
            Enter the number that corresponds with
            the operation you would like to execute""");
        System.out.println("Addition       [1]");
        System.out.println("Subtraction    [2]");
        System.out.println("Multiplication [3]");
        System.out.println("Division       [4]");
        System.out.println("Exponent       [5]");
        System.out.println("Modulus        [6]");
        System.out.println("Absolute value [7]");
        dash(40);
    }
}
