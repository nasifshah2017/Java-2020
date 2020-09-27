
public class Zoo {
	
	public static void main(String[] args) {
		
/*		Animal animal1 = new Animal(12, "M", 23);
		
		// Making our Object perform one of the works (methods)
		animal1.eat();
		
		Bird bird1 = new Bird(3, "F", 10);
		
		bird1.sleep();
		
		Chicken chick1 = new Chicken(1, "M", 7);
*/
		
		Animal sparrow1 = new Sparrow(1, "M", 4);
		sparrow1.move();		// Flapping wings...
		
		Animal fish1 = new Fish(1, "M", 2);
		fish1.move();			// fish is swimming...
		
		moveAnimal(fish1);		// fish is swimming...
		
		moveAnimal(sparrow1);	// Flapping wings...
	}
	
	// Polymorphism 
	
	public static void moveAnimal(Animal animal) {
		animal.move();
	}
}
