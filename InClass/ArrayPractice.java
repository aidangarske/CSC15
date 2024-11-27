import java.util.Random;

public class ArrayPractice {
    public static void main(String[] args) {
        // what size of list
        double[] list = new double[45];
        // list name
        String[] names = new String[45];
        // right side instanceiation
        // 0 based index
        // string starts off as null

        //initialize an array
        String[] colors = {"Red", "Blue", "Green"};

        //use index of each element
        list[0] = 99;
        list[1] = 88;
        //... takes way to long its only for one element

        //use loop to fill in array
        for(int i = 0; i <= 44; i++) {
            list[i] = 55 + i; //filled random formula
        }

        // call method get an array
        double avg = arrayAvg(list); // just name of array no brackets when passing in
        System.out.println(avg);
        String[] letters = new String[10];
        Random rand = new Random(); // create random number
        for (int i = 0; i < letters.length; i++) { // initialize the array with rand char
            int a = rand.nextInt('z' - 'a' + 1) - 'a'; //ascii code for letter
            letters[i] = (char)a+""; // a+"" concatinates the int into a string int > string > char
        }
        int count = getVowelLength(letters);

        int[] nums = {3,6,5,1,8,9};
        modifyArray(nums);
        //for loop to prit changes
        System.out.println("Main method:*****");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + " "); // prints each number at index
        }
        System.out.println();
        System.out.println(nums); // gives adress of array
        // method can do anything to your array
        // you can make copy and send copy to not have the contents changed
    }

    //write method gets an array of double and finds the avg of values
    public static double arrayAvg(double[] scores) { // [] for array paramter can be created and used like this
        double sum = 0;
        double avg = 0;

        // calc the sum of values stored in the array
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i]; // acess each element at given index scores[i]
        }
        return sum / scores.length;
    }
    // case insensative gets a vowel
    public static int getVowelLength(String[] letters) {
        int length = 0;

        for (int i = 0; i <= letters.length; i++) {
            char c = letters[i].toLowerCase().charAt(0); // get each letter out and convert to lowercase
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                length++; // if any vowel add the index
        }
        return length;
    }

    //write method make change content and replace # with square of #
    public static void modifyArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i]; // just squaring each index of the array
        }
    }

    //write method to get array of double makes copy and returns it
    public static double[] copy(double[] nums) {
        // double[] copy = nums; // both pointing same array didnt make a copy like this BAD CODE
        // return copy; // BAD CODE makes copy address of array
        // only copy one at a time in loop
        double[] copy = new double[nums.length];
        for (int i = 0; i < nums.length; i++) { // go through each index
            copy[i] = nums[i]; // how an array can be copied copy each index over
        }
        return copy; // return the new copied with new address and new location
    }

    // compare array contain same?
    // write method get 2 array of string and return true if same
    // to call would need to create 2 arrays then accept the method
    public static boolean compare(String[] a, String[] b) {
        if (a.length != b.length) {
            return false;
        }
        // return false when not equal
        for (int i = 0; i < a.length; i++) {
            if(a[i].equalsIgnoreCase(b[i])) {
                return false;
            }
        }
        return true;
    }
    // cant use a == b becuase comparing adress

    //write method gets array of string and returns true if array is palindrome false ow
    public static boolean palindrome(int[] a) {
        for (int i = 0; i < a.length / 2; i++) { // divide by 2 only go from this
            if (a[i] != a[a.length - i - 1]) { // from each end
                return false;
            }
        }
        return true;
    }

    // when first init content is int = 0, double = 0.0, String = null
}