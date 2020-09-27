import java.util.ArrayList;
import java.util.LinkedList;

public class Application {

	public static void main(String[] args) {
		ArrayList words = new ArrayList();	// Declaring a new array
		words.add("hello");					// Adding new items in an array
		words.add("there");					
		words.remove(0);					// Removing an item from the array
		words.add(10);
		words.add(9);
		words.add(12.00);
		words.add('H');
		
		
		// When you are not type-casting, your array will
		// not have any restriction as what data-type of 
		// values you add to your array.
		
		// To get an item from the array list and store it
		// inside a variable we do the following
		
		
//		String item1 = words.get(0);
		
		
		// The problem is the .get() method above will return an
		// object rather than a value of type string, though when
		// we stored our first value at the 0th index we stored it
		// as a string but in Java it returns us an object instead
		// of the value that we stored. So, we need type-cast the 
		// object which will convert it to the value of the type
		// we are type-casting like following,
		
		
		String item1 = (String) words.get(0);
		System.out.println(item1); 				// there
		
		// Now we converted the object that we received using the 
		// .get() method into string. 
		
		// This is how Java used to work with Arrays before the 
		// introduction of Generics. Generics provides us the 
		// with the opportunity to insert only one type of values
		// inside an array. 
		
		ArrayList<String> store = new ArrayList<String>();
		store.add("hello");
		store.add("there");
		store.add("10");
		
		String element1 = store.get(2);			// 10
		
		System.out.println(element1);
		
		// As it can be seen, we have type-casted our array using 
		// Generics. And we have assigned it as String type arrays,
		// so now we can only store string values inside this array.
		
		// Linked Lists sort of work the same way as arrays, the only
		// thing is we cannot use primitive data-types like int, double
		// floats instead we need to use wrapper classes Integer, Floats, 
		// Double etc.
		
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		
		// Adding numbers in our Linked List
		
		numbers.add(100);
		numbers.add(200);
		numbers.add(450);
		numbers.add(1000);
		
		// Using a For-Each loop to traverse through out Linked List
		
		for(int i : numbers) {
			System.out.println(i);
		}
		
		// Removing items from the linked list
		
		numbers.remove(1);
		numbers.remove(2);
		
		for(int i : numbers) {
			System.out.println(i);
		}
	}

}
