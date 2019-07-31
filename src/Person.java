//many classes are written to be like "custom" variables (referred to as objects)
//A good example is the String class

public class Person {

    int age;
    String firstName;
    String lastName;

    //notice how none of the methods or variables here are 'static.' This is because they are specific to each object called
    //what this means is that if I were in 'Main.java', I could call p1.getName(), but not Person.getName()

    //notice how there are no return types for this method. That is because it is a constructor for this class
    //Constructors are called when you instantiate an object. They are used to set the instance variables of that object
    public Person(String first, String last) {
        firstName = first;
        lastName = last;
        age = 0;
    }

    //You can have multiple constructors that take in different parameters, but they can't be of the same types.
    //E.G. I can't make another constructor that takes in 2 Strings, but I can do this
    public Person(String first, String last, int age) {
        firstName = first;
        lastName = last;

        //"this" is used to refer to the instance variable, because when there is a conflict with the names, Java will use
        //the most local variable.
        this.age = age;
    }

    //This is an "accessor" method. It returns an instance variable
    //because of their simplicity, it is common to abbreviate them to 1 line make reading code easier
    public int getAge() { return age; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }

    //Technically not an accessor method since it is processing instance variables and returning something from that
    //Abbreviating would probably still be fine, but I didn't because it's returning multiple variables
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
