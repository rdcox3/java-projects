/*
Ron Cox
Java 605.201.83
Assignment 6

*/

public class Name {
    private String firstName;
    private String lastName;

    // Constructor without validation
    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    // Setters without validation
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // toString method
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }//end class Name
}
