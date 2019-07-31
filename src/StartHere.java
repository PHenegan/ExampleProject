//These are comments, marked by a '//' at the beginning of the line

/*
Another way to use comments is with these symbols
It can be used for large paragraphs of comments
*/

//This is a class: it is basically where code is written in for java
//Class names typically have the first letter of each word capitalized
public class StartHere {
    /**
     * Every time you see this, you are looking at Java documentation.
     * It describes what the method does and specifies what its inputs and outputs will be
     * If you're describing specific lines of code, you probably shouldn't use this because
     * it is mostly descriptions for methods and classes that will be read when people want to use
     * that method or class
     */
    //These are primitive variables. They represent basic data storage types
    //Typical naming for variables uses camel case or 'camelCase' - the first letter of the first word is lowercase
    //and the first letter of any following word is capital

    //'static' means that the object doesn't have to be instantiated to access the variable
    //(Don't worry about this for now)

    static int x = 1; //32-bit integer
    static double y = 1.0; //number with a decimal point
    static boolean condition = false; //a value that can either be true or false
    static boolean anotherCondition = x < 8; //you can use a statement that checks another variable
    static char c = 'a'; //a letter or character
    static char anotherCharacter = 'B';
    static double z; //you don't have to give the variable a value immediately

    //static int num = "hello"; <-- this will not work because the variable is declared as an int
    //static int x = 5; <-- this will not work because the variable name is already used
    //If you wanted to set x to 5, just do:
    //x = 5;

    //Notice how words aren't included here - Java uses a class for Strings, meaning they are objects, not primitives.
    //That's why the 'S' is capital
    //For most use cases, you don't need to go in detail like this, just remember that you need a capital S in String

    static String name = "Bob";


    //This is called a method (or function) it is where code is used/run
    //public means that the method can be used outside of this class
    //Functions can take inputs (parameters) and produce outputs, but neither are necessary

    //static means that you don't need to instantiate the class as an object
    // (You're not supposed to know what this means yet, don't worry)

    //void means that the method won't return a value
    //You can ignore the 'String[] args' for now

    public static void main(String[] args) {
        //This is how you print things to the console window
        System.out.println("Hello " + name);

        //This is an if-elseif-else statement. It tests for certain conditions that are either true or false
        //Note that else if/else statements don't always have to follow an if statement, and aren't always necessary
        if (x == 1) { //'==' is used instead of = in conditional statements. '=' is used when you are setting a value
            //checks for a certain condition
            System.out.println("Yay!");
        }
        else if (x > 5) {
            //checks for a different condition if the first one is not met
            System.out.println("Boo!");
        }
        else {
            //If the above conditions are not met, this block of code is run
            System.out.println("Meh.");
        }
        System.out.print(doSomeStuff());
        System.out.println(getSum(x,y));


    }

    //This is an example of a method that has inputs (parameters) it can process these to determine an output
    //methods also use camelCase, just like variable names;

    public static double getSum(double a, double b) {
        //You can define a variable inside of a method, but it can only be used inside of that method
        double c = a + b;

        //This is a return statement. It returns the output of the method. if the method's output type is void,
        //then a return statement is not necessary. Since this one is 'double,' this method has to return a double value.
        return c;
    }


    public static String doSomeStuff() {
        String s;
        //This shows how you can check for multiple conditions in one statement '&&' means "and" and '||' means "or"
        if (condition == anotherCondition && c == anotherCharacter) {
            s = "Yeaaaaaaaa Boooois";
        }
        //'!' means "not," so this part of the condition will be true if "condition" is NOT equal to "anotherCondition"
        else if (condition != anotherCondition || x + y == 4.0) {
            s = "Whyyyyyyyy";
        }
        else {
            s = "Unfortunate.";
        }
        return s;
    }

    //Congratulations, you learned how to use methods, variables, and if-elseif-else statements!
    //Move on to "Main" to learn about loops and objects!


}
