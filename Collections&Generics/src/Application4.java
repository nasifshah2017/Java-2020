import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Application4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(12);
		list1.add(43);
		list1.add(15);
		list1.add(67);
		list1.add(43);
		
		ArrayList<Integer> newList = new ArrayList<Integer>();
		newList.add(10);
		
		// Merging newList to list1
		
//		list1.addAll(newList);
		
//		System.out.println(list1);
		
		// Output: [12, 43, 15, 67, 43, 10]
		
		// Removes all the items of newList from list1
		
//		list1.removeAll(newList);
		
		// Output: [12, 43, 15, 67, 43, 10, 43]
		
		// Now if we have same numbers in list1 and newList
		// and we run list1.removeAll(newList), then those 
		// numbers that are common in both lists are also 
		// going to be removed
		
		list1.add(20);
		list1.add(80);
		list1.add(50);
		newList.add(20);
		newList.add(80);
		newList.add(50);
		
		// Merging newList with list1
		
		list1.addAll(newList);
		
		System.out.println(list1);
		
		// Output: [12, 43, 15, 67, 43, 20, 80, 50, 10, 20, 80, 50]
		
		// Removing the newList from list1
		
		list1.removeAll(newList);
		
		System.out.println(list1);
		
		// Output: [12, 43, 15, 67, 43]

		// As it can be seen all the common numbers between newList
		// and the list1 got deleted. 
		
		// The .clear() method deletes all the item from a list
		
		// list1.clear()      // []
		
		// If we want to figure out if a certain item exists in a 
		// list then we call the .contain() method
		
		boolean hasValue = list1.contains(15);
		
		System.out.println(hasValue); 			// true
		
		
		HashSet<Integer> hashSet = new HashSet<Integer>();
		
		hashSet.add(12);
		hashSet.add(14);
		hashSet.add(32);
		hashSet.add(36);
		hashSet.add(50);
		hashSet.add(45);
		hashSet.add(88);
		hashSet.add(75);
		hashSet.add(90);
		hashSet.add(50);
		
		// Now there is a way to sort HashSet using the sort method,
		// the only problem is the .sort() method does not accept
		// HashSet as an argument, it only accept Lists, so we need 
		// to convert a HashSet into a List and then sort it. 
		
		// Converting HashSet to a List
		
		ArrayList<Integer> myList = new ArrayList<Integer>(hashSet);
		
		// Now as it the HashSet gets converted to a List we can sort
		// it
		
		Collections.sort(myList);
		
		System.out.println(myList);
		
		// Output: [12, 14, 32, 36, 45, 50, 75, 88, 90]
		
		// As we can see the list got sorted out from smallest to largest
		
		// This type of sorting can also be done on String values 
		
		HashSet<String> words = new HashSet<String>();
				
				words.add("John");
				words.add("Tom");
				words.add("Shawn");
				words.add("Rachel");
				words.add("Tina");
				words.add("Emily");
				words.add("Molly");
				words.add("Ted");
				words.add("Emma");
				words.add("Tracy");
				
		ArrayList<String> names = new ArrayList<String>(words);
		
		Collections.sort(names);
		
		System.out.println(names);
		
		// Output: [Emily, Emma, John, Molly, Rachel, Shawn, Ted, Tina, Tom, Tracy]
		
		// So here the list got sorted alphabetically 
		
		
		// Sorting on user-defined types (Objects/Classes)
		
		HashSet<Employee> employee = new HashSet<Employee>();
		
		employee.add(new Employee("Mike", 3500, "Accounting"));
		employee.add(new Employee("Paul", 1750, "Information Tech"));
		employee.add(new Employee("Luke", 1850, "Finance"));
		employee.add(new Employee("Harry", 2000, "Electronics"));
		
		ArrayList<Employee> employeeList = new ArrayList(employee);
		
		Collections.sort(employeeList);
		
		System.out.println(employeeList);
	}

}
