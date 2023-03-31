//Animal Class
package com.assg2;

public class Animal {
	String name;
    String species;
    int age;
    double weight;
    
    public Animal(String name, String species, int age, double weight) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.weight = weight;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getSpecies() {
        return species;
    }
    
    public void setSpecies(String species) {
        this.species = species;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Animal animal = new Animal("Tyson", "Dog(GermanShepherd)", 4, 5.5);
	        
	        // change the animal's weight to 6.0 pounds
	        animal.setWeight(6.0);
	        
	        // print out the animal's information
	        System.out.println("Name: " + animal.getName());
	        System.out.println("Species: " + animal.getSpecies());
	        System.out.println("Age: " + animal.getAge());
	        System.out.println("Weight: " + animal.getWeight() + " pounds");

	}

}
