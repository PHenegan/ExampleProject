public class IfElse {

    //'private' means that the only class that can access this variable is this class
    private static boolean isTrue;
    private static int x;
    private static int y;

    public static void main(String[] args) {
        x = 76;
        y = -2;

        //if x > y, this variable will be true. Otherwise, it will be false.
        isTrue = x > y;
        System.out.println("x > y: " + isTrue);

        //'&&' represents 'and.' If both of those conditions are true, then the value will result in true.
        //Otherwise, it will be false
        isTrue = (x > y) && (y >= 0);
        System.out.println("x > y and y >= 0: " + isTrue);

        //'||' represents 'or.' If either one of these conditions is true, then the value will result in true.
        //Notice how '==' is used instead of '=' You have to do this whenever you are comparing values for a boolean
        isTrue = (y == 0) || (x <= 100);
        System.out.println("y = 0 or y >= 0: " + isTrue);

        /*
        This is an if statement. The code inside of the block, or {  }, will run when the condition inside (  ) is true.
        If it is immediately followed by an else statement, that code will be run when the boolean inside is false.

        NOTE - an if statement DOES NOT have to be followed by an else statement
         */
        if ((double) x / y >= 5.0) {
            System.out.println("x is at least 5 times greater than y");
        }
        else {
            System.out.println("x is a not a large boi compared to y");
        }



        if (x + y > 75) {
            System.out.println("x + y > 75");
        }
        //this is an else if statement. It will check for another condition **if the first condition is not met**
        //Note that you can have as many else if statements in between an "if" and "else" statement if you want
        else if (y >= -x) {
            System.out.println("y >= -x");
        }
        //if neither of the above statements are true, it will run this.
        else {
            System.out.println("Idk what to put here");
        }

        //Yay, you finished learning about If-Else statements! Go onto "Loops.java" now
    }

}
