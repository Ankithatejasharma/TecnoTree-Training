//Personal details of a person
package com.assg2;

public class Person {
	String name;
    int age;
    String address;
    String phoneNumber;
    String emailAddress;
    
    public Person(String name, int age, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public String getEmailAddress() {
        return emailAddress;
    }
    
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Person person = new Person("Ankitha", 20, "Mysuru", "9087654321", "ankitha@tecnotree.com");
        
        person.setPhoneNumber("9900201902");
        
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Address: " + person.getAddress());
        System.out.println("Phone number: " + person.getPhoneNumber());
        System.out.println("Email address: " + person.getEmailAddress());
		

	}

}
