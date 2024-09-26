public class ForLoopLab
{
    public static void main (String[] args)
    {
        loop1();
        loop2();
        loop3();
        loop4();
        loop5();
        sppedConversion();
    }

    public static void loop1()
    {
            for (int num = 8; num <= 23; num++ ) {
                System.out.println(num + "");
            }
    }

    public static void loop2()
    {
        for (int num = -4; num <= 60; num = num + 16)
        {
            System.out.println(num + "");
        }
    }

    public static void loop3()
    {
        for (int num = 1; num <= 100; num++)
        {
            System.out.println(num + " * " + (num + 1) + " = " + num * (num + 1));
        }

    }

    /* converts to F to C ... (num - 30) / 2 */
    public static void loop4()
    {
        for (int num = 97; num <= 100; num++)
        {
            System.out.println((int)num + "\t" + ((num - 32) * .555) + " ");
        }

    }

    public static void loop5()
    {
        for (int num = 97; num <= 115; num++)
        {
            double temp = ((num - 32) * .555);
            System.out.println(num + "\t" + (int)temp + " ");
        }
    }

    public static void sppedConversion()
    {
        for (int num = 110; num >= 45; num--)
        {
            double speed = num * 1.61;
            System.out.println(num + "\t" + (int)speed + " ");
        }
    }



/*
 * Shorthand and longhand verision...
 * k = k-3; / k=-3;
 */

}