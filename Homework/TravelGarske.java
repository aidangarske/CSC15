/*
Name: Aidan Garske
Date: 9/16/24
I gave myself a 100% because...
- Properly named my Class as 'TravelGarske'           5pts
- Proper indention followed                           5pts
- Descriptive well placed comments                    5pts
- Program builds and runs                             50pts
- Follows requirements.                               30pts
- self grade                                          5pts
total:                                                105pts
percent:                                              100%
Testimony: I have done all the coding myself without getting help from any
resources: Aidan Garske
*/

/* Import statement */
import java.util.Scanner;

/*
The class TravelGarske calculates the cost and time it takes to
travel using a gas and electric car.

*/
public class TravelGarske
{
    /* Failure cases */
    public static final int BAD_FUNC_ARG =  -1;

    public static void main(String[] args)
    {
        /* Description and prompt */
        description();
        System.out.print("How many time do you want to use the app: ");

        Scanner kb = new Scanner(System.in);
        int count = kb.nextInt();

        /* Reruns program `count` times */
        for(int j = 1; j <= count; j++)
        {
            /* Allows the user to select which one they want (addition) */
            System.out.print("Enter type of car. Type either [gas/electric]: ");
            String carType = kb.next();

            if (carType.equalsIgnoreCase("gas"))
            {
                /* Gas car type selection */
                gasTravel(kb);
                ampersand(30);
            }
            else if (carType.equalsIgnoreCase("electric"))
            {
                /* Electric car type selection */
                electricTravel(kb);
                ampersand(30);
            }
            else
            {
                /* Falll back if invalid type entry */
                System.err.println("Oops... please enter valid input!");
                System.exit(BAD_FUNC_ARG);
            }
        }
        System.out.println("GOOD BYE!");
        ampersand(80);
    }

    /* Calculates the cost and the time to travel with a gas car */
    public static void gasTravel(Scanner kb)
    {
        System.out.println("\nTraveling with a gas car\n");

        /* Prompt the user to enter parameters */
        System.out.print("Enter the total number of the miles you are traveling: ");
        double distance = kb.nextDouble();
        System.out.print("Enter the speed of your car: ");
        double speed = kb.nextDouble();
        System.out.print("Enter the miles per gallon: ");
        double milesPerGallon = kb.nextDouble();
        System.out.print("Enter the cost gas per gallon: ");
        double costPerGallon = kb.nextDouble();
        System.out.println("\nTraveling with your gas car:\n");

        /* Call `travelHoursGasCar` and print return if valid input BAD_FUNC_ARG if not */
        double hours = travelHoursGasCar(distance, speed);
        if (hours < 0)
        {
            System.err.println("travelHoursGasCar ret is negative: " + hours);
            System.exit(BAD_FUNC_ARG);
        }
        else
            System.out.println("Hours:\t" + hours);

        /* Call `gasCost` and print return if valid input BAD_FUNC_ARG if not */
        double cost = gasCost(distance, milesPerGallon, costPerGallon);
        if (cost < 0)
        {
            System.err.println("gasCost is negative: " + cost);
            System.exit(BAD_FUNC_ARG);
        }
        else
            System.out.println("cost:\t" + cost);

        /* Call the cost per mile */
        double costPerMile = costPerMile(distance, cost);
        System.out.println("cost/m:\t" + costPerMile);
    }

    /* Caluclate the hours of travel taking your gas car */
    public static double travelHoursGasCar(double distance , double speed)
    {
        return distance / speed;
    }

    /* Caluclates the total money spend on the gas to travel */
    public static double gasCost(double distance, double milesPerGallon,
                                 double costPerGallon)
    {
        return (distance / milesPerGallon) * costPerGallon;
    }

    /*
    Calculates the cost, time, and the number of stops needed travel
    with a electric car
    */
    public static void electricTravel(Scanner kb)
    {
        System.out.println("\nTraveling with an electric car\n");

        /* Prompt the user to enter parameters */
        System.out.print("Enter the total number of the miles you are traveling: ");
        double distance = kb.nextDouble();
        System.out.print("Enter the speed of your car: ");
        double speed = kb.nextDouble();
        System.out.print("Enter the miles that can be driven with full battery: ");
        double milePerCharge = kb.nextDouble();
        System.out.print("Enter the number of the hours it takes to charge your car: ");
        double hoursPerStop = kb.nextDouble();
        System.out.print("Enter the amount money you need each time to fully charge the battery of your car: ");
        double pricePerCharge = kb.nextDouble();
        System.out.println("\nTraveling with your electric car:\n");

        /* Call `stops` and print return if valid input BAD_FUNC_ARG if not */
        int stops = stops(distance, milePerCharge);
        if (stops < 0)
        {
            System.err.println("stops ret is negative: " + stops);
            System.exit(BAD_FUNC_ARG);
        }
        else
            System.out.println("stops:\t" + stops);

        /* Call `travelHoursElecCar` and print return if valid input BAD_FUNC_ARG if not */
        double hours = travelHoursElecCar(stops, hoursPerStop, distance, speed);
        if (hours < 0)
        {
            System.err.println("travelHoursElecCar ret is negative: " + hours);
            System.exit(BAD_FUNC_ARG);
        }
        else
            System.out.println("hours:\t" + hours);

        /* Call `chargeCost` and print return if valid input BAD_FUNC_ARG if not */
        double cost = chargeCost(stops, pricePerCharge);
        if (cost < 0)
        {
            System.err.println("chargeCost ret is negative: " + cost);
            System.exit(BAD_FUNC_ARG);
        }
        else
            System.out.println("cost:\t" + cost);

        /* Call the cost per mile */
        double costPerMile = costPerMile(distance, cost);
        System.out.println("cost/m:\t" + costPerMile);
    }

    /* Calculates the hours traveling using your electric car */
    public static double travelHoursElecCar(int stops, double hoursPerStop,
                                            double distance, double speed)
    {
        /* Calculates the number of hours stopped */
        double hoursStopped = stops * hoursPerStop;
        /* Calculates the hours driven */
        double hoursDriven = distance / speed;
        /* Return the total hours */
        return hoursStopped + hoursDriven;
    }

    /* Returns the cost to charge elctric car */
    public static double chargeCost(int stops, double pricePerCharge)
    {
        return stops * pricePerCharge;
    }

    /* Caluclates the number of the stops needed to charge the battery */
    public static int stops(double distance, double milePerCharge)
    {
        /* Calculates the number of stops */
        double stops = distance / milePerCharge;
        /* Return number stops and truncate decimal */
        return (int)stops;
    }

    /* Calculates the cost per mile (addition) */
    public static double costPerMile(double distance, double cost)
    {
        return cost / distance;
    }

    /* Displays ampersand header string (addition) */
    public static void ampersand(int num)
    {
        for(int i = 1; i <= num; i++)
        {
            System.out.print("&");
        }
        System.out.println();
    }

    /* Displays the apps description */
    public static void description()
    {
        ampersand(80);
        System.out.println("This program calculates the cost and the time to travel to your destination");
        System.out.println("   given the needed information for both gas car and the electric car.     ");
        System.out.println("                 Just answer some simple questions                         ");
        ampersand(80);
    }
}
