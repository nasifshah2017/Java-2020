
public class Fish extends Animal {
	
	public Fish(int age, String gender, int weightInLbs) {
		super(age, gender, weightInLbs);
		// TODO Auto-generated constructor stub
	}

	// Defining the method (work) for each object created from this class
	public void swim() {
		System.out.println("Swimming...");
	}

	
	// Defining the abstract class. Each animal has it own 
	// method definition (body) for its move() method
	public void move() {
		System.out.println("fish is swimming");
		
	}

}
