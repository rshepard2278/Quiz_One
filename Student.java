
/**
 * This class creates a student object with
 * three variables age, cost, and lastName.
 * All variables are initialized to a default within
 * the constructor
 * 
 * @author Richard Sheprard
 * @version 2.8.2015
 */
public class Student {
    // instance variables - replace the example below with your own
    private int age;
    private double cost;
    private Name lastName;

    /**
     * Constructor for objects of class Student
     */
    public Student() {
       age = 28;
       cost = 115.15;
       lastName = new Name("Shepard");
    }

    /**
     * Sets the age variable to the parameter age
     *
     * @param age 
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Sets the cost variable to the parameter cost
     *
     * @param cost 
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

    /**
     * Sets the lastName field of the name object to the parameter lastName
     *
     * @param lastName 
     */
    public void setLastName(String lastName) {
        this.lastName.setLastName(lastName);
    }

    /**
     * Returns the value of the age variable
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * Returns the value of the cost variable
     *
     * @return cost
     */
    public double getCost() {
        return cost;
    }

    /**
     * returns The lastName field of the lastName object
     *
     * @return The lastName field of the lastName object
     */
    public String getLastName() {
        return lastName.getLastName();
    }
    
    /**
     * This method has a locally-scoped constant and variable that 
     * are used to calculate tax and add that amount to the cost field
     */
    public void addTax() {
        final double TAX_PECENTAGE = 0.06;
        double taxAdded = cost * TAX_PECENTAGE;
        cost += taxAdded;
    }
}
