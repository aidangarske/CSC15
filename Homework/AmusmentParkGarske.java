/*
Name: Aidan Garske
Date: 9/16/24
I gave myself a 100% because...
- Properly named my Class as 'AmusmentParkGarske'     5pts
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

/* No code here. Names the .java file */
public class AmusmentParkGarske
{
}

/*
This method displays an amusement parks minimum height and weight requirements
in the Imperial system and the Metric system as well as a description
*/
class AmusmentPark
{
   public static void main(String[] args)
   {
      /* Call to descritpion of task */
      description();

      /* Call Blue Grass Breeze Ride conversion */
      System.out.println("\n\n****************Blue Grass Breeze Ride***************************");
      blueGrassBreezeRide();

      /* Call Cyclone Saucers Ride conversion */
      System.out.println("\n\n****************Cyclone Saucer Ride******************************");
      cycloneSaucersRide();
   }

   /*
   This method converts the minimum required height in inches to feet and inches,
   and centimeter: 1 feet is 12 inches, one inch is 2.54 centimeter
   It then displays the minimum height and weight requirements to ride.
   */
   public static void blueGrassBreezeRide()
   {
      int minHeightInches = 38; /* minimum height in inches */
      int inches;               /* remainder in inches */
      int feet;                 /* remainder in feet */
      double minHeightCent;     /* minimum height in centimeters */

      System.out.println("To ride blueGrassBreeze, the minimum heigh is :");

      /* Display the minimum height in inches */
      System.out.println("In inches: " + minHeightInches + " inches");

      /* Calculate and display the minimum height in inches and feet */
      feet = minHeightInches / 12;
      inches = minHeightInches % 12;
      System.out.println("In feet and inches: " + feet + " feet  and " + inches + " inches");

      /* Calculate and display the minimum height in centimeters */
      minHeightCent = minHeightInches * 2.54;
      System.out.println("In centimeter: " + minHeightCent + " centimeter");
   }

   /*
   This method converts and displays the max required weight in pounds to kilogram
   and maximum required height to feet inches and centimeter.
   1 pound is 0.45 kilograms
   i inch is 2.54 centimeter
   */
   public static void cycloneSaucersRide()
   {
      double minWeightPounds = 105.0; /* minimum weight in pounds */
      double minHeightInches = 42;    /* minimum height in inches */
      double minWeightKilo;           /* minimum weight in kilograms */
      double minHeightCent;           /* minimum height in centimeters */

      System.out.println("Requirments to ride Cyclone SaucerRide:");

      /* Calculate and display the minimum weight in pounds and kilos */
      minWeightKilo = minWeightPounds * .45;
      System.out.println("weight: " + minWeightPounds + " pounds or " + minWeightKilo + " kilograms");

      /* Calculate and display the minimum height in inches and centimeters */
      minHeightCent = minHeightInches * 2.54;
      System.out.println("height: " + minHeightInches + " inches or " + minHeightCent + " centimeter");
   }

   /*
   This method display a description of what the program does.
   */
   public static void description()
   {
      /* Prints the description */
      System.out.println("\n*******************************************************");
      System.out.println("*------Welcome to the Waters Edge Amusment Park!------*"  );
      System.out.println("* Listed below are the height and weight requirments. *"  );
      System.out.println("* Make sure to have fun and not enter rides outisde   *"  );
      System.out.println("*           of your height and weight!                *"  );
      System.out.println("*******************************************************"  );
   }
}