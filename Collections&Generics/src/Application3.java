import java.util.HashSet;
import java.util.LinkedHashSet;

public class Application3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> values = new HashSet<Integer>();
		
		// HashSet does not store repeated values (duplicate values)
		values.add(12);
		values.add(43);
		values.add(15);
		values.add(67);
		values.add(43);
		
		// Traversing through the HashSet using a for-each loop
		for(Integer i : values) {
			System.out.println(i);
		}
		
		// Output: 	67
		//			43
		//			12
		//			15
		
		// 43 just showed up 1 time because HashSet does not store
		// duplicate values plus it does not restrict to store those
		// values by showing an error, instead it just does not show
		// it
		
		// Also in Arrays, all values are stored in order according
		// to their index but in a HashSet there is no order, the 
		// output is different than the way we stored the values
		
		// If we really want our values to be stored in order then 
		// we can use LinkedHashSet and it does maintain the order
		
		LinkedHashSet<Integer> store = new LinkedHashSet<Integer>();
		
		// HashSet does not store repeated values (duplicate values)
		store.add(12);
		store.add(43);
		store.add(15);
		store.add(67);
		store.add(43);
		
		// Traversing through the HashSet using a for-each loop
		for(Integer i : store) {
			System.out.println(i);
		}
		
		// Output: 	12
		//			43
		//			15
		//			67
		
		// As it can be seen that all the values are stored in order
		// using the LinkedHashSet
		
		HashSet<Animal> animals = new HashSet<Animal>();
		
		Animal animal1 = new Animal("Dog", 12);
		Animal animal2 = new Animal("Cat", 8);
		Animal animal3 = new Animal("Bird", 3);
		Animal animal4 = new Animal("Dog", 12);
		Animal animal5 = new Animal("Kangaroo", 24);
		
		animals.add(animal1);
		animals.add(animal2);
		animals.add(animal3);
		animals.add(animal4);
		animals.add(animal5);
		
		for(Animal i : animals) {
			System.out.println(i);
		}
		
		// Output: 	Animal [name=Dog, age=12]
		//			Animal [name=Bird, age=3]
		//			Animal [name=Kangaroo, age=24]
		//			Animal [name=Cat, age=8]
		//			Animal [name=Dog, age=12]
		
		// What we have here are objects and HashSet stores duplicate
		// objects as it cannot identify the hash codes inside these
		// objects, to make it again store unique values we need to
		// generate hashCode() and equals() in our Animal class file
		// and doing so it will again store unique values. Thus, the 
		// output will be as follows:
		
		// Output: 	Animal [name=Dog, age=12]
		//         	Animal [name=Bird, age=3]
		//			Animal [name=Kangaroo, age=24]
		//			Animal [name=Cat, age=8]

		
		

	}

}
