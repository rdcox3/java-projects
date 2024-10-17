/*
Ron Cox
Java 605.201.83
Assignment 6

*/

public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;

    // Constructor
    public Address(String street, String city, String state, String zipCode) {
        if (street.isBlank() || city.isBlank() || state.isBlank() || zipCode.isBlank()) {
            throw new IllegalArgumentException("All address fields must not be blank.");
        }
        if (state.length() != 2 || zipCode.length() != 5) {
            throw new IllegalArgumentException("State must be 2 characters and zip code must be 5 digits.");
        }
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    // Getters and Setters
    // Implement getters and setters here following the pattern from the Name class
    // Ensure to include validations similar to the constructor for state and zipCode

    // toString method
    @Override
    public String toString() {
        return street + ", " + city + ", " + state + " " + zipCode;
    }//end class Address
}
