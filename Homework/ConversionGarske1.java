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
        gallonConverter();
        fahrenheitConverter();
    }

    /* Displays the description for program */
    public static void displayDescription()
    {
        /* description */
        displayTildeHeader();
        System.out.println("\n| This Converter converts gallons to |");
        System.out.println("| litters and ounces and fahrenheit  |");
        System.out.println("| to celcius and kelvin. It then     |");
        System.out.println("| displays the results in list form. |");
        displayTildeHeader();
    }

    /* Converts gallons to litters and ounces */
    public static void gallonConverter()
    {
        double gal; /* variable for gallons */
        double lit; /* variable for litters */
        double oz;  /* variable for ounces  */

        System.out.println("\n~~~~~~~~~~~GALLON CONVERTER~~~~~~~~~~~");
        System.out.println("|          Gallons => Litters        |");
        System.out.println("|          Gallons => ounces         |");

        /* Tilde header */
        displayTildeHeader();

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
        System.out.println("~~~~~~~~END GALLON CONVERSION~~~~~~~~~\n\n");
    }

    /* Converts to fahrenheit to celcius and kelvin */
    public static void fahrenheitConverter()
    {
        double fahr; /* variable for fahrenheit */
        double cel;  /* varaible for celcius    */
        double kel;  /* cariable for kelvin     */

        System.out.println("~~~~~~~~~~FAHRENHEIT CONVERTER~~~~~~~~");
        System.out.println("|         Fahrenheit => Celcius      |");
        System.out.println("|         Fahrenheit => Kelvin       |");

        /* Tilde header */
        displayTildeHeader();

        /* Prints header */

        System.out.println("\nFahrenheit\tCelcius\t\tKelvin");

        for (fahr = 99; fahr >= 12; fahr = fahr - 3)
        {
            /* Calculate celcius from fahrenheit */
            cel = (fahr - FAHRENHEIT1_CONVERSION) * FAHRENHEIT2_CONVERSION;
            /* Calculate kelvin from celcius */
            kel = cel + KELVIN_CONVERSION;

            /* Displays the varaibles in list form */
            System.out.println((int)fahr + "\t|\t" + (int)cel + "\t|\t" + (int)kel);
        }

        /* Prints footer */
        System.out.println("~~~~~~~END FAHRENHEIT CONVERSION~~~~~~\n");
    }

    /* Displays the header tilde string */
    public static void displayTildeHeader()
    {
        for (int tilde = 1; tilde <= 38; tilde++)
        {
            System.out.print("~");
        }
    }
}