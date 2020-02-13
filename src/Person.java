//many classes are written to be like "custom" variables (individually referred to as objects)
//A good example is the String class
public class Person {

    //Each object created from the class will have its own values for all of these. that is why they are not marked
    //as 'static'
    //It is generally good practice to make these variables private, because you don't really want other code to
    //be able to access these values. Instead they should get them through methods such as getAge() or getFirstName()
    private int age;
    private String firstName;
    private String lastName;

    //There will only ever be one population at any given time, and changing it for one object will change it for
    //every object. This is because it is labelled as static
    private static int population;

    //This is a constructor. It gets called when you run "new Person( ... )"
    //They only really exist to give the instance variables values, which is why they have no return types (not even void)
    public Person(String first, String last, int age) {
        firstName = first;
        lastName = last;

        //"this" is used to refer to the instance variable, because when there is a conflict with the names, Java will use
        //the most local variable.
        this.age = age;

        population++;
    }

    //You can have multiple constructors that take in different parameters, but they can't be of the same types.
    //E.G. I can't make another constructor that takes in 2 Strings and an int, but I can do this
    public Person(String first, String last) {
        //'this()' is a way of calling another constructor in the same class
        this(first, last, 0);
    }

    //This is an "accessor" method. It returns an instance variable
    //because of their simplicity, it is common to abbreviate them to 1 line make the code easier to read
    public int getAge() { return age; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }

    //You can still have static methods, even though most of them aren't
    public static int getPopulation() { return population; }


    public String getFullName() {
        return firstName + " " + lastName;
    }

    /*
    This is the method called when objects are used in Strings.
        - E.G. '"a string" + p1' is the same as '"a string" + p1.toString()'
     */
    public String toString() {
        return getFullName();
    }

    //These are mutator methods. they modify instance variables
    public void setAge(int n) {
        age = n;
    }
    public void incrementAge() {
        age++;
    }

}

