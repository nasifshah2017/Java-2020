
public class Sparrow extends Bird implements Flyable {

	public Sparrow(int age, String gender, int weightInLbs) {
		super(age, gender, weightInLbs);
		// TODO Auto-generated constructor stub
	}

	
	public void fly() {
		System.out.println("Sparrow flying high...");
		
	}
	
	// We added the Flyable interface is because
	// there are birds like chickens who cannot fly
	// so we cannot use the fly method for all birds
	// inside the Bird class object, thats why we 
	// define this fly() by defining its own class
	// called Flyable. A method with its own class is
	// call the Interface.

}

// An Abstract class is basically a regular class, it can have 
// methods in it, it can have method bodies in it, but the keyword
// here is abstract. An abstract class can only be extended, we 
// cannot instantiate an instance of an abstract class. 

// An Abstract class is only meant to be a parent of other
// classes but it cannot be a child to any class. 
