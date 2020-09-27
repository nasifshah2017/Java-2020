
public abstract class Animal {
	
	int age;
	String gender;
	int weightInLbs;
	
	// Declaring the constructor()
	public Animal(int age, String gender, int weightInLbs) {
		super();
		this.age = age;
		this.gender = gender;
		this.weightInLbs = weightInLbs;
	}
	
	// Defining class methods 
	public void eat() {
		System.out.println("Eating...");
	}
	
	public void sleep() {
		System.out.println("Sleeping...");
	}
	
	// Declaring an Abstract class
	public abstract void move();
	
	// The Abstract class does not have a body
	// Thats because different animals move differently
	// and we declared here as a very general method
	// where we have abstracted away its body. 
	

}
