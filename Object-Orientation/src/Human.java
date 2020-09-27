// This class will allow us to create objects of type Human
// Classes basically contain instructions on how objects 
// should be created or how should they behave in the 
// application

public class Human {
	
	// Declaring human attributes
	String name;
	int age, heightInInches;
	String eyeColor;
	
/*	// Defining the Human Constructor()
	public Human() {	
		age = 5;			
		eyeColor = "brown";
		heightInInches = 72;
		name = "Tom Wilson";	
	}							*/
	
	// Defining the Human Constructor()
	public Human(String name, int age, int heightInInches, String eyeColor) {
		super();
		this.name = name;
		this.age = age;
		this.heightInInches = heightInInches;
		this.eyeColor = eyeColor;
		
		// Constructor have the exact same name as its class
	}
	
	
	
	// Defining human behaviors 
	public void speak() {
		System.out.println("Hello! My name is " + name);
		System.out.println("I'm "+ heightInInches +" inches tall");
		System.out.println("My eye color is "+ eyeColor);
	}
	
	
	public void eat() {
		System.out.println("eating...");
	}
	
	public void walk() {
		System.out.println("walking...");
	}
	
	public void work() {
		System.out.println("working...");
	}

}

// Using this human class we will be able to create as many
// human objects in our world as we please

// Constructor() - is a special method that provides a way to 
// construct objects.
