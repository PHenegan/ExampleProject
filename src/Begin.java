//These are comments. They are ignored by code. '//' at the beginning of a line tells Java this.

/*
They can also be written like this, in blocks
Everything between these symbols is a comment.
 */

/**
 * This is documentation. It is used to describe what a class, method, etc. does.
 * It allows people to use someone else's classes without having to read the code.
 */

//When naming a class, the first letter of each word should be capital
public class Begin {

    //These are variables, which store a value of something (like variables in math)
    //ignore the 'static' part for now, it will be explained later on.
    //'public' before the variable type means that you can access it from other classes

    //ints are integers or whole numbers
    public static int n;
    public static int x = 3;

    //doubles are numbers with decimal points after them
    public static double dec = 7.8;

    //chars are characters
    public static char c = 'a';
    public static char c2 = ' ';

    //booleans represent values that can be either true or false
    public static boolean isHarryBad = true;

    //Strings are words
    public static String name = "Henry";
    //notice that the S is capital in String. This is because it is technically an object, but you don't need
    //to worry about that now, just remember that the S is capital.

    //The names of variables usually follow camelCase, where the first letter of the first word is lowercase
    //and the first letter of any following word is uppercase
    //this is not necessary (names are arbitrary) but is common practice
    public static int theBestNumber = 42;

    /*
    This is a method (or function, depending on the programming language). It takes in code, and can either change it
    or use it to produce an output
        - 'public' means that the method can be used in other classes
        - again, you can ignore static for now
        - 'void' means that it isn't going to give back a value
        - 'String[] args' can also be ignored, but is needed for the main method (which is the first code to be run)
    */
    public static void main(String[] args) {
        //after a variable is defined, its values can be changed.
        n = 7;
        c = '/';

        //int n = 8;
        //that won't work because n has already been defined somewhere, and Java thinks you're trying to make a new variable

        //this is a print statement. It will print something to the console.
        System.out.println("Hello World!");

        //Other variables can be added to strings like this. However, note that with numbers it will add the character,
        //and won't actually do any math
        System.out.println("5 + 6 = " + 5 + 6);

        //to have this work correctly, you can do this, similarly to how PEMDAS works
        System.out.println("5 + 6 = " + (5 + 6));


        //look at the methods below to see what is going on with these statements
        System.out.println("Distance: " + distance(0,0, 3,4));

        System.out.println(doStuff());

        System.out.println(div(5, 3));
        System.out.println(newDiv(5,3));

    }

    //This is an example of a method that will output a double.
    //The variables on the inside of the parentheses are the inputs, which the method will need to run
    public static double distance(double x1, double y1, double x2, double y2) {

        //variables can also be defined within methods and other blocks of code (which you'll see later)
        //however, these variables can only be accessed here.
        double dx = x2 - x1;
        double dy = y2 - y1;

        //this is a return statement. It will stop running the method and send back that number.
        return dx * dx + dy * dy;
    }

    //This is an example of a method that doesn't take in any inputs but can still produce an output;
    public static int doStuff() {
        int c = n * x / (n + x); //you can use parentheses just like in regular math.

        return c;
    }
    public static double div(int x, int y) {
        //because those are 2 ints, Java will cut off any decimal point (NOT ROUND) from the int
        return x / y;
    }
    public static double newDiv(int x, int y) {
        //this statement makes Java look at x as a double. This will cause the whole statement to output a double
        //doing this is called "casting." you are casting x to a double
        return (double)x / y;
    }

    //Yay! You've learned about variables and methods!
    //move onto IfElse.java now!
}
