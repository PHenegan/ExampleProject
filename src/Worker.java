/*
This class extends 'Person.java.' That means it inherits all of the methods of the class it extends
However, that "parent" class doesn't have access to the methods or values in this class.
Think of it like "A square is a rectangle, but a rectangle is not a square"
"a subclass (e.g. Worker) is a superclass (e.g. Person) but a superclass is not a subclass"
"A Worker is definitely a Person, but a Person is not necessarily a Worker"
*/
public class Worker extends Person {
    private double balance;
    private double income;

    public Worker(String firstName, String lastName, int age, double income, double balance) {
        //this is like this(), but it calls the constructor of the superclass (the class above it)
        //this is important, because all of the variables are stored as private, so this class can't access its superclass's
        //data directly, and you would have to change or get values through methods.
        super(firstName, lastName, age);

        this.income = income;
        this.balance = balance;
    }

    //Another constructor that where the balance is defaulted to 0
    public Worker(String firstName, String lastName, int age, double income) {
        this(firstName, lastName, age, income, 0);
    }

    //I couldn't think of a better name here, there probably is one
    public void payroll(int hours) {
        balance += income * hours;
    }

    public double getBalance() {
        return balance;
    }
    public double getIncome() {
        return income;
    }

    public void overtime(int hours) {
        //you get paid a little bit more for working overtime
        //I don't think this is actually how it works, I just needed an idea for a method
        balance += 1.1 * income * hours;
    }
}