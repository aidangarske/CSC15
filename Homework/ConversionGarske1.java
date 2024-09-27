/*
Name: Aidan Garske
Date: 9/16/24
I gave myself a 100% because...
- Properly named my Class as 'ConversionGarske'       5pts
- Proper indention followed                           5pts
- Descriptive well placed comments                    5pts
- Program builds and runs                             50pts
- Follows requirements.                               30pts
- self grade                                          5pts
total:                                                100pts
percent:                                              100%
Testimony: I have done all the coding myself without getting help from any
resources: Aidan Garske
*/

/*
This program converts:
Gallons => Litters
Gallons => Ounces
fahrenheit => Celciues
fahrenheit => Kelvin
and displays the results in table form.
*/
public class ConversionGarske1
{
    /* Conversion constants */
    public static final double LITTER_CONVERSION = 3.78;
    public static final double OUNCE_CONVERSION = 128;
    public static final double FAHRENHEIT1_CONVERSION = 32;
    public static final double FAHRENHEIT2_CONVERSION = .555;
    public static final double KELVIN_CONVERSION = 273.15;


    /* Calls conversions methods and description to run */
    public static void main (String[] args)
    {
        displayDescription();
        gallonConversion();
        fahrenheitConversion();
    }

    /* Displays the header tilde string */
    public static void displayTildeHeader()
    {
        for (int tilde = 1; tilde <= 40; tilde++)
        {
            System.out.print("~");
        }

    }

    /* Displays the description for program */
    public static void displayDescription()
    {
        /* description */
        System.out.println("This is a simple program that converts: \n"       );
        System.out.println("Gallons => Litters\nGallons => Ounces\n"          );
        System.out.println("fahrenheit => Celciues\nfahrenheit => Kelvin\n"   );
        System.out.println("It then displays the results in list form\n"      );

        /* Tilde header */
        displayTildeHeader();
    }

    /* Converts gallons to litters and ounces */
    public static void gallonConversion()
    {
        double gal; /* variable for gallons */
        double lit; /* variable for litters */
        double oz;  /* variable for ounces  */

        /* Prints header */
        System.out.println("\nGallons\t\tLitters\t\tOunces");

        for (gal = 99; gal >=12; gal = gal - 3)
        {
            /* Calculate litters from gallons */
            lit = gal * LITTER_CONVERSION;
            /* Calculate ounces from gallons */
            oz = gal * OUNCE_CONVERSION;

            /* Displays the varaibles in list form */
            System.out.println((int)gal + "\t|\t" + (int)lit + "\t|\t" + (int)oz);
        }

        /* Prints footer */
        System.out.println("~~~~~~~~~~END GALLON CONVERSION~~~~~~~~~~");
    }

    /* Converts to fahrenheit to celcius and kelvin */
    public static void fahrenheitConversion()
    {
        double fahr; /* variable for fahrenheit */
        double cel;  /* varaible for celcius    */
        double kel;  /* cariable for kelvin     */

        /* Prints header */
        System.out.println("\nFahrenheit\t\tCelcius\t\tKelvin");

        for (fahr = 97; fahr <= 100; fahr++)
        {
            /* Calculate celcius from fahrenheit */
            cel = (fahr - FAHRENHEIT1_CONVERSION) * FAHRENHEIT2_CONVERSION;
            /* Calculate kelvin from celcius */
            kel = cel + KELVIN_CONVERSION;

            /* Displays the varaibles in list form */
            System.out.println((int)fahr + "\t|\t" + (int)cel + "\t|\t" + (int)kel);
        }

        /* Prints footer */
        System.out.println("~~~~~~~~~~END FAHRENHEIT CONVERSION~~~~~~~~~~");
    }
}