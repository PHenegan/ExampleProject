public class Main {


    //These are objects, which are instantiations of a class (this sounds more complicated than it is)
    //It is pretty much like making a class that will function as its own type of variable
    //You can look at 'Person.java' now if you want, but you could also look at it after
    static Person p1;
    static Person p2;

    //This is an array. It contains multiple values of the same type
    //You can make arrays out of any object type or variable type
    static int[] ints;

    public static void main(String[] args) {

        //This is how you set the value of an object, you can ignore this for now, but look back at it once you
        //read through 'Person.java'
        p1 = new Person("Patrick", "Henegan", 16);
        p2 = new Person("Harrison", "Brujis", 16);

        //This is how you initialize the array. Its length cannot be changed once it is created.
        ints = new int[5];

        //Look at the methods below to see what the methods inside the print statements will do
        System.out.println(numbers(10));

        System.out.println(newString(p1.getFirstName()));
        System.out.println(newString(p2.getFirstName()));

        ints = fillArray(ints);
        printArray(ints);

    }
    public static String numbers(int n){
        String result = "";
        int x = 0;

        //This is a while loop. It will run the code inside the brackets while the condition in the parenthesis is true
        //In this case, the loop will keep adding numbers to the result until
        while (x <= n) {
            result += x; //this is the same as writing 'result = result + x;'
            x++; //the same as writing "x += 1;"
        }
        return result;
    }
    public static String newString(String word) {
        String result = "";
        /*
        This is a for loop, and there is a lot of stuff here, but it can be much cleaner than while loops in certain scenarios
        - 'int i = 0' is a "counter" variable that is defined in the for loop, and can only be referenced inside of it

        - 'i < word.length' is the condition. The for loop will keep running until that condition is no-longer true
            -This has nothing to do with for loops, but 'word.length()' can be done because Strings are objects and have methods

        - 'i++' is the incrementer, and will update 'i' until the condition is not matched
         */

        for (int i = 0; i < word.length(); i++) {
            result += word.charAt(i) + " "; //finds the character at a certain position in the string
        }
        return result;

        //If you have taken Algebra II, what does this look like?
        //      - should remind you of a summation. The variable name 'i' even matches
    }

    public static int[] fillArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i * 5; //this is how you refer to a specific value in an an array. 'nums[1]' refers to the 2nd value in nums
            //Computers start counting at 0! 'nums[0] refers to the first value in nums'
        }
        return nums;
    }

    public static void printArray(int[] nums) {
        //you can't do 'System.out.println(nums)', so you have to individually go through each value and print it.

        //this is a special type of for-loop for arrays. It makes a variable/object (in this case 'int n') for each value
        //in the array
        // **Note that you can't modify the values of the array with this
        // **this is the equivalent of writing 'int n = nums[number]'. changing n won't change the value in the array
        for (int n : nums) {
            System.out.println(n + " ");
        }
    }


}
