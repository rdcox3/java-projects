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
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    // Getters
    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    // Setters
    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    // toString method
    @Override
    public String toString() {
        return street + ", " + city + ", " + state + " " + zipCode;
    }//end class Addresss
}
