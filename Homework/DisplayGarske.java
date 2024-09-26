/*
 * Name: Aidan Garske
 * Date: 9/11/24
 * I gave myself a 100% because...
 * - Properly named my Class as 'DisplayGarske'          5pts
 *   but Class `DisplayWords` is the one used.
 * - Proper indention followed                           5pts
 * - Descriptive well placed comments                    5pts
 * - Program builds and runs                             50pts
 * - Follows requirements.                               30pts
 * - self grade                                          5pts
 * total:                                                100pts
 * percent:                                              100%
 * Testimony: I have done all the coding myself without getting help from any
 * resources: Aidan Garske
 */

/* DisplayGarske.java
 * This is a simple java program that writes TENESE and TEENS
 */

/* no code here. Names the .java file */
public class DisplayGarske
{
}

/* The actaul object being executed */
class DisplayWords
{
   /* Prints TENSE and TEENS as ASCII ART */
   public static void main(String[] args)
   {
      System.out.println("Keep true of the dreams of your \n");
      printTeens();
      System.out.println();
      System.out.println("****************************************************\n");
      System.out.println();
      System.out.println("Winner lives in the present \n");
      printTense();
   }

   /* Prints the big wrord TEENS */
   public static void printTeens()
   {
      printT();
      printE();
      printE();
      printN();
      printS();
   }

   /* Prints the big wrord TENESE */
   public static void printTense()
   {
      printT();
      printE();
      printN();
      printS();
      printE();
   }

   /* Prints the big T's */
   public static void printT()
   {
      System.out.println("TTTTTTTTTT                                 TTTTTTTTTT");
      System.out.println("    TT                                         TT    ");
      System.out.println("    TT                                         TT    ");
      System.out.println("    TT                                         TT    ");
      System.out.println("    TT                                         TT    ");
      System.out.println("    TT                                         TT  \n");

   }

   /* Prints the big E's */
   public static void printE()
   {
      System.out.println("EEEEEEEEEE                                 EEEEEEEEEE  ");
      System.out.println("E                                          E           ");
      System.out.println("EEEEEEEEEE                                 EEEEEEEEEE  ");
      System.out.println("E                                          E           ");
      System.out.println("EEEEEEEEEE                                 EEEEEEEEEE\n");
   }

   /* Prints the big N's */
   public static void printN()
   {
      System.out.println("N N     N                                  N N     N  ");
      System.out.println("N   N   N                                  N   N   N  ");
      System.out.println("N     N N                                  N     N N  ");
      System.out.println("N       N                                  N       N\n");
   }

   /* Prints the big S's */
   public static void printS()
   {
      System.out.println(" SSSSSSSS                                 SSSSSSSS  ");
      System.out.println("S        S                               S        S ");
      System.out.println("S                                        S          ");
      System.out.println("S                                        S          ");
      System.out.println(" SSSSSSSS                                 SSSSSSSS  ");
      System.out.println("        S                                        S  ");
      System.out.println("        S                                        S  ");
      System.out.println(" S      S                                 S     S   ");
      System.out.println(" SSSSSSSS                                 SSSSSSSS\n");
   }
}
