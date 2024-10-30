import java.util.*;

public class Loop {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner console = new Scanner(System.in);
        int a = rand.nextInt(20); //0-19

        int min = 10;
        int max = 20;
        int b = rand.nextInt(max - min + 1) + min;

        int c = rand.nextInt(min, max);

        double d = rand.nextDouble();
        System.out.println(d+"");

        //sentinal value ends an indefinite loop

        //while loop
        //convert for to while
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        //1 declare and initialize the loop control var

        //2 while(condition)
        {
            // code

            //udate the loop control variable
        }

        int j = 1;
        while (j <= 10) {
            System.out.println(j);
            j++; //update
        }

        rollDice(rand);
        winner(rand);
        System.out.println("This is your password: "+ password(console));
        double sum = 2.344444;
        System.out.printf("%.2f\n", sum);
        System.out.printf("%8.2f\n", sum);
        System.out.printf("%-8.2f\n", sum);
    }

    public static void rollDice(Random rand) {
        int d1 = 0;
        int d2 = 0;
        int sum = 0;

        while (d1 < 1 || d1 > 6 || d2 < 1 || d2 > 6 || sum < 2 || sum > 12) {
            d1 = rand.nextInt(1, 7);
            d2 = rand.nextInt(1, 7);
            sum = d1 + d2;

            System.out.println(d1 + " + " + d2 + " = " + sum);
        }
    }

    //p1 < 500 || p1 > 1000 || p2 < 500 || p2 > 1000
    //|| p3 < 500 || p3 > 1000

    public static void winner(Random rand) {
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        boolean notDone = (p1 == p2 || p1 == p3 || p2 == p3);
        while (notDone) {
        p1 = rand.nextInt(500, 1001);
        p2 = rand.nextInt(500, 1001);
        p3 = rand.nextInt(500, 1001);

        System.out.println("winner 1, " + p1 + " winner 2, " + p2 + " winner 3, " + p3);
        notDone = (p1 == p2 || p1 == p3 || p2 == p3);
        }
    }

    public static String password(Scanner console) {
        boolean len = false;
        boolean sChar = false;
        boolean num = false;
        boolean cap = false;
        String password = "";
        boolean result = (len && sChar && num && cap);

        while (!(result)) {
            len = false;
            sChar = false;
            num = false;
            cap = false;

            System.out.println("Enter Password: ");
            password = console.next();

            len = password.length() >= 12;
            if(!len)
                continue;

            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                if (c >= 'A' && c <= 'Z')
                    cap = true;
                if (c >= '0' && c <= '9')
                    num = true;
                if (c == '@' || c == '*' || c == '$')
                    sChar = true;
            }
            result = (len && sChar && num && cap);
        }
        return password;
    }

}