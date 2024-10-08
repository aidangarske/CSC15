/*
Name: Aidan Garske
Date: 9/16/24
I gave myself a 100% because...
- Properly named my Class as 'FictionGarske'           5pts
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

import java.util.Scanner;
public class FictionGarske
{
}

/* This program will create a fantasy
 * based story by interacting with the
 * user, asking questions, and assembling
 * the story. It also determines the mood
 * of the charecter based on how many
 * creatures it encounters. It then takes
 * the story creates and puts it in reverse
 * order. */
class Story
{
    /* Failure case */
     public static final int BAD_FUNC_ARG =  -1;

    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.print("How many times do you want to run the code: ");
        int count = console.nextInt();
        console.nextLine();

        for(int i = 1; i <= count ; i++)
        {
            String story = createStory(console);
            System.out.println("\nHere is your story:");
            tilde(20);
            System.out.println(story);

            System.out.println("\nHere is your story backwards:");
            tilde(30);
            reverse(story);
        }
    }

    /* Asks the user prompts to develop a story
     * then assembles the story and fills in the
     * blanks based on the given inputs */
    public static String createStory(Scanner console)
    {
        System.out.println("We are going to make a story together by asking some questions");

        System.out.print("Enter your name: ");
        String name = console.nextLine();

        System.out.print("Choose a fantasy role [wizard, knight, archer, etc.]: ");
        String role = console.nextLine();

        System.out.print("Enter the name of your companion: ");
        String companion = console.nextLine();

        System.out.print("How far do you want to travel on your journey [miles]: ");
        double distance = console.nextDouble();
        /* Fall back if invalid type entry */
        if  (distance <= 0)
        {
            System.err.println("Oops... please enter valid input!");
            System.exit(BAD_FUNC_ARG);
        }
        console.nextLine();

        System.out.print("What is the name of the enchanted place you're heading to: ");
        String enchantedPlace = console.nextLine();

        System.out.print("Enter a tool you would like to be carrrying: ");
        String tools = console.nextLine();

        System.out.print("Enter your favorite number: ");
        int favoriteNumber = console.nextInt();
        /* Fall back if invalid type entry */
        if  (favoriteNumber < 0)
        {
            System.err.println("Oops... please enter valid input!");
            System.exit(BAD_FUNC_ARG);
        }
        console.nextLine();

        System.out.print("Enter your greatest fear: ");
        String fear = console.nextLine();

        System.out.print("What magical item are you carrying with you: ");
        String magicalItem = console.nextLine();

        System.out.print("What type of weather is it during your journey: ");
        String weather = console.nextLine();

        System.out.print("How many creatures do you encounter along the way: ");
        int creatures = console.nextInt();
        /* Fall back if invalid type entry */
        if  (creatures < 0)
        {
            System.err.println("Oops... please enter valid input!");
            System.exit(BAD_FUNC_ARG);
        }
        console.nextLine();

        System.out.print("How many gold coins do you carry with you: ");
        double gold = console.nextDouble();
        /* Fall back if invalid type entry */
        if  (gold < 0)
        {
            System.err.println("Oops... please enter valid input!");
            System.exit(BAD_FUNC_ARG);
        }
        console.nextLine();

        /* Uses pow math calc to calc the "magical boost" */
        double magicalBoost = Math.pow(distance, 2);

        /* String to upper case */
        String roleUpper = role.toUpperCase();

        String mood = charectersMood(creatures);

        /* Take inputs and assemble the story */
        String story = String.format(
            "Once upon a time, "+name+", a brave "+roleUpper+". " +
            "Embarked on an adventure with his closest companion "+companion+". " +
            "Their goal was to travel "+distance+" miles to the enchanted land of "+enchantedPlace+". " +
            "With their trusty companion "+companion+" by their side, they knew nothing could stop them. " +
            "Armed with "+favoriteNumber+" of their favorite "+tools+" which held special powers, they pressed on. " +
            "However, lurking in the shadows was their greatest fear: "+fear+". " +
            "Luckily, they had their magical "+magicalItem+" to protect them. Despite the "+weather+" weather, " +
            "they pressed on, encountering "+creatures+" strange creatures. The amount of them made them "+mood+". " +
            "They carried "+gold+" gold coins with them, and even received a magical boost of "+magicalBoost+" " +
            "from an ancient spell they stumbled upon. In the end, "+name+", the powerful "+roleUpper+", " +
            "conquered their fears and reached "+enchantedPlace+"."
        );

        return story;
    }

    /* Reverses the order of the story */
    public static String reverse(String story)
    {
        int length = story.length();
        for (int i = length - 1; i>=0; i--)
        {
            System.out.print(story.charAt(i));
        }
        return story;
    }

    /* Determines the charecters mood based on
     * the given input of how many creatures the
     * user provided (addition) + 25pts */
    public static String charectersMood (int creatures)
    {
        String mood = "";

        /* make sure input valid and determine mood */
        if (creatures >= 0)
        {
            if (creatures < 5)
                mood = "worried";
            if (creatures >= 5 && creatures < 25)
                mood = "scared";
            if (creatures >= 25)
                mood = "panicked";
        }
        else
        {
            /* Fall back if invalid type entry */
            System.err.println("Oops... please enter valid input!");
            System.exit(BAD_FUNC_ARG);
        }

        return mood;
    }

    /* Displays tilde header string (addition) */
    public static void tilde(int num)
    {
        for(int i = 1; i <= num; i++)
        {
            System.out.print("~");
        }
        System.out.println();
    }
}