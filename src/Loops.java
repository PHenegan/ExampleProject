public class Loops {

    static boolean bool = true;
    public static void main(String[] args) {

        //Imagine you want to do something multiple times, like this. It makes code long and annoying to read.
        if (bool) {
            System.out.println("the value is true");
        }
        if (bool) {
            System.out.println("the value is true");
        }
        if (bool) {
            System.out.println("the value is true");
        }
        //that's where loops come in! They allow you to repeat something multiple times
        int n = 0;

        /*
        This is a while loop. While the condition in the parentheses is true, the code in the block will continue to run
        Note that it is possible to make this run forever. You should avoid those conditions
         */
        while(n < 3) {
            if (bool) {
                System.out.println("the value is true");
            }
            n++;
        }

        //this isn't always the most clean though. You need to have a new variable for each loop

        /*
        That is where for loops come in! They can do the exact same thing as while loops, but in many cases will look cleaner
        There is a lot of stuff here, and it looks really complicated at first, but it is simpler than it seems
            - i is the counter variable. It functions the same as n in the last example.
            - i < 3 is the condition that will be checked each time the loop runs. It is similar to the condition of a while loop
            - i++ is executed after each iteration of the loop. It is the sam as the n++ statement at the end of the last example
         */
        for(int i = 0; i < 3; i++) {
            if (bool) {
                System.out.println("the value is true");
            }
        }

        twoDLoop(5, 5);
    }

    public static void twoDLoop(int rows, int cols) {
        //This is a 2D loop. It will create a box like area (easier to visualize when you see the print statement)
        for(int row = 1; row <= rows; row++) {
            for (int col = 1; col <= cols; col++) {

                //System.out.print() does the same thing as System.out.println(), but doesn't make a new line
                //Understanding this part will help when you run this, but it's taking the current column number
                //and adding it the last number in the previous row
                System.out.print(col + (row - 1) * cols + " ");
            }
            //this creates a new line to distinguish the rows
            System.out.println("");
        }
    }
}
