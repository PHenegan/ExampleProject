/*
This class extends 'Person.java.' That means it inherits all of the methods of the class it extends
However, that "parent" class doesn't have access to the methods or values in this class.
Think of it like "A square is a rectangle, but a rectangle is not a square"
"a subclass (e.g. Worker) is a superclass (e.g. Person) but a superclass is not a subclass"
"A Worker is definitely a Person, but a Person is not necessarily a Worker"
*/
public class Worker extends Person {
    private String title;
    private String company;

    public Worker(String firstName, String lastName, int age, String title, String company) {

        /*
        super() calls the constructor of the parent class, because this class can't directly access the instance variables
        of the parent class (they are private)
            - Worker can't directly refer to 'age', 'firstName', or 'lastName'
         */
        super(firstName, lastName, age);

        //setting the instance variables of 'Worker' like normal
        this.title = title;
        this.company = company;
    }

    public Worker(String firstName, String lastName, int age, String company) {
        //using super() here is unnecessary because it gets called in the other constructor
        this(firstName, lastName, age, "Unpaid-Intern",company);
    }

    //accessor methods for the new instance variables
    public String getTitle() { return title; }
    public String getCompany() { return company; }

    //you can rewrite methods that were in the parent class
    public String toString() {
        //super.toString is calling the toString() in Person.java
        return super.toString() + " - " + title + " at " + company;
    }
}