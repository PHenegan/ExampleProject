//many classes are written to be like "custom" variables (referred to as objects)
//A good example is the String class

public class Person {

    //Each object created from the class will have its own values for all of these. that is why they are not marked
    //as 'static'
    private int age;
    private String firstName;
    private String lastName;

    //There will only ever be one population at any given time, and changing it for one object will change it for
    //every object.
    public static int population;

    //notice how there are no return types for this method. That is because it is a constructor for this class
    //Constructors are called when you instantiate an object. They are used to set the instance variables of that object
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

    //These are mutator methods. they modify instance variables
    public void setAge(int n) {
        age = n;
    }
    public void incrementAge() {
        age++;
    }
}

