public class CalcHeight
{
    public static final double PI = 3.14;
    public static final int MONTHS_IN_YEAR = 12;
    public static final double TAX_RATE = .08;

    /* 1 foot = 30.48
     * 1 inch = 2.54 centimeters
     */
    public static void main(String[] args)
    {
       conversion();
       calcArea();
       calcBmi();
    }

    /* converts inches to feet */
    public static void conversion()
    {
        System.out.println("\n-----CONVERT-----");

        /* declare vairables */
        int feet = 5;
        int inches = 10;

        /* calculate centimeters */
        double centi = feet * 30.48 + inches *2.54;

        /* display */
        System.out.println("\nI am " + feet + " feet " + inches + " inches tall :( ");
        System.out.println("\nIn centimeters I am " + centi + " tall");
    }

    /* calculates the area of a circle */
    public static void calcArea()
    {
        System.out.println("\n-----CALULATE AREA-----");

        /* declare vairables */
        double radius = 3;

        /* calculate centimeters */
        double area = PI * radius *radius;

        /* display */
        System.out.println("\nThe area of a circle is " + area + " inches");

    }

    /* calculates the Bmi */
    public static void calcBmi()
    {
        System.out.println("\n-----CALULATE BMI-----");

        /* converts pounds to kg */
        double weightPounds = 150; /* input weight in pounds */
        double weightKg = weightPounds * .454;
        System.out.println("\nWeight in kilograms: " + weightKg);

        /* converts inches to meters */
        double heightFeet = 5; /* input feet */
        double heightInchesR = 10; /* input inches */
        double heightInches = (heightFeet * 12) + heightInchesR;
        double heightMeters = (heightInches * 2.54) / 100;
        System.out.println("\nHeight in meters: " + heightMeters);

        /* calcs BMI */
        double bmi = weightKg / (heightMeters * heightMeters);
        System.out.println("\nBMI: " + bmi + " Kg/m^2");

        /* present BMI scale rating */
        System.out.println("\nYou are:");
        if(bmi <= 18.5)
            System.out.println("underweight! :(\n");
        if(bmi > 18.5 && bmi < 24.5)
            System.out.println("normal weight! :)\n");
        if(bmi >= 24.5)
            System.out.println("overweight! :(\n");
    }
}