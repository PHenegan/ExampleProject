public class Arrays {

    //This is an array. Arrays are basically like lists of values that are the same type.
    static int[] array;
    //Arrays can contain any data type
    static boolean[] array2;

    //In case you didn't notice, main takes in an array of Strings. This is because you can pass in a list of strings
    //(or arguments) that Java can use by referring to args.
    public static void main(String[] args) {
        //There are 2 ways to define arrays. The first is by setting the length and leaving the values empty
        array = new int[5]; //This creates an array with 5 empty ints (if you don't set them they will be 0)

        //Position in the array:  0     1      2     3     4
        array2 = new boolean[] {true, false, true, true, false};

        //Note that you can't change the length of an array after you make it, unless you wipe all of the values by setting it
        //as a new array

        //array2 = new boolean[6]; //This will erase all of the values in the previously defined array, and won't just add an extra spot


        //This creates an array with a defined list of values
        //Because computers start counting at 0, it is important to remember that the last value of an array is actually the length minus 1.

        //Individual values in an array can be referred to with name[position]. They can be changed or printed using this;
        array[0] = 77;
        array[1] = 34;
        array[2] = 28;
        array[3] = 22;
        array[4] = 9990;
        System.out.println(array[0]);

        System.out.print("Array 1: ");
        //Arrays are useful in methods when you want to take in a set of values,
        //but don't know the exact amount of values you want to take in.
        //Read the printNumbers() and printBooleans() methods to see ways to print an entire array
        printNumbers(array);

        //Prints a new line before moving onto the next arrays
        System.out.println();
        System.out.print("Array 2: ");
        printBooleans(array2);

        //See the setValues() and testInts() methods to see other ways arrays can be used in methods
        printNumbers(setValues(array));

        System.out.println();
        printBooleans(testInts(array));

    }

    public static void printNumbers(int[] nums) {
        //There is no way to print or set values of the entire array, so a convenient way to do that is with loops
        //you can get the length of the array by doing name.length, which is useful for setting up for() loops
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void printBooleans(boolean[] bools) {
        //This is a special type of for loop that works for lists and ArrayLists (this will be discussed later)
        //Can be read as - for each boolean (name) in (array name)
        for (boolean bool : bools) {
            //Note that this type of loop will not work when you want to change one of the values in the array
            //bool = true won't change the actual value in the array because of this
            System.out.print(bool + " ");
        }
        System.out.println();
    }

    public static int[] setValues(int[] list) {
        //Example of a method that goes through an array and outputs a new array based on the values of the first one
        int[] newList = new int[list.length];

        for (int i = 0; i < list.length; i++) {
            newList[i] = (i + 1) * 4 + list[i];
        }
        return list;
    }

    public static boolean[] testInts(int[] list) {
        //This is an example of a method that might take in one type of an array and use the data to create an array with a different type
        boolean[] solutions = new boolean[list.length];
        for (int i = 0; i < list.length; i++) {
            //Sets the value in solutions[] based on whether or not a corresponding value in list[] is greater than 5
            solutions[i] = (list[i] > 50);
        }
        return solutions;
    }



    //lol
    //remember to always say hi to patrick- ESSENTIAL**************
    public static void helloPatrick(int[] nums){
        System.out.println("omg hi patrick");
        //OMG HI PATRICK
        //Kayla put this in and I'm too lazy to remove it rn
    }




}
