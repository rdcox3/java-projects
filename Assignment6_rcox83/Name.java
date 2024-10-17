/*
Ron Cox
Java 605.201.83
Assignment 6

*/

public class Name {
    private String firstName;
    private String lastName;

    // Constructor
    public Name(String firstName, String lastName) {
        if (firstName.isBlank() || lastName.isBlank()) {
            throw new IllegalArgumentException("First name and last name must not be blank.");
        }
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

    // Setters
    public void setFirstName(String firstName) {
        if (firstName.isBlank()) {
            throw new IllegalArgumentException("First name must not be blank.");
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName.isBlank()) {
            throw new IllegalArgumentException("Last name must not be blank.");
        }
        this.lastName = lastName;
    }

    // toString method
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }//end class Name
}
