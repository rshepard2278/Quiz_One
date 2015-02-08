
/**
 * This class creates a name object with one field that 
 * holds a string value of lastName.
 * 
 * @author Richard Shepard
 * @version 2.8.2015
 */
public class Name {
   
    private String lastName;

   
    /**
     * Sets the lastName variable to the parameter that is
     * passed to the constructor
     *
     * @param lastName A parameter
     */
    public Name(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Sets lastName to a string variable
     *
     * @param lastName 
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    /**
     * Returns that variable lastName
     *
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }
    
}
