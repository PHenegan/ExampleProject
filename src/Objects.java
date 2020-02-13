//NOTE - I tried to write this so that you can look at this file before looking at 'Person.java' but if you are confused,
//       try checking that file out.
public class
Objects {

    //this is an object. There is no "variable" type Person, and the only reason I can do this is because there is a
    //'Person.java' file
    //An easy way to think about objects is that they are "things" anything that can be a "thing" can be an object.
    // E.G. A person is a thing, but running is not a thing, it is an action.

    public static Person p;
    public static Person p2;


    public static Worker w1;

    //remember how Strings are objects? Somewhere in the Java libraries, there is a 'String.java' that makes up all
    //of the code for a String.
    public static String word;

    public static void main(String[] args) {
        //This is how you define an object.
        //The values that it takes in (in this case the person's first name, last name, and age) are defined in the class
        p = new Person("Bob", "McBobface", 30);

        //This is technically the "proper" way to define a String, but it really doesn't matter
        word = new String("No one does this");

        //These are examples of how you can access methods from objects. These methods can modify, obtain, or
        //manipulate data from the object.
        System.out.println(p.getLastName());
        System.out.println(word.length());

        //These are examples of how you call a static method from a class
        Loops.twoDLoop(2, 2);

        //This shows off the static population variable in 'Person.java'
        System.out.println(Person.getPopulation());

        p2 = new Person("Larry", "Jonkuns", 25);
        System.out.println(Person.getPopulation());

        //Once you have gotten here, read the 'Worker.java' file

        //w1 = new Worker("Walter", "Dio", );
    }
}
