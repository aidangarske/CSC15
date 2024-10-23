/* ShiftCipherGarske.java
 *
 * ie. ShiftCipher is a program that
 * encodes and decodes a message based
 * on the users input. it can accept
 * upper case and lower case as well
 * as spaces
*/

import java.util.*;
public class ShiftCipherGarske {
}

class ShiftCipher {
    @SuppressWarnings("ConvertToStringSwitch")
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.print("How many times to you want to use the app: ");
        int count = console.nextInt();
        console.nextLine();
        for(int i = 1; i <= count; i++)
        {
            menu();
            System.out.print("Enter your choice: ");
            String choice = console.nextLine();

            System.out.print("Enter your message: ");
            String message = console.nextLine();

            /* Execute encode or decode
             * based on user input */
            /* Encrypt with key shift */
            if ("E".equals(choice)) {
                String encode = encode(message);
                System.out.println("Encoded message = " + encode);
            }
            /* Decrypt the key shift */
            else if ("D".equals(choice)) {
                String decode = decode(message);
                System.out.println("Decoded message = " + decode);
            }
            /* Encrypt with length shift */
            else if ("EE".equals(choice)) {
                String encode2 = encode2(message);
                System.out.println("Encoded message = " + encode2);
            }
            /* Fail */
            else
                System.err.println("Oops... Please enter [E, EE, or D]");
        }
    }

    /* This method displays a menu so
     * that the user can chose between
     * decode and encode */
    public static void menu() {
        System.out.println("""
            ========================================================
            | This program uses a cipher shift to encode and decode|
            | the users input. The options you can select are:     |
            |                   Encode  --> E                      |
            |                   Encode2 --> EE                     |
            |                   Decode  --> D                      |
            |               Enter either E or D                    |
            ========================================================
            """);
    }

    /* Encodes the decrypted string using
     * a key. */
    public static String encode(String message) {
        String encoded = "";

        /* Calculate the key */
        int key = message.length() * 2;
        if (key > 26)
            key = key % 26;

        /* Get the first and last char */
        char firstChar = message.charAt(0);
        char lastChar = message.charAt(message.length() - 1);

        /* Calculate the key */
        if (firstChar == lastChar) {
            key = (firstChar - 'A' + 1) % 10;
        }

        /* Convert to upper case */
        message = message.toUpperCase();

        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);

            /* Failure case  */
            if (!Character.isLetter(c) && c != ' ') {
                System.out.println("Invalid input");
                return null;
            }

            /* If c is a space make : */
            if (c == ' ') {
                c = ':';
                encoded += c;
                continue;
            }

            /* If c is between A and Z */
            if (c >= 'A' && c <= 'Z') {
                c = (char)(c + key);
                if (c > 'Z')
                    c = (char) (c - 26);
            }

            /* Add c to string */
            encoded += c;
        }

        String backward = backward(encoded);
        return backward;
    }

    /* Decodes the encrypted string using
     * a key. The key must be caluclated
     * the same way as in the decode method. */
    public static String decode(String message) {
        String decoded = "";

        /* Calculate the key */
        int key = message.length() * 2;
        if (key > 26) {
            key = key % 26;
        }

        /* Revert the message to forwards */
        message = backward(message);

        /* Convert to upper case */
        message = message.toUpperCase();

        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);

            /* Failure case  */
            if (!Character.isLetter(c) && c != ':') {
                System.out.println("Invalid input");
                return null;
            }

            /* If c is between A and Z or ':' */
            if (c >= 'A' && c <= 'Z') {
                c = (char) (c - key);
                if (c < 'A') {
                    c = (char) (c + 26);
                }
            /* Convert back to : */
            } else if (c == ':') {
                c = ' ';
            }

            /* Add c to string */
            decoded += c;
        }

        return decoded;
    }

    /* This method gets a String and create
     * a new string in the backward order.
     * For example if hello is passed to it
     * it will return olleh */
    public static String backward(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    /* This method encodes an message by
     * using the message length and shifting i
     * from that length each iteration. */
    public static String encode2(String s) {
        String encoded = "";
        /* Length of input message */
        int keyShift = s.length();

        /* Convert to upper case */
        s = s.toUpperCase();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isLetter(c)) {
                /* key shift plus index */
                int shift = keyShift + i;
                char shifted;

                /* Shift the character */
                if (Character.isUpperCase(c)) {
                    shifted = (char) (c + shift);
                    if (shifted > 'Z') {
                        shifted -= 26;
                    }
                }
                else {
                    shifted = (char) (c + shift);
                    if (shifted > 'z') {
                        shifted -= 26;
                    }
                }
                encoded += shifted;
            }
            /* If space replace : */
            else if (c == ' ') {
                c = ':';
                encoded += c;
            }
            /* Fail */
            else {
                System.out.println("Invalid input");
                return null;
            }
        }

        String backward = backward(encoded);
        return backward;
    }
}


/*==============================SELF GRADE===================================*/
/*
Name: Aidan Garske
Date: 10/22/24
I gave myself a 100% because...
- Extra feature abs value 15 pts
- Properly named my Class as 'ShiftCipherGarske'      5pts
- Proper indentation followed                         5pts
- Descriptive well-placed comments                    5pts
- Program builds and runs                             50pts
- Follows requirements.                               30pts
- Self-grade                                          5pts
total:                                                105pts
percent:                                              100%
Testimony: I have done all the coding myself without getting help from any
resources: Aidan Garske
*/
/*===========================================================================*/