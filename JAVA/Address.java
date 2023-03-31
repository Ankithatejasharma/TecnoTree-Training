//Address
package com.assg2;

public class Address {
	String street;
    String city;
    String state;
    String zipCode;
    String country;

    public Address(String street, String city, String state, String zipCode, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address addr = new Address("123 Main St", "Mysuru", "Karnataka", "570004", "India");
		
		addr.setStreet("123 Street");

        System.out.println("Street: " + addr.getStreet());
        System.out.println("City: " + addr.getCity());
        System.out.println("State: " + addr.getState());
        System.out.println("Zip Code: " + addr.getZipCode());
        System.out.println("Country: " + addr.getCountry());

	}

}
