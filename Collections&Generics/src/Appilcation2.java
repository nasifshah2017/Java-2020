import java.util.ArrayList;

public class Appilcation2 {

	public static void main(String[] args) {
		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("Lion");
		animals.add("cat");
		animals.add("Dog");
		animals.add("Bird");
		
//		for(int i = 0; i < animals.size(); i++) {
//			System.out.println(animals.get(i));
//		}
//		
//		for(String i : animals) {
//			System.out.println(i);
//		}
		
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		
		// Two ways of declaring instance of an Object:
		
		
		Vehicle vehicle2 = new Vehicle("Toyota", "Camry", 12000, false);
		
		vehicles.add(new Vehicle("Honda", "Accord", 12000, false)); // 1
		vehicles.add(vehicle2);										// 2
		
		vehicles.add(new Vehicle("Jeep", "Wrangler", 25000, true));
		
		// Traversing through the vehicles array using a for loop
		
		for(Vehicle i : vehicles) {
			System.out.println(i);
		}
		
		for(Vehicle i : vehicles) {
			System.out.println(i.getMake());
			System.out.println(i.getModel());
			System.out.println(i.getPrice());
		}
	}

}
