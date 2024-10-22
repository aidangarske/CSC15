import java.util.*;

public class InClass
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        int sum = sum();
        System.out.println(sum);

        double product = product();
        System.out.println(product);

        double avgScore = avgScore(kb);
        System.out.println(avgScore);

        int countFactors = countFactors(45);
        System.out.println(countFactors);

        String con = concat("hello", 4);
        System.out.println(con);

        m();
        System.out.println("");

        /* decrypt and encrypt by shifting */
        String encrypt = encrypt("helloz", 4);
        System.out.println("Your encrypted message is: " + encrypt);
        String decrypt = decrypt(encrypt, 4);
        System.out.println("Your decrypted message is: " + decrypt);
    }

    /* adds numbers 1-100 ie. 1+2+3...+100 */
    public static int sum()
    {
        int sum = 0;
        for (int i = 1; i <= 100; i++)
        {
            sum = sum + i;
        }
        return sum;

    }

    /* multiply 2 * 4 * 6 ...* n */
    public static double product()
    {
        double product = 2;
        for (int i = 4; i <= 20; i = i + 2)
        {
            product = product * i;
        }
        return product;
    }

    /* finds avg score and calculates */
    public static double avgScore(Scanner kb)
    {
        double sum = 0;
        System.out.print("How many scores? ");
        int count = kb.nextInt();

        for (int i = 1; i <= count; i++)
        {
            System.out.print("Score --> ");
            double score = kb.nextDouble();

            sum = sum + score;
        }

        double avg = 0;

        avg = sum / count;

        return avg;
    }

    /* counts the facotrs in a # */
    public static int countFactors(int num)
    {
        int factors = 0;

        for (int i = 1; i < num; i++)
        {
            if (num % i == 0)
                factors++;
        }
        return factors;
    }

    /* concatinates a word input n times */
    public static String concat(String word, int count)
    {
        String concat = "";

        for (int i = 1; i < count; i++)
        {
            concat = word + concat;
        }

        return concat;
    }

    public static void m()
    {
        String s = "Hello";
        int code = 'A';
        System.err.println(code);

        /* can do char or int(char) */
        for (char i = 'A'; i < 'Z'; i++)
        {
            System.out.print(i);
        }

        System.out.println("");
        for (int i = 'A'; i < 'Z'; i++)
        {
            System.out.print((char)i);
        }

    }

    /* encrypt a message by shifting right */
    public static String encrypt(String mes, int key)
    {
        String encrypt = "";

        for (int i = 0; i < mes.length(); i++)
        {
            char c = mes.charAt(i);

            c = (char)(c + key);

            if (c > 'z')
                c = (char) (c - 26);
            encrypt += c;
        }

        return encrypt;
    }

    /* decrypt a message by shifting left */
    public static String decrypt(String mes, int key)
    {
        String decrypt = "";

        for (int i = 0; i < mes.length(); i++)
        {
            char c = mes.charAt(i);

            c = (char)(c - key);

            if (c < 'a')
                c = (char) (c + 26);
            decrypt += c;
        }

        return decrypt;
    }
}