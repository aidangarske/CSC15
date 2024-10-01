/* Parameter's */
import java.util.Scanner;
public class Parameter
{
    public static void main(String[] args)
    {
        /* Interactive code / Prompting */
        Scanner kb = new Scanner(System.in);

        quadFormula(2, 7, 3);

        System.out.print("What is your weight: ");
        int weight = kb.nextInt();

        System.out.print("What is your weight: ");
        int height = kb.nextInt();

        /* call to bmi with the inputs given */
        bmi(weight, height);

        /* ask user enter age */
        System.out.print("Enter age: ");
        int age = kb.nextInt();

        System.out.print("Enter GPA: ");
        double gpa = kb.nextDouble();

        System.out.print("Enter name: ");
        String name = kb.next();

        /* flush the buffer */
        kb.nextLine();

        System.out.print("Write a sentence: ");
        String sentence = kb.nextLine();
    }

    public static void quadFormula(double a, double b, double c)
    {
        double deno = 2 * a;
        double sqrt = Math.sqrt(b * b - 4 * a * c);
        double root1 = (-b + sqrt) / deno;
        double root2 = (-b - sqrt) / deno;

        System.out.println("The root1 is: " + root1);
        System.out.println("The root2 is: " + root2);
    }

    public static double bmi(double weight, double height)
    {
        double bmi = (weight / (height * height)) * 703;
        System.out.println("Your bmi is: " + bmi);
        return bmi;
    }
}