import java.util.*;
public class InClass2 {
//data type validation validate the type the user is giving you.
/*
 * indefinite loop
 * do {
 * // code
 * }
 * while (condition);
 */
    public static void main(String[] args) {
        String s = "";
        if (s.length() > 0 && s.charAt(0) == 'A');
            System.out.println("A");

        Scanner kb = new Scanner(System.in);
        System.out.println("Enter your age: ");
        //hasNextInt() or hasNextDouble() or hasNext() or hasNextLine()
        // all return a boolean
        while (!kb.hasNextInt()) {
            // discard the users inpput
            kb.nextLine();
            // prompt the user
            System.out.println("Enter your age: ");
        }
        int age = kb.nextInt();

        double gpa = getGpa(kb);
        System.out.println(gpa);

        Random rand = new Random();
        randomLines(rand);

        int a1 = 16;
        int a2 = 6;
        do
        {
           a1 += 2;  // adds2 to the variable a1
           a2--;     //subtracts 1 from variable a2
           System.out.println(a1 + " " + a2);
        }while((a2 -2 > 0) && ((a1 / a2) >= 0));

        System.out.println(a1 +  a2);
        int num1 = 13;
        int num2 = 24;

        boolean b = !((num1 % 3) == 0) && num2 % 2 != 0 || num2 % 3 > 0;
        boolean c = num1 %2 != 0 ||  num2 % 2 == 0;
        System.out.println( !b || c && false);

    }

    //write a method enter a gpa must be a double and between 0 and 4
    public static double getGpa(Scanner kb) {
        double gpa = -1;
        while (gpa < 0 || gpa > 4) {
            System.out.println("Enter your gpa: ");
            while (!kb.hasNextDouble()) {
                kb.nextLine();
                System.out.println("Enter your gpa as decimal point value: ");
            }
            gpa = kb.nextDouble();
        }
        return gpa;
    }

    public static void randomLines(Random rand) {
        // create random lines
        int randomLines = rand.nextInt(5, 11);
        int count = 0;
        do {
            int randomLength = rand.nextInt(1, 81);
            for (int i = 1; i < randomLength; i++) {
                //generate letters
                int randomLetter = rand.nextInt('z' - 'a' + 1) + 'a';
                System.out.print((char)randomLetter);
            }
            System.out.println();
            //increment lines
            count++;
        } while (count < randomLines);
    }

    //answer questions till the score is 10 get point for 1 right
    public static void randomQuiz(Random rand, Scanner kb) {
        //declare variables
        int score = 0;
        int sum = 0;

        do {
            int r1 = rand.nextInt(1, 51);
            int r2 = rand.nextInt(1, 51);

            // get the sum
            sum = r1 + r2;

            //get user input
            System.out.println(r1+" + "+r2+" = ");
            int answer = kb.nextInt();

            // increment if right
            if (sum == answer)
                score++;
            else
                System.out.println("wrong answer");

        } while (score < 10);
    }

    /*
    public static int allOdd(Scanner kb) {
        int user = 0;
        //loop control varaible
        do {
        } while ();

    }
    */

}